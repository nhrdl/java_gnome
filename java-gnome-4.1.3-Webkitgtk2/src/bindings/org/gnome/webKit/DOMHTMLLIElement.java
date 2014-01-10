
package org.gnome.webKit;


public class DOMHTMLLIElement
    extends DOMHTMLElement
{


    protected DOMHTMLLIElement(long pointer) {
        super(pointer);
    }

    public long getValue() {
        return WebKitDOMHTMLLIElement.getValue(this);
    }

    public void setValue(long arg1) {
        WebKitDOMHTMLLIElement.setValue(this, arg1);
    }

}
