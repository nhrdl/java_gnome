
package org.gnome.webKit;


public class DOMHTMLFieldSetElement
    extends DOMHTMLElement
{


    protected DOMHTMLFieldSetElement(long pointer) {
        super(pointer);
    }

    public String getValidationMessage() {
        return WebKitDOMHTMLFieldSetElement.getValidationMessage(this);
    }

    public DOMValidityState getValidity() {
        return WebKitDOMHTMLFieldSetElement.getValidity(this);
    }

    public boolean getWillValidate() {
        return WebKitDOMHTMLFieldSetElement.getWillValidate(this);
    }

    public void setCustomValidity(String arg1) {
        WebKitDOMHTMLFieldSetElement.setCustomValidity(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLFieldSetElement.checkValidity(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLFieldSetElement.getForm(this);
    }

}
