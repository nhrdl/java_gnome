package org.gnome.gio;

import org.gnome.glib.Object;

public class SocketAddress extends Object
{

    // public SocketAddress(final Pointer pnative, final long plen) {
    // super(GSocketAddress.createSocketAddressFromNative(pnative, plen));
    // }

    protected SocketAddress(final long pointer) {
        super(pointer);
    }

}
