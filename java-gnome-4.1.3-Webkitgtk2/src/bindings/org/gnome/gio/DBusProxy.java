package org.gnome.gio;

import org.gnome.glib.GlibException;
import org.gnome.glib.Object;

public class DBusProxy extends Object
{

    public DBusProxy(final AsyncResult pres) throws GlibException {
        super(org.gnome.gio.GDBusProxy.createDBusProxyFinish(pres));
    }

    // public DBusProxy(AsyncResult pres) {
    // super(org.gnome.gio.GDBusProxy.createDBusProxy(pres));
    // }
    //
    // public DBusProxy(BusType pbus_type, DBusProxyFlags pflags,
    // DBusInterfaceInfo pinfo, java.lang.String pname, java.lang.String
    // pobject_path, java.lang.String pinterface_name, Cancellable
    // pcancellable) {
    // super(org.gnome.gio.GDBusProxy.createDBusProxy(pbus_type, pflags,
    // pinfo, pname, pobject_path, pinterface_name, pcancellable));
    // }
    //
    // public DBusProxy(DBusConnection pconnection, DBusProxyFlags pflags,
    // DBusInterfaceInfo pinfo, java.lang.String pname, java.lang.String
    // pobject_path, java.lang.String pinterface_name, Cancellable
    // pcancellable) {
    // super(org.gnome.gio.GDBusProxy.createDBusProxy(pconnection, pflags,
    // pinfo, pname, pobject_path, pinterface_name, pcancellable));
    // }

    protected DBusProxy(final long pointer) {
        super(pointer);
    }

}
