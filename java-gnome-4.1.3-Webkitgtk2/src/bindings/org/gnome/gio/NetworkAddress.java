package org.gnome.gio;

import org.gnome.glib.Object;

public class NetworkAddress extends Object
{

    public NetworkAddress(final String phostname, final char pport) {
        super(GNetworkAddress.createNetworkAddress(phostname, pport));
    }

    protected NetworkAddress(final long pointer) {
        super(pointer);
    }

}
