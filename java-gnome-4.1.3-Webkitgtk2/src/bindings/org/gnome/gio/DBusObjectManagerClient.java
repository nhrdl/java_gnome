package org.gnome.gio;

import org.gnome.glib.GlibException;
import org.gnome.glib.Object;

public class DBusObjectManagerClient extends Object
{

    public DBusObjectManagerClient(final AsyncResult pres) throws GlibException {
        super(org.gnome.gio.GDBusObjectManagerClient.createDBusObjectManagerClientFinish(pres));
    }

    // public DBusObjectManagerClient(AsyncResult pres) {
    // super(org.gnome.gio.GDBusObjectManagerClient.createDBusObjectManagerClient(pres));
    // }
    //
    // public DBusObjectManagerClient(BusType pbus_type,
    // DBusObjectManagerClientFlags pflags, java.lang.String pname,
    // java.lang.String pobject_path, DBusProxyTypeFunc pget_proxy_type_func,
    // org.freedesktop.bindings.Pointer pget_proxy_type_user_data,
    // DestroyNotify pget_proxy_type_destroy_notify, Cancellable pcancellable)
    // {
    // super(org.gnome.gio.GDBusObjectManagerClient.createDBusObjectManagerClient(pbus_type,
    // pflags, pname, pobject_path, pget_proxy_type_func,
    // pget_proxy_type_user_data, pget_proxy_type_destroy_notify,
    // pcancellable));
    // }
    //
    // public DBusObjectManagerClient(DBusConnection pconnection,
    // DBusObjectManagerClientFlags pflags, java.lang.String pname,
    // java.lang.String pobject_path, DBusProxyTypeFunc pget_proxy_type_func,
    // org.freedesktop.bindings.Pointer pget_proxy_type_user_data,
    // DestroyNotify pget_proxy_type_destroy_notify, Cancellable pcancellable)
    // {
    // super(org.gnome.gio.GDBusObjectManagerClient.createDBusObjectManagerClient(pconnection,
    // pflags, pname, pobject_path, pget_proxy_type_func,
    // pget_proxy_type_user_data, pget_proxy_type_destroy_notify,
    // pcancellable));
    // }

    protected DBusObjectManagerClient(final long pointer) {
        super(pointer);
    }

}
