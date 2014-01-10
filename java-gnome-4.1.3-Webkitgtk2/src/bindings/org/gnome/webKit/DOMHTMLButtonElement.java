
package org.gnome.webKit;


public class DOMHTMLButtonElement
    extends DOMHTMLElement
{


    protected DOMHTMLButtonElement(long pointer) {
        super(pointer);
    }

    public DOMNodeList getLabels() {
        return WebKitDOMHTMLButtonElement.getLabels(this);
    }

    public String getValidationMessage() {
        return WebKitDOMHTMLButtonElement.getValidationMessage(this);
    }

    public DOMValidityState getValidity() {
        return WebKitDOMHTMLButtonElement.getValidity(this);
    }

    public boolean getWillValidate() {
        return WebKitDOMHTMLButtonElement.getWillValidate(this);
    }

    public void setAutofocus(boolean arg1) {
        WebKitDOMHTMLButtonElement.setAutofocus(this, arg1);
    }

    public void setCustomValidity(String arg1) {
        WebKitDOMHTMLButtonElement.setCustomValidity(this, arg1);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLButtonElement.setDisabled(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLButtonElement.checkValidity(this);
    }

    public boolean getAutofocus() {
        return WebKitDOMHTMLButtonElement.getAutofocus(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLButtonElement.getForm(this);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLButtonElement.getDisabled(this);
    }

    public String getFormAction() {
        return WebKitDOMHTMLButtonElement.getFormAction(this);
    }

    public String getFormEnctype() {
        return WebKitDOMHTMLButtonElement.getFormEnctype(this);
    }

    public String getFormMethod() {
        return WebKitDOMHTMLButtonElement.getFormMethod(this);
    }

    public boolean getFormNoValidate() {
        return WebKitDOMHTMLButtonElement.getFormNoValidate(this);
    }

    public String getFormTarget() {
        return WebKitDOMHTMLButtonElement.getFormTarget(this);
    }

    public void setFormAction(String arg1) {
        WebKitDOMHTMLButtonElement.setFormAction(this, arg1);
    }

    public void setFormEnctype(String arg1) {
        WebKitDOMHTMLButtonElement.setFormEnctype(this, arg1);
    }

    public void setFormMethod(String arg1) {
        WebKitDOMHTMLButtonElement.setFormMethod(this, arg1);
    }

    public void setFormNoValidate(boolean arg1) {
        WebKitDOMHTMLButtonElement.setFormNoValidate(this, arg1);
    }

    public void setFormTarget(String arg1) {
        WebKitDOMHTMLButtonElement.setFormTarget(this, arg1);
    }

    public String getName() {
        return WebKitDOMHTMLButtonElement.getName(this);
    }

    public String getValue() {
        return WebKitDOMHTMLButtonElement.getValue(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLButtonElement.setName(this, arg1);
    }

    public void setValue(String arg1) {
        WebKitDOMHTMLButtonElement.setValue(this, arg1);
    }

}
