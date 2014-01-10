package org.gnome.webKit;

import org.freedesktop.bindings.Pointer;
import org.gnome.glib.Object;
import org.gnome.glib.Signal;

public abstract class Plumbing extends org.gnome.gtk.Plumbing
{
    public static void connect(final Object instance, final Signal handler, final Class<?> receiver,
            final String name, final boolean after) {
        connectSignal(instance, handler, receiver, name, after);
    }

    public static Object getObject(final long request) {
        return objectFor(request);
    }

    public static long pointerFor(final Pointer ptr) {
        return pointerOf(ptr);
    }

}
