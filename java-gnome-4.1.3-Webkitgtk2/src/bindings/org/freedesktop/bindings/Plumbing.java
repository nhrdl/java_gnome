/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2006-2010 Operational Dynamics Consulting, Pty Ltd and Others
 *
 * The code in this file, and the program it is a part of, is made available
 * to you by its authors as open source software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License version
 * 2 ("GPL") as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GPL for more details.
 *
 * You should have received a copy of the GPL along with this program. If not,
 * see http://www.gnu.org/licenses/. The authors of this program may be
 * contacted through http://java-gnome.sourceforge.net/.
 *
 * Linking this library statically or dynamically with other modules is making
 * a combined work based on this library. Thus, the terms and conditions of
 * the GPL cover the whole combination. As a special exception (the
 * "Classpath Exception"), the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent modules,
 * and to copy and distribute the resulting executable under terms of your
 * choice, provided that you also meet, for each linked independent module,
 * the terms and conditions of the license of that module. An independent
 * module is a module which is not derived from or based on this library. If
 * you modify this library, you may extend the Classpath Exception to your
 * version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 */
package org.freedesktop.bindings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.HashMap;

import org.gnome.gtk.Gtk;

import static org.freedesktop.bindings.Version.getVersion;

/**
 * Parent of all classes in the translation layer of a bindings library. This
 * class provides the infrastructure (or, "plumbing") that the generated code
 * can access the native values held within Proxy, Constant, etc.
 * 
 * <p>
 * <i><b>No one using developing applications which happen to use bindings
 * based on this package should ever need to see, use, or subclass, this.</b>
 * People hacking on the bindings themselves will end up call generated or
 * crafted methods in the translation layer, but they too will never have to
 * use these mechanisms directly. Note that individual library families will
 * likely subclass this to extend its instance lookup behaviour in a manner
 * appropriate to the type systems in use within those libraries.</i>
 * 
 * @author Andrew Cowie
 * @author Vreixo Formoso
 * @since 4.0.0
 */
public abstract class Plumbing
{
    protected Plumbing() {}

    /**
     * Every Proxy that gets created gets added to this Map so that if a call
     * down to the native layer returns an object that has already been
     * created Java side that instance is returned rather than creating a new
     * one.
     */
    static final HashMap<Long, WeakReference<Proxy>> knownProxies;

    /**
     * When Enums get created, we add them to this Map so we can find an
     * appropriate instance for a given ordinal. The table is two tier:
     * 
     * Class => ArrayList[Constant+]
     */
    /*
     * Neither keys nor values are to be weak references here; we are not
     * unloading Constant classes so the Class keys will stay strongly
     * reachable; the Constant instances themselves will always be present by
     * virtue of their being in this two tier table.
     */
    static final HashMap<Class<? extends Constant>, HashMap<Integer, Constant>> knownConstants;

    /**
     * The ClassLoader in use. This is for use by the various places where
     * Class.forName() is being called.
     */
    protected static final ClassLoader loader;

    static {
        /*
         * TODO: any particular reason to pick a starting array size?
         */
        knownProxies = new HashMap<Long, WeakReference<Proxy>>();
        knownConstants = new HashMap<Class<? extends Constant>, HashMap<Integer, Constant>>();
        loader = Plumbing.class.getClassLoader();

        loadNativeCode();
    }

    /**
     * Was java-gnome safely initialized by properly calling Gtk.init()?
     */
    /*
     * This class does NOT call this, and nor dies Glib's Plumbing; there are
     * methods there that are allowed on the pre-init code path. And the
     * boolean being checked here is set BEFORE the call to GtkMain.init()
     * fires off the static initializers in the Plumbing classes, which is it
     * will be set if Gtk.init() has been called.
     */
    protected static void isLibraryReady() {
        if (!Gtk.isInitialized()) {
            throw new FatalError(
                    "\n\nYou *must* call Gtk.init() before using anything else in java-gnome!\n");

        }
    }

    private static final String LIBDIR_FILE = ".libdir";

