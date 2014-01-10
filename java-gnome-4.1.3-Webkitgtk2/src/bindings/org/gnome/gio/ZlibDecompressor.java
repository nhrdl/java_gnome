
package org.gnome.gio;

import org.gnome.glib.Object;

public class ZlibDecompressor
    extends Object
{


    public ZlibDecompressor(ZlibCompressorFormat pformat) {
        super(GZlibDecompressor.createZlibDecompressor(pformat));
    }

    protected ZlibDecompressor(long pointer) {
        super(pointer);
    }

}
