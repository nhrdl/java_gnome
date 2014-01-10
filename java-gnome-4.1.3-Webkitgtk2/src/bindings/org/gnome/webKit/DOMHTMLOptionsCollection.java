
package org.gnome.webKit;


public class DOMHTMLOptionsCollection
    extends DOMHTMLCollection
{


    protected DOMHTMLOptionsCollection(long pointer) {
        super(pointer);
    }

    public long getSelectedIndex() {
        return WebKitDOMHTMLOptionsCollection.getSelectedIndex(this);
    }

    public void setSelectedIndex(long arg1) {
        WebKitDOMHTMLOptionsCollection.setSelectedIndex(this, arg1);
    }

}
