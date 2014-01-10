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
package org.gnome.gtk;

/**
 * A Widget that contains at least one, and maybe more, other Widgets.
 * Container is the base of the GTK box packing model; all layouts are
 * composed of Widgets that are packed into other Widgets.
 * 
 * <p>
 * Containers fall into two major categories. They are either:
 * <dl>
 * <dt><b>decorators</b>
 * <dd>Containers which add something around a Widget. Examples include
 * {@link Button Button} (adding the push button aspect to a Widget) and
 * {@link Window Window} (the top level Widget which adds window decorations
 * via the window manager); <i>or</i>
 * <dt><b>layout</b>
 * <dd>Containers which control the layout of other Widgets within a user
 * interface. Examples include the simplistic {@link Fixed Fixed} layout tool,
 * the ubiquitous {@link Box Box} subclasses like VBox and HBox, and the more
 * advanced packing mechanisms like {@link Table}.
 * </dl>
 * 
 * <h2>Size Requests and Size Allocation</h2>
 * <p>
 * Containers intermediate in GTK's box packing process. Each Container
 * aggregates the requests from its children during the <i>size request</i>
 * phase, and then later, as actual screen real estate is granted to it, the
 * Container must then divide that space amongst each of its children in the
 * <i>size allocation</i> phase.
 * 
 * <p>
 * For more information about how this works, and on how you can influence it
 * if necessary, see Widget's {@link Widget#setSizeRequest(int, int)
 * setSizeRequest()}. To get an indication of how much space has been (will
 * be) requested by a child, a Container will also find the
 * {@link Widget#getRequisition() getRequisition()} method useful. The Actual
 * size granted is available at {@link Widget#getAllocation() getAllocation()}
 * once the box packing cycle has been carried out.
 * 
 * @author Andrew Cowie
 * @since 4.0.0
 */
public abstract class Container extends Widget
{
    protected Container(long pointer) {
        super(pointer);
    }

    /**
     * Add a child Widget to this Container. This works for all the various
     * Container types, of course, but most offer more specialized packing
     * methods that allow you to control the positioning of the Widget being
     * added with greater finesse.
     * 
     * @since 4.0.0
     */
    public void add(Widget child) {
        GtkContainer.add(this, child);
    }

    /**
     * Remove a Widget from this Container.
     * 
     * <p>
     * <i>In native GTK, this often results in the destruction of the Widget.
     * In java-gnome, that will only occur once the last Java reference goes
     * out of scope and a garbage collection run occurs. So you can, quite
     * safely, do:</i>
     * 
     * <pre>
     * box1.remove(button);
     * box2.add(button);
     * </pre>
     * 
     * <i>without worrying that that Button is going to evaporate out from
     * under you.</i>
     * 
     * @param child
     *            A child Widget that is already <i>in</i> the Container,
     *            right? If you try to remove a Widget that isn't, don't
     *            complain when you get all sorts of errors!
     * @since 4.0.2
     */
    /*
     * TODO, yes, we should probably check that the child is actually in the
     * Container first.
     */
    public void remove(Widget child) {
        GtkContainer.remove(this, child);
    }

    /**
     * Get the Widgets that are children of this Container, i.e. the Widgets
     * previously added to the Container. An array of Widgets isn't always
     * ideal, but you can cast the returned objects to the appropriate Widget
     * subtype should you need to, for example:
     * 
     * <pre>
     * Button button, child;
     * Widget[] children;
     * 
     * box.add(button);
     * children = box.getChildren();
     * 
     * child = (Button) children[0];
     * </pre>
     * 
     * In other situations (wondering just what aggregation of Widgets makes
     * up something that was handed to you by Glade, perhaps),
     * <code>instanceof</code> is your friend. Indeed sometimes it's the only
     * way; the box packing composition of GTK elements means that even things
     * you might take for granted as elementary (Button) are in fact more
     * complex (an HBox of an Image and a Label) - and often the only way to
     * find this out is to walk the Widget hierarchy.
     * 
     * @return an array with the Container's child Widgets. The array will be
     *         empty (zero length) if the Container hasn't got any children.
     * @since 4.0.3
     */
    public Widget[] getChildren() {
        return GtkContainer.getChildren(this);
    }

    /**
     * Set the amount of padding to put around the outside of this Container,
     * in pixels. This is exterior padding around the outside of the contained
     * Widgets. The default is 0.
     * 
     * @param width
     *            Although anything under 65535 is a valid value, anyone who
     *            thinks they need a border width of sixty thousand pixels is
     *            invited to get their head examined.
     * @since 4.0.5
     */
    public void setBorderWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("width must be positive");
        }
        GtkContainer.setBorderWidth(this, width);
    }
}
