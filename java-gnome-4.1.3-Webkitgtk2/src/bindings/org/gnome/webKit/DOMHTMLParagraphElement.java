
package org.gnome.webKit;


public class DOMHTMLParagraphElement
    extends DOMHTMLElement
{


    protected DOMHTMLParagraphElement(long pointer) {
        super(pointer);
    }

    public String getAlign() {
        return WebKitDOMHTMLParagraphElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLParagraphElement.setAlign(this, arg1);
    }

}
