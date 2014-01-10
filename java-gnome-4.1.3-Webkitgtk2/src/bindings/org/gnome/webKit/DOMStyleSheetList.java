
package org.gnome.webKit;


public class DOMStyleSheetList
    extends DOMObject
{


    protected DOMStyleSheetList(long pointer) {
        super(pointer);
    }

    public DOMStyleSheet item(long arg1) {
        return WebKitDOMStyleSheetList.item(this, arg1);
    }

    public long getLength() {
        return WebKitDOMStyleSheetList.getLength(this);
    }

}
