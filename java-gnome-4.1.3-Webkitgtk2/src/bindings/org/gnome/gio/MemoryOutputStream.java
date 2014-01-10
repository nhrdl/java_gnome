package org.gnome.gio;


public class MemoryOutputStream extends OutputStream
{

    //
    // public MemoryOutputStream(Pointer pdata, long psize, ReallocFunc
    // prealloc_function, DestroyNotify pdestroy_function) {
    // super(GMemoryOutputStream.createMemoryOutputStream(pdata, psize,
    // prealloc_function, pdestroy_function));
    // }

    protected MemoryOutputStream(final long pointer) {
        super(pointer);
    }

}
