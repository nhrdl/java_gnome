
package org.gnome.webKit;


public class DOMHTMLOListElement
    extends DOMHTMLElement
{


    protected DOMHTMLOListElement(long pointer) {
        super(pointer);
    }

    public void setCompact(boolean arg1) {
        WebKitDOMHTMLOListElement.setCompact(this, arg1);
    }

    public boolean getCompact() {
        return WebKitDOMHTMLOListElement.getCompact(this);
    }

    public boolean getReversed() {
        return WebKitDOMHTMLOListElement.getReversed(this);
    }

    public void setStart(long arg1) {
        WebKitDOMHTMLOListElement.setStart(this, arg1);
    }

    public long getStart() {
        return WebKitDOMHTMLOListElement.getStart(this);
    }

    public void setReversed(boolean arg1) {
        WebKitDOMHTMLOListElement.setReversed(this, arg1);
    }

}
