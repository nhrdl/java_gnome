package org.gnome.gio;

import org.gnome.glib.Object;

public class InetAddress extends Object
{

    public InetAddress(final SocketFamily pfamily) {
        super(org.gnome.gio.GInetAddress.createInetAddressAny(pfamily));
    }

    // public InetAddress(final SocketFamily pfamily) {
    // super(org.gnome.gio.GInetAddress.createInetAddress(pfamily));
    // }
    //
    // public InetAddress(final String pstring) {
    // super(org.gnome.gio.GInetAddress.createInetAddress(pstring));
    // }
    //
    // public InetAddress(final SocketFamily pfamily) {
    // super(org.gnome.gio.GInetAddress.createInetAddress(pfamily));
    // }

    protected InetAddress(final long pointer) {
        super(pointer);
    }

}
