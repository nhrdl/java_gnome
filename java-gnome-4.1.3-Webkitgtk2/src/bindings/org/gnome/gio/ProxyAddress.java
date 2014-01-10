package org.gnome.gio;

public class ProxyAddress extends InetSocketAddress
{

    public ProxyAddress(final InetAddress pinetaddr, final char pport, final java.lang.String pprotocol,
            final java.lang.String pdest_hostname, final char pdest_port,
            final java.lang.String pusername, final java.lang.String ppassword) {
        super(GProxyAddress.createProxyAddress(pinetaddr, pport, pprotocol, pdest_hostname, pdest_port,
                pusername, ppassword));
    }

    protected ProxyAddress(final long pointer) {
        super(pointer);
    }

}
