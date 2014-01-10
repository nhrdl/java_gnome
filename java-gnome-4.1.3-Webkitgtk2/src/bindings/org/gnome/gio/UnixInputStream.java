
package org.gnome.gio;


public class UnixInputStream
    extends InputStream
{


    public UnixInputStream(int pfd, boolean pclose_fd) {
        super(GUnixInputStream.createUnixInputStream(pfd, pclose_fd));
    }

    protected UnixInputStream(long pointer) {
        super(pointer);
    }

}
