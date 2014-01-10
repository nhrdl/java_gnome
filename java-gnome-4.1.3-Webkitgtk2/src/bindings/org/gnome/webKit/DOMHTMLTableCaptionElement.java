
package org.gnome.webKit;


public class DOMHTMLTableCaptionElement
    extends DOMHTMLElement
{


    protected DOMHTMLTableCaptionElement(long pointer) {
        super(pointer);
    }

    public String getAlign() {
        return WebKitDOMHTMLTableCaptionElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLTableCaptionElement.setAlign(this, arg1);
    }

}
