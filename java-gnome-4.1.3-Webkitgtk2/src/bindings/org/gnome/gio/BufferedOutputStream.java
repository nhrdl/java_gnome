package org.gnome.gio;

public class BufferedOutputStream extends FilterOutputStream
{

    public BufferedOutputStream(final OutputStream pbase_stream) {
        super(org.gnome.gio.GBufferedOutputStream.createBufferedOutputStream(pbase_stream));
    }

    public BufferedOutputStream(final OutputStream pbase_stream, final long psize) {
        super(org.gnome.gio.GBufferedOutputStream.createBufferedOutputStreamSized(pbase_stream, psize));
    }

    protected BufferedOutputStream(final long pointer) {
        super(pointer);
    }

}
