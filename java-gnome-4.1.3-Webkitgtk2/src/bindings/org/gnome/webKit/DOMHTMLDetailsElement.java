
package org.gnome.webKit;


public class DOMHTMLDetailsElement
    extends DOMHTMLElement
{


    protected DOMHTMLDetailsElement(long pointer) {
        super(pointer);
    }

    public boolean getOpen() {
        return WebKitDOMHTMLDetailsElement.getOpen(this);
    }

    public void setOpen(boolean arg1) {
        WebKitDOMHTMLDetailsElement.setOpen(this, arg1);
    }

}
