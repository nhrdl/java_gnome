
package org.gnome.gio;

import org.gnome.glib.Object;

public class NetworkService
    extends Object
{


    public NetworkService(java.lang.String pservice, java.lang.String pprotocol, java.lang.String pdomain) {
        super(GNetworkService.createNetworkService(pservice, pprotocol, pdomain));
    }

    protected NetworkService(long pointer) {
        super(pointer);
    }

}
