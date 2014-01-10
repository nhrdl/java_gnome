package org.gnome.gio;

import org.gnome.glib.Object;

public class UnixFDList extends Object
{

    public UnixFDList() {
        super(org.gnome.gio.GUnixFDList.createUnixFDList());
    }

    //
    // public UnixFDList(int pn_fds) {
    // super(org.gnome.gio.GUnixFDList.createUnixFDList(pn_fds));
    // }

    protected UnixFDList(final long pointer) {
        super(pointer);
    }

}
