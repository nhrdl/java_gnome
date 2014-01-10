package org.gnome.gio;

import org.gnome.glib.GlibException;
import org.gnome.glib.Object;

public class DBusConnection extends Object
{

    public DBusConnection(final AsyncResult pres) throws GlibException {
        super(org.gnome.gio.GDBusConnection.createDBusConnectionFinish(pres));
    }

    // public DBusConnection(AsyncResult pres) {
    // super(org.gnome.gio.GDBusConnection.createDBusConnection(pres));
    // }

    // public DBusConnection(java.lang.String paddress, DBusConnectionFlags
    // pflags, DBusAuthObserver pobserver, Cancellable pcancellable) {
    // super(org.gnome.gio.GDBusConnection.createDBusConnection(paddress,
    // pflags, pobserver, pcancellable));
    // }
    //
    // public DBusConnection(IOStream pstream, java.lang.String pguid,
    // DBusConnectionFlags pflags, DBusAuthObserver pobserver, Cancellable
    // pcancellable) {
    // super(org.gnome.gio.GDBusConnection.createDBusConnection(pstream,
    // pguid, pflags, pobserver, pcancellable));
    // }

    protected DBusConnection(final long pointer) {
        super(pointer);
    }

}
