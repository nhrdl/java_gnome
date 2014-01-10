
package org.gnome.webKit;


public class DOMHTMLDivElement
    extends DOMHTMLElement
{


    protected DOMHTMLDivElement(long pointer) {
        super(pointer);
    }

    public String getAlign() {
        return WebKitDOMHTMLDivElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLDivElement.setAlign(this, arg1);
    }

}
