
package org.gnome.gio;


public class UnixOutputStream
    extends OutputStream
{


    public UnixOutputStream(int pfd, boolean pclose_fd) {
        super(GUnixOutputStream.createUnixOutputStream(pfd, pclose_fd));
    }

    protected UnixOutputStream(long pointer) {
        super(pointer);
    }

}
