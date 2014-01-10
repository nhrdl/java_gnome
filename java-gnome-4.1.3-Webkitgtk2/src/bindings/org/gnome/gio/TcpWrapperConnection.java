package org.gnome.gio;

public class TcpWrapperConnection extends TcpConnection
{

    // public TcpWrapperConnection(IOStream pbase_io_stream, Socket psocket) {
    // super(GTcpWrapperConnection.createTcpWrapperConnection(pbase_io_stream,
    // psocket));
    // }

    protected TcpWrapperConnection(final long pointer) {
        super(pointer);
    }

}
