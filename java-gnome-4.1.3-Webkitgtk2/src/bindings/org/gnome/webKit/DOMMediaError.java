
package org.gnome.webKit;


public class DOMMediaError
    extends DOMObject
{


    protected DOMMediaError(long pointer) {
        super(pointer);
    }

    public short getCode() {
        return WebKitDOMMediaError.getCode(this);
    }

}
