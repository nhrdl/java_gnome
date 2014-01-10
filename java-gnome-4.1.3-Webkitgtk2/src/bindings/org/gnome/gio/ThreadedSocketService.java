
package org.gnome.gio;


public class ThreadedSocketService
    extends SocketService
{


    public ThreadedSocketService(int pmax_threads) {
        super(GThreadedSocketService.createThreadedSocketService(pmax_threads));
    }

    protected ThreadedSocketService(long pointer) {
        super(pointer);
    }

}
