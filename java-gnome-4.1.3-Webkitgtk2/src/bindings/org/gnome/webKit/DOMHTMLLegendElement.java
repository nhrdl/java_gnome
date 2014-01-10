
package org.gnome.webKit;


public class DOMHTMLLegendElement
    extends DOMHTMLElement
{


    protected DOMHTMLLegendElement(long pointer) {
        super(pointer);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLLegendElement.getForm(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLLegendElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLLegendElement.setAlign(this, arg1);
    }

}
