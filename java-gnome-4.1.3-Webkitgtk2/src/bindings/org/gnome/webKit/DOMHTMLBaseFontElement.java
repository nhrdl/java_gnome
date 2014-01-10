
package org.gnome.webKit;


public class DOMHTMLBaseFontElement
    extends DOMHTMLElement
{


    protected DOMHTMLBaseFontElement(long pointer) {
        super(pointer);
    }

    public void setColor(String arg1) {
        WebKitDOMHTMLBaseFontElement.setColor(this, arg1);
    }

    public void setFace(String arg1) {
        WebKitDOMHTMLBaseFontElement.setFace(this, arg1);
    }

    public String getFace() {
        return WebKitDOMHTMLBaseFontElement.getFace(this);
    }

    public String getColor() {
        return WebKitDOMHTMLBaseFontElement.getColor(this);
    }

    public long getSize() {
        return WebKitDOMHTMLBaseFontElement.getSize(this);
    }

    public void setSize(long arg1) {
        WebKitDOMHTMLBaseFontElement.setSize(this, arg1);
    }

}
