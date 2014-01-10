package org.gnome.gio;

public class InetSocketAddress extends SocketAddress
{

    public InetSocketAddress(final InetAddress paddress, final char pport) {
        super(GInetSocketAddress.createInetSocketAddress(paddress, pport));
    }

    protected InetSocketAddress(final long pointer) {
        super(pointer);
    }

}
