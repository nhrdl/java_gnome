
package org.gnome.webKit;


public class DOMHTMLHeadingElement
    extends DOMHTMLElement
{


    protected DOMHTMLHeadingElement(long pointer) {
        super(pointer);
    }

    public String getAlign() {
        return WebKitDOMHTMLHeadingElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLHeadingElement.setAlign(this, arg1);
    }

}
