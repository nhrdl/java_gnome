
package org.gnome.webKit;


public class DOMHTMLPreElement
    extends DOMHTMLElement
{


    protected DOMHTMLPreElement(long pointer) {
        super(pointer);
    }

    public boolean getWrap() {
        return WebKitDOMHTMLPreElement.getWrap(this);
    }

    public void setWrap(boolean arg1) {
        WebKitDOMHTMLPreElement.setWrap(this, arg1);
    }

    public long getWidth() {
        return WebKitDOMHTMLPreElement.getWidth(this);
    }

    public void setWidth(long arg1) {
        WebKitDOMHTMLPreElement.setWidth(this, arg1);
    }

}
