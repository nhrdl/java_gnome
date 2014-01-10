
package org.gnome.webKit;


public class DOMNodeList
    extends DOMObject
{


    protected DOMNodeList(long pointer) {
        super(pointer);
    }

    public DOMNode item(long arg1) {
        return WebKitDOMNodeList.item(this, arg1);
    }

    public long getLength() {
        return WebKitDOMNodeList.getLength(this);
    }

}
