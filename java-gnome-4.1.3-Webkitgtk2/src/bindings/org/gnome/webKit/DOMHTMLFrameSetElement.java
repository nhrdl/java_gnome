
package org.gnome.webKit;


public class DOMHTMLFrameSetElement
    extends DOMHTMLElement
{


    protected DOMHTMLFrameSetElement(long pointer) {
        super(pointer);
    }

    public void setRows(String arg1) {
        WebKitDOMHTMLFrameSetElement.setRows(this, arg1);
    }

    public String getCols() {
        return WebKitDOMHTMLFrameSetElement.getCols(this);
    }

    public String getRows() {
        return WebKitDOMHTMLFrameSetElement.getRows(this);
    }

    public void setCols(String arg1) {
        WebKitDOMHTMLFrameSetElement.setCols(this, arg1);
    }

}