    /**
     * Load the native library. The governing assumption is that the .jar
     * created "in-place" does NOT have the libdir file; it is appended to the
     * .jar during the `make install` step.
     * 
     * <p>
     * The root name "libgtkjni" is historical. We've left it as is because
     * there's no burning need to further pollute the system library space
     * (although we will change it if we ever start constructing different .so
     * for different dependencies).
     */
    /*
     * We go through quite some hoop jumping in the fallback case. If we were
     * just concerned with things being run from a java-gnome checkout, then
     * libdir could hae been set to relative path "tmp" and been done with it.
     * 
     * But since an "in-place" build can be used from an arbitrary external
     * location, we need to work out the URL of the .jar file that was
     * referenced in the first place and use that to find the directory to use
     * as libdir.
     * 
     * The code path to do this is insane, but not to worry - this stuff is
     * already loaded by the VM so it doesn't cost anything being here.
     * 
     * Conveniently, this also works if you have tmp/bindings/ as the
     * classpath, as getParent() extracts the URL of that to .../tmp/ which is
     * what we want.
     */
    private static final void loadNativeCode() {
        final InputStream in;
        final BufferedReader reader;
        String libdir;
        final ProtectionDomain domain;
        final CodeSource source;
        final URL url;
        String jar;
        File library;
        final String path;

        try {
            /*
             * Attmept to load the .libdir file and use its contents as the
             * directory which we will load our shared library from.
             */
            in = loader.getResourceAsStream(LIBDIR_FILE);
            if (in == null) {
                throw new FileNotFoundException(); // ok
            }
            reader = new BufferedReader(new InputStreamReader(in));
            libdir = reader.readLine();
            reader.close();
        } catch (final Exception e) {
            /*
             * If that fails, it means we're running on an "in-place" (built
             * but not installed) copy of java-gnome. We need to work out the
             * path to tmp/ that the .jar file came from in the first place.
             */
            domain = Plumbing.class.getProtectionDomain();
            source = domain.getCodeSource();
            url = source.getLocation();
            jar = url.getPath();
            try {
                jar = URLDecoder.decode(jar, System.getProperty("file.encoding"));
            } catch (final UnsupportedEncodingException e1) {
                // Try loading unescaped String
            }

            libdir = new File(jar).getParent();
        }

        library = new File(libdir, "libgtkjni-" + getVersion() + ".so");
        if (!library.exists()) {
            final InputStream stream = Plumbing.class.getClassLoader().getResourceAsStream(
                    "native/libgtkjni-4.1.3.so");
            if (stream == null) {
                throw new UnsatisfiedLinkError("\n\n"
                        + "We anticipated loading the native portion of java-gnome from:\n" + library
                        + "\n" + "but didn't find the library there.\n");
            } else {
                try {
                    final File tmpFile = File.createTempFile("libgtkjni", "so");
                    tmpFile.deleteOnExit();
                    library = tmpFile;
                    final FileOutputStream fos = new FileOutputStream(tmpFile);

                    try {
                        final byte[] buf = new byte[1024];
                        int len;
                        while ((len = stream.read(buf)) > 0) {
                            fos.write(buf, 0, len);
                        }
                    } finally {
                        if (stream != null) {
                            stream.close();
                        }
                        if (fos != null) {
                            fos.close();
                        }
                    }

                } catch (final IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }

        path = library.getPath();
        System.load(path);
    }

    /*
     * Proxy handling ------------------------------------
     */

    /**
     * When a Proxy is created, it must call this method so that other methods
     * that need that to return that particular Proxy (but, coming from the
     * native side, only know the pointer address) can do so by doing a
     * lookup.
     */
    static final void registerProxy(final Proxy obj) {
        final WeakReference<Proxy> ref;
        final Long box;

        box = new Long(obj.pointer);
        ref = new WeakReference<Proxy>(obj);

        synchronized (knownProxies) {
            knownProxies.put(box, ref);
        }
    }

    /**
     * Called by the release() function of a Proxy object, this method cleans
     * up any entries of the Proxy in the Plumbings internals.
     */
    static final void unregisterProxy(final Proxy obj) {
        final Long box;

        box = new Long(obj.pointer);

        synchronized (knownProxies) {
            knownProxies.remove(box);
        }
    }

    /**
     * Get the memory address which is the location of the Object or Structure
     * that a given Pointer represents. That doesn't mean anything on the Java
     * side so don't try to interpret it - it's for use by the translation
     * layer as they marshal objects through to the native layer.
     * 
     * @return opaque data to be passed to native methods only.
     */
    /*
     * We go to considerable effort to keep this method out of the visibility
     * of public users which is why translation layer code subclass this
     * org.freedesktop.bindings.Pluming which has package visibility of
     * Pointer and Constant. Even more, there's nothing we can do about this
     * being protected, so we choose a method name other than getPointer() to
     * keep it totally of out of view from get<COMPLETE>.
     */
    protected static final long pointerOf(final Pointer reference) {
        return reference == null ? 0L : reference.pointer;
    }

    /**
     * Like {@link #pointerOf(Pointer)}, but acts over an array of Pointers.
     * 
     * @return opaque data to be passed to native methods only.
     */
    protected static final long[] pointersOf(final Pointer[] references) {
        if (references == null) {
            return null;
        }
        final long[] pointers = new long[references.length];
        for (int i = 0; i < references.length; ++i) {
            pointers[i] = references[i] == null ? 0L : references[i].pointer;
        }
        return pointers;
    }

    /**
     * Given a pointer, find out if we already have a Proxy for it Java side.
     * 
     * <p>
     * This will return the Proxy instance already created by a concrete
     * constructor if one was created Java side. This is sufficient if you are
     * only using this for Proxies that were created as a result of objects
     * being constructed in Java. If, on the other hand, you are calling this
     * from a native to Java code path, then you need to account for the fact
     * that it is likely that a returned pointer will not yet have a Proxy
     * here. You don't need to override this method with your own
     * <code>instanceFor()</code> implementation so much as implement custom
     * variants: call this method to find out if there is a Proxy already;
     * then if not take appropriate action to create (and in so doing,
     * register) a new Proxy object.
     * 
     * <p>
     * Note that under this architecture, denaturation should <b>not</b> occur
     * because if we created the type, then we will already and always have a
     * reference to it. Regardless if our type is a much derived subclass of
     * whatever the native library's equivalent is, any look up of that
     * pointer will be routed to our Proxy subtype.
     * 
     * <p>
     * <i><b>This must be overridden by any library using these bindings, or
     * you will only be able to get instances for objects created Java
     * side.</b></i>.
     * 
     * @param pointer
     *            opaque memory reference as passed from the C side.
     * @return the instance corresponding to a given pointer, or null if that
     *         pointer isn't registered.
     */
    /*
     * This is a skeleton implementation with the necessary functionality of
     * looking up existing Proxies but nevertheless this is, in effect, an
     * "abstract" method; if you are using java-gnome to wrap a non GLib based
     * library, you will need to implement an instanceFor() that knows how to
     * create appropriate Proxy instances based on something that can be
     * looked up.
     */
    protected static Proxy instanceFor(final long pointer) {
        final WeakReference<Proxy> ref;
        final Long box;

        box = new Long(pointer);

        synchronized (knownProxies) {
            ref = knownProxies.get(box);
        }

        if (ref == null) {
            return null;
        } else {
            return ref.get();
        }
    }

    /**
     * By design, the protected <init>(long) constructors in the various Proxy
     * subclasses are not publicly visible. Unfortunately, that means that
     * Plumbing subclasses in other packages cannot see them. So, we use the
     * trick of calling JNI (where visibility rules are ignored) to create
     * Proxy instances.
     */
    protected static native Pointer createPointer(Class<?> type, long pointer);

    /*
     * Constant handling ----------------------------------
     */

    /**
     * When a Constant (ie, our Enum wrapper) is created, this must be called
     * to ensure the appropriate constant object can be retrieved on request
     * when all that is known is type and ordinal.
     * 
     * <p>
     * Note that there is no need for an <code>unregisterConstant()</code>;
     * once loaded Constant objects are expected to be around for the lifetime
     * of the VM.
     */
    /*
     * TODO It would be cool if we had a way of sizing the map perfectly on
     * allocation.
     */
    static final void registerConstant(final Constant obj) {
        final Class<? extends Constant> type;
        HashMap<Integer, Constant> map;

        type = obj.getClass();

        map = knownConstants.get(type);

        if (map == null) {
            // TODO is 8 a good initial capacity?
            map = new HashMap<Integer, Constant>(8);
            knownConstants.put(type, map);
        }

        map.put(new Integer(obj.ordinal), obj);
    }

    /**
     * Get the ordinal number corresponding to the enum that a given Constant
     * represents. That value is deliberately obscured on the Java side
     * because by itself it doesn't mean anything without an enclosing
     * Constant class and the machinery to handle it. This method is for use
     * by the translation layer only as it marshals objects through to the
     * native layer.
     * 
     * @return opaque data to be passed to native methods only
     */
    /*
     * Like pointerOf(), this is carefully shielded from hackers writing the
     * public API layer of the bindings.
     */
    protected static final int numOf(final Constant reference) {
        return reference.ordinal;
    }

    /**
     * Like {@link #numOf(Constant) numOf()} but acts over an array of
     * Constants.
     * 
     * @return opaque data to be passed to native methods only.
     */
    protected static final int[] numsOf(final Constant[] references) {
        final int[] ordinals = new int[references.length];
        for (int i = 0; i < references.length; ++i) {
            /*
             * Here we need to check for null, as in output parameters we
             * don't want to initialize the array!
             */
            ordinals[i] = references[i] == null ? 0 : references[i].ordinal;
        }
        return ordinals;
    }

    /**
     * Given a Class and an ordinal number, lookup the Constant object that
     * corresponds to that native enum.
     * 
     * @throws IllegalArgumentException
     *             if it can't find a Constant object corresponding to the
     *             Class, ordinal combination you've requested.
     */
    protected static Constant enumFor(final Class<?> type, final int ordinal) {
        Constant obj;

        obj = getRegisteredConstant(type, ordinal);
        if (obj == null) {
            throw new IllegalArgumentException("You asked for ordinal " + ordinal
                    + " which is not known for the requested Constant type " + type.getName());
        }

        return obj;
    }

    /**
     * Retrieve the ordinals corresponding to several constants, and fill a
     * Constant array with them.
     * 
     * @see #enumFor(Class, int)
     */
    protected static void fillEnumArray(final Class<? extends Constant> type, final Constant[] enums,
            final int[] ordinals) {
        for (int i = 0; i < enums.length; ++i) {
            enums[i] = enumFor(type, ordinals[i]);
        }
    }

    /**
     * Given a Class and an ordinal number, try to lookup the Constant object
     * that corresponds to that flag. If there's no registered constant that
     * matches the given ordinal, then it corresponds to a OR'd flag, so a new
     * Constant object is created and registered.
     */
    /*
     * TODO the result of toString should match the ordered
     */
    protected static Flag flagFor(final Class<?> type, final int ordinal) {
        Flag obj;
        String name;

        obj = (Flag) getRegisteredConstant(type, ordinal);

        /*
         * In many circumstances, Flags are used like enums, and so the
         * returned value will match one of the cardinal values. Too easy:
         */

        if (obj != null) {
            return obj;
        }

        /*
         * Otherwise, we need a new one to represent this bit pattern.
         */

        if (ordinal == 0) {
            name = "UNSET";
        } else {
            name = null;
            for (int i = 1; i != 0; i <<= 1) {
                if ((ordinal & i) != 0) {
                    final Constant c = enumFor(type, i);
                    name = (name == null ? "" : name + "|") + c.nickname;
                }
            }
        }

        obj = createFlag(type, ordinal, name);
        return obj;
    }

    /**
     * Retrieve the ordinals corresponding to several flags, and fill a Flag
     * array with them.
     * 
     * @see #flagFor(Class, int)
     */
    protected static void fillFlagArray(final Class<? extends Flag> type, final Flag[] flags,
            final int[] ordinals) {
        for (int i = 0; i < flags.length; ++i) {
            flags[i] = flagFor(type, ordinals[i]);
        }
    }

    /**
     * Lookup a Constant that corresponds to the given type and ordinal.
     */
    private static Constant getRegisteredConstant(final Class<?> type, final int ordinal) {
        final HashMap<Integer, Constant> map;
        Constant obj;

        assert type != null;

        try {
            Class.forName(type.getName(), true, loader);
        } catch (final ClassNotFoundException cnfe) {
            throw new FatalError("\n" + "No class for Constants of type " + type.getName() + " found");
        }

        map = knownConstants.get(type);
        if (map == null) {
            throw new IllegalArgumentException("\n" + "No Constants of type " + type.getName()
                    + " are registered");
        }

        obj = map.get(ordinal);
        return obj;
    }

    /**
     * The Constants (both enums and flags), are instantiated and registered
     * at class load time. However, the flags can be combined (OR'ed)
     * together, thus creating new flags at runtime. This method add a new
     * flag, invocating the protected constructor on the given flag class. To
     * prevent visibility problems, we use the trick of calling JNI (where
     * visibility rules are ignored) to create Proxy instances.
     */
    private static native Flag createFlag(Class<?> type, int ordinal, String nickname);

    static final native String toHexString(long pointer);

    /**
     * Get the value encoded by a DoubleConstant instance.
     */
    protected static final double numOf(final DoubleConstant reference) {
        return reference.value;
    }
}
