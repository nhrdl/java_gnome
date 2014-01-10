package org.gnome.gio;

import org.gnome.glib.Object;

public class Socket extends Object
{

    // public Socket(SocketFamily pfamily, SocketType ptype, SocketProtocol
    // pprotocol) {
    // super(org.gnome.gio.GSocket.createSocket(pfamily, ptype, pprotocol));
    // }
    //
    // public Socket(int pfd) {
    // super(org.gnome.gio.GSocket.createSocket(pfd));
    // }

    protected Socket(final long pointer) {
        super(pointer);
    }

}
