package org.gnome.gio;

public class UnixFDMessage extends SocketControlMessage
{

    public UnixFDMessage() {
        super(org.gnome.gio.GUnixFDMessage.createUnixFDMessage());
    }

    public UnixFDMessage(final UnixFDList pfd_list) {
        super(org.gnome.gio.GUnixFDMessage.createUnixFDMessageWithFdList(pfd_list));
    }

    protected UnixFDMessage(final long pointer) {
        super(pointer);
    }

}
