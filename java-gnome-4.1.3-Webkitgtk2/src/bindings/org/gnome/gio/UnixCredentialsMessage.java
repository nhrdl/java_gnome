package org.gnome.gio;

public class UnixCredentialsMessage extends SocketControlMessage
{

    public UnixCredentialsMessage() {
        super(org.gnome.gio.GUnixCredentialsMessage.createUnixCredentialsMessage());
    }

    public UnixCredentialsMessage(final Credentials pcredentials) {
        super(
                org.gnome.gio.GUnixCredentialsMessage.createUnixCredentialsMessageWithCredentials(pcredentials));
    }

    protected UnixCredentialsMessage(final long pointer) {
        super(pointer);
    }

}
