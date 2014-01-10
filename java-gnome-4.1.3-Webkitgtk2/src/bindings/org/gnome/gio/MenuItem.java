package org.gnome.gio;

import org.gnome.glib.Object;

public class MenuItem extends Object
{

    public MenuItem(final java.lang.String plabel, final java.lang.String pdetailed_action) {
        super(org.gnome.gio.GMenuItem.createMenuItem(plabel, pdetailed_action));
    }

    public MenuItem(final java.lang.String plabel, final MenuModel psection) {
        super(org.gnome.gio.GMenuItem.createMenuItemSection(plabel, psection));
    }

    // public MenuItem(java.lang.String plabel, MenuModel psubmenu) {
    // super(org.gnome.gio.GMenuItem.createMenuItem(plabel, psubmenu));
    // }

    protected MenuItem(final long pointer) {
        super(pointer);
    }

}
