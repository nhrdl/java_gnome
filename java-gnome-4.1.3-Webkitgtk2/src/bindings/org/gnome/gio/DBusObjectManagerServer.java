
package org.gnome.gio;

import org.gnome.glib.Object;

public class DBusObjectManagerServer
    extends Object
{


    public DBusObjectManagerServer(String pobject_path) {
        super(GDBusObjectManagerServer.createDBusObjectManagerServer(pobject_path));
    }

    protected DBusObjectManagerServer(long pointer) {
        super(pointer);
    }

}
