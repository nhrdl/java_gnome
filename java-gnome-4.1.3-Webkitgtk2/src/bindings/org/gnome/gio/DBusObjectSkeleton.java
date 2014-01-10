
package org.gnome.gio;

import org.gnome.glib.Object;

public class DBusObjectSkeleton
    extends Object
{


    public DBusObjectSkeleton(String pobject_path) {
        super(GDBusObjectSkeleton.createDBusObjectSkeleton(pobject_path));
    }

    protected DBusObjectSkeleton(long pointer) {
        super(pointer);
    }

}
