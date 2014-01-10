
package org.gnome.webKit;


public class DOMHTMLDListElement
    extends DOMHTMLElement
{


    protected DOMHTMLDListElement(long pointer) {
        super(pointer);
    }

    public void setCompact(boolean arg1) {
        WebKitDOMHTMLDListElement.setCompact(this, arg1);
    }

    public boolean getCompact() {
        return WebKitDOMHTMLDListElement.getCompact(this);
    }

}
