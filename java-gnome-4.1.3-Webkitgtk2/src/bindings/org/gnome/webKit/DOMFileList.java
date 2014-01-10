
package org.gnome.webKit;


public class DOMFileList
    extends DOMObject
{


    protected DOMFileList(long pointer) {
        super(pointer);
    }

    public DOMFile item(long arg1) {
        return WebKitDOMFileList.item(this, arg1);
    }

    public long getLength() {
        return WebKitDOMFileList.getLength(this);
    }

}
