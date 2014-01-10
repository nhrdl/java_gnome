
package org.gnome.webKit;


public class DOMHTMLCollection
    extends DOMObject
{


    protected DOMHTMLCollection(long pointer) {
        super(pointer);
    }

    public DOMNode item(long arg1) {
        return WebKitDOMHTMLCollection.item(this, arg1);
    }

    public DOMNode namedItem(String arg1) {
        return WebKitDOMHTMLCollection.namedItem(this, arg1);
    }

    public long getLength() {
        return WebKitDOMHTMLCollection.getLength(this);
    }

}
