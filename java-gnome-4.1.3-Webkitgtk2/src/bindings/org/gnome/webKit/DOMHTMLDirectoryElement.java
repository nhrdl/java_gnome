
package org.gnome.webKit;


public class DOMHTMLDirectoryElement
    extends DOMHTMLElement
{


    protected DOMHTMLDirectoryElement(long pointer) {
        super(pointer);
    }

    public void setCompact(boolean arg1) {
        WebKitDOMHTMLDirectoryElement.setCompact(this, arg1);
    }

    public boolean getCompact() {
        return WebKitDOMHTMLDirectoryElement.getCompact(this);
    }

}
