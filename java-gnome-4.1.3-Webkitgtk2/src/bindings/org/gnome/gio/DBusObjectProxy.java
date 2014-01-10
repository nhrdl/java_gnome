
package org.gnome.gio;

import org.gnome.glib.Object;

public class DBusObjectProxy
    extends Object
{


    public DBusObjectProxy(DBusConnection pconnection, String pobject_path) {
        super(GDBusObjectProxy.createDBusObjectProxy(pconnection, pobject_path));
    }

    protected DBusObjectProxy(long pointer) {
        super(pointer);
    }

}
