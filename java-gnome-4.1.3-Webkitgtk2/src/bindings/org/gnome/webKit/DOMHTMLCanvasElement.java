
package org.gnome.webKit;


public class DOMHTMLCanvasElement
    extends DOMHTMLElement
{


    protected DOMHTMLCanvasElement(long pointer) {
        super(pointer);
    }

    public long getWidth() {
        return WebKitDOMHTMLCanvasElement.getWidth(this);
    }

    public long getHeight() {
        return WebKitDOMHTMLCanvasElement.getHeight(this);
    }

    public void setWidth(long arg1) {
        WebKitDOMHTMLCanvasElement.setWidth(this, arg1);
    }

    public void setHeight(long arg1) {
        WebKitDOMHTMLCanvasElement.setHeight(this, arg1);
    }

}
