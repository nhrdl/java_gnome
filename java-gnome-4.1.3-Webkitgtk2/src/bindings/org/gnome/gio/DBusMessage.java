package org.gnome.gio;

import org.gnome.glib.Object;

public class DBusMessage extends Object
{

    public DBusMessage() {
        super(org.gnome.gio.GDBusMessage.createDBusMessage());
    }

    // public DBusMessage(long pblob_len, DBusCapabilityFlags pcapabilities) {
    // super(org.gnome.gio.GDBusMessage.createDBusMessage(pblob_len,
    // pcapabilities));
    // }

    public DBusMessage(final java.lang.String pname, final java.lang.String ppath,
            final java.lang.String pinterface_, final java.lang.String pmethod) {
        super(org.gnome.gio.GDBusMessage.createDBusMessageMethodCall(pname, ppath, pinterface_, pmethod));
    }

    public DBusMessage(final java.lang.String ppath, final java.lang.String pinterface_,
            final java.lang.String psignal) {
        super(org.gnome.gio.GDBusMessage.createDBusMessageSignal(ppath, pinterface_, psignal));
    }

    protected DBusMessage(final long pointer) {
        super(pointer);
    }

}
