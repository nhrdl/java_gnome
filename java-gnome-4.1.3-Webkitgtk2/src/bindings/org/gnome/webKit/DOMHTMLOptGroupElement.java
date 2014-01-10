
package org.gnome.webKit;


public class DOMHTMLOptGroupElement
    extends DOMHTMLElement
{


    protected DOMHTMLOptGroupElement(long pointer) {
        super(pointer);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLOptGroupElement.setDisabled(this, arg1);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLOptGroupElement.getDisabled(this);
    }

    public String getLabel() {
        return WebKitDOMHTMLOptGroupElement.getLabel(this);
    }

    public void setLabel(String arg1) {
        WebKitDOMHTMLOptGroupElement.setLabel(this, arg1);
    }

}
