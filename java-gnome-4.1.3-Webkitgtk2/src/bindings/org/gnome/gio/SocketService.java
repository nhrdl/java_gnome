
package org.gnome.gio;


public class SocketService
    extends SocketListener
{


    public SocketService() {
        super(GSocketService.createSocketService());
    }

    protected SocketService(long pointer) {
        super(pointer);
    }

}
