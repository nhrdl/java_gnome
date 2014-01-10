
package org.gnome.gio;

import org.gnome.glib.Object;

public class SocketClient
    extends Object
{


    public SocketClient() {
        super(GSocketClient.createSocketClient());
    }

    protected SocketClient(long pointer) {
        super(pointer);
    }

}
