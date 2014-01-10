
package org.gnome.webKit;


public class DOMHTMLUListElement
    extends DOMHTMLElement
{


    protected DOMHTMLUListElement(long pointer) {
        super(pointer);
    }

    public void setCompact(boolean arg1) {
        WebKitDOMHTMLUListElement.setCompact(this, arg1);
    }

    public boolean getCompact() {
        return WebKitDOMHTMLUListElement.getCompact(this);
    }

}
