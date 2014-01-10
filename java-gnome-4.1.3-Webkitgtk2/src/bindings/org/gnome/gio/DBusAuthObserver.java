
package org.gnome.gio;

import org.gnome.glib.Object;

public class DBusAuthObserver
    extends Object
{


    public DBusAuthObserver() {
        super(GDBusAuthObserver.createDBusAuthObserver());
    }

    protected DBusAuthObserver(long pointer) {
        super(pointer);
    }

}
