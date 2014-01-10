
package org.gnome.webKit;


public class DOMHTMLKeygenElement
    extends DOMHTMLElement
{


    protected DOMHTMLKeygenElement(long pointer) {
        super(pointer);
    }

    public String getChallenge() {
        return WebKitDOMHTMLKeygenElement.getChallenge(this);
    }

    public String getKeytype() {
        return WebKitDOMHTMLKeygenElement.getKeytype(this);
    }

    public DOMNodeList getLabels() {
        return WebKitDOMHTMLKeygenElement.getLabels(this);
    }

    public String getValidationMessage() {
        return WebKitDOMHTMLKeygenElement.getValidationMessage(this);
    }

    public DOMValidityState getValidity() {
        return WebKitDOMHTMLKeygenElement.getValidity(this);
    }

    public boolean getWillValidate() {
        return WebKitDOMHTMLKeygenElement.getWillValidate(this);
    }

    public void setAutofocus(boolean arg1) {
        WebKitDOMHTMLKeygenElement.setAutofocus(this, arg1);
    }

    public void setChallenge(String arg1) {
        WebKitDOMHTMLKeygenElement.setChallenge(this, arg1);
    }

    public void setCustomValidity(String arg1) {
        WebKitDOMHTMLKeygenElement.setCustomValidity(this, arg1);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLKeygenElement.setDisabled(this, arg1);
    }

    public void setKeytype(String arg1) {
        WebKitDOMHTMLKeygenElement.setKeytype(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLKeygenElement.checkValidity(this);
    }

    public boolean getAutofocus() {
        return WebKitDOMHTMLKeygenElement.getAutofocus(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLKeygenElement.getForm(this);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLKeygenElement.getDisabled(this);
    }

    public String getName() {
        return WebKitDOMHTMLKeygenElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLKeygenElement.setName(this, arg1);
    }

}
