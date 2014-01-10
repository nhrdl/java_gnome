
package org.gnome.webKit;


public class DOMHTMLMenuElement
    extends DOMHTMLElement
{


    protected DOMHTMLMenuElement(long pointer) {
        super(pointer);
    }

    public void setCompact(boolean arg1) {
        WebKitDOMHTMLMenuElement.setCompact(this, arg1);
    }

    public boolean getCompact() {
        return WebKitDOMHTMLMenuElement.getCompact(this);
    }

}
