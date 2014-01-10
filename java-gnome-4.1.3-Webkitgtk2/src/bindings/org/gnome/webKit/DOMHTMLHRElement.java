
package org.gnome.webKit;


public class DOMHTMLHRElement
    extends DOMHTMLElement
{


    protected DOMHTMLHRElement(long pointer) {
        super(pointer);
    }

    public boolean getNoShade() {
        return WebKitDOMHTMLHRElement.getNoShade(this);
    }

    public void setNoShade(boolean arg1) {
        WebKitDOMHTMLHRElement.setNoShade(this, arg1);
    }

    public String getWidth() {
        return WebKitDOMHTMLHRElement.getWidth(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLHRElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLHRElement.setAlign(this, arg1);
    }

    public void setWidth(String arg1) {
        WebKitDOMHTMLHRElement.setWidth(this, arg1);
    }

    public String getSize() {
        return WebKitDOMHTMLHRElement.getSize(this);
    }

    public void setSize(String arg1) {
        WebKitDOMHTMLHRElement.setSize(this, arg1);
    }

}
