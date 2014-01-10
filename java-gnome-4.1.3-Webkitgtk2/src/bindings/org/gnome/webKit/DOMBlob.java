
package org.gnome.webKit;

import org.freedesktop.bindings.FIXME;

public class DOMBlob
    extends DOMObject
{


    protected DOMBlob(long pointer) {
        super(pointer);
    }

    public org.gnome.webKit.DOMBlob slice(long arg1, long arg2, String arg3) {
        return WebKitDOMBlob.slice(this, arg1, arg2, arg3);
    }

    public org.gnome.webKit.DOMBlob webkitSlice(long arg1, long arg2, String arg3) {
        return WebKitDOMBlob.webkitSlice(this, arg1, arg2, arg3);
    }

    public long getSize() {
        return WebKitDOMBlob.getSize(this);
    }

}
