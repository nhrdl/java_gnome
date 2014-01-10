
package org.gnome.webKit;


public class DOMHTMLFontElement
    extends DOMHTMLElement
{


    protected DOMHTMLFontElement(long pointer) {
        super(pointer);
    }

    public void setColor(String arg1) {
        WebKitDOMHTMLFontElement.setColor(this, arg1);
    }

    public void setFace(String arg1) {
        WebKitDOMHTMLFontElement.setFace(this, arg1);
    }

    public String getFace() {
        return WebKitDOMHTMLFontElement.getFace(this);
    }

    public String getColor() {
        return WebKitDOMHTMLFontElement.getColor(this);
    }

    public String getSize() {
        return WebKitDOMHTMLFontElement.getSize(this);
    }

    public void setSize(String arg1) {
        WebKitDOMHTMLFontElement.setSize(this, arg1);
    }

}
