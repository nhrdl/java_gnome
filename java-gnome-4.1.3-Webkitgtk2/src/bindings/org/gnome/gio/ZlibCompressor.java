
package org.gnome.gio;

import org.gnome.glib.Object;

public class ZlibCompressor
    extends Object
{


    public ZlibCompressor(ZlibCompressorFormat pformat, int plevel) {
        super(GZlibCompressor.createZlibCompressor(pformat, plevel));
    }

    protected ZlibCompressor(long pointer) {
        super(pointer);
    }

}
