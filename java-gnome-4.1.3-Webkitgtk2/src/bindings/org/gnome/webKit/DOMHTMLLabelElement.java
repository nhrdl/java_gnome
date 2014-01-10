
package org.gnome.webKit;


public class DOMHTMLLabelElement
    extends DOMHTMLElement
{


    protected DOMHTMLLabelElement(long pointer) {
        super(pointer);
    }

    public DOMHTMLElement getControl() {
        return WebKitDOMHTMLLabelElement.getControl(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLLabelElement.getForm(this);
    }

    public void setHtmlFor(String arg1) {
        WebKitDOMHTMLLabelElement.setHtmlFor(this, arg1);
    }

    public String getHtmlFor() {
        return WebKitDOMHTMLLabelElement.getHtmlFor(this);
    }

}
