package org.gnome.gio;

public class MemoryInputStream extends InputStream
{

    public MemoryInputStream() {
        super(org.gnome.gio.GMemoryInputStream.createMemoryInputStream());
    }

    // public MemoryInputStream(int plen, DestroyNotify pdestroy) {
    // super(org.gnome.gio.GMemoryInputStream.createMemoryInputStream(plen,
    // pdestroy));
    // }

    protected MemoryInputStream(final long pointer) {
        super(pointer);
    }

}
