package org.gnome.gio;

public class BufferedInputStream extends FilterInputStream
{

    public BufferedInputStream(final InputStream pbase_stream) {
        super(org.gnome.gio.GBufferedInputStream.createBufferedInputStream(pbase_stream));
    }

    public BufferedInputStream(final InputStream pbase_stream, final long psize) {
        super(org.gnome.gio.GBufferedInputStream.createBufferedInputStreamSized(pbase_stream, psize));
    }

    protected BufferedInputStream(final long pointer) {
        super(pointer);
    }

}
