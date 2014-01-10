package org.gnome.gio;

import org.gnome.glib.Object;

public class DBusServer extends Object
{

    //
    // public DBusServer(java.lang.String paddress, DBusServerFlags pflags,
    // java.lang.String pguid, DBusAuthObserver pobserver, Cancellable
    // pcancellable) {
    // super(GDBusServer.createDBusServer(paddress, pflags, pguid, pobserver,
    // pcancellable));
    // }

    protected DBusServer(final long pointer) {
        super(pointer);
    }

}
