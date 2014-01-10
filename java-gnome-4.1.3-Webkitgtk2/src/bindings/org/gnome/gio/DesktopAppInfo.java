package org.gnome.gio;

import org.gnome.glib.Object;

public class DesktopAppInfo extends Object
{

    public DesktopAppInfo(final java.lang.String pdesktop_id) {
        super(org.gnome.gio.GDesktopAppInfo.createDesktopAppInfo(pdesktop_id));
    }

    // public DesktopAppInfo(java.lang.String pfilename) {
    // super(org.gnome.gio.GDesktopAppInfo.createDesktopAppInfo(pfilename));
    // }
    //
    // public DesktopAppInfo(KeyFile pkey_file) {
    // super(org.gnome.gio.GDesktopAppInfo.createDesktopAppInfo(pkey_file));
    // }

    protected DesktopAppInfo(final long pointer) {
        super(pointer);
    }

}
