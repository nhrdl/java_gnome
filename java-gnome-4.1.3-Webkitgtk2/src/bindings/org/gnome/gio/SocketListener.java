
package org.gnome.gio;

import org.gnome.glib.Object;

public class SocketListener
    extends Object
{


    public SocketListener() {
        super(GSocketListener.createSocketListener());
    }

    protected SocketListener(long pointer) {
        super(pointer);
    }

}
