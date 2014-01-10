
package org.gnome.webKit;


public class DOMHTMLFormElement
    extends DOMHTMLElement
{


    protected DOMHTMLFormElement(long pointer) {
        super(pointer);
    }

    public String getEncoding() {
        return WebKitDOMHTMLFormElement.getEncoding(this);
    }

    public void setMethod(String arg1) {
        WebKitDOMHTMLFormElement.setMethod(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLFormElement.checkValidity(this);
    }

    public void submit() {
        WebKitDOMHTMLFormElement.submit(this);
    }

    public String getAutocomplete() {
        return WebKitDOMHTMLFormElement.getAutocomplete(this);
    }

    public void setAutocomplete(String arg1) {
        WebKitDOMHTMLFormElement.setAutocomplete(this, arg1);
    }

    public String getEnctype() {
        return WebKitDOMHTMLFormElement.getEnctype(this);
    }

    public boolean getNoValidate() {
        return WebKitDOMHTMLFormElement.getNoValidate(this);
    }

    public void setAcceptCharset(String arg1) {
        WebKitDOMHTMLFormElement.setAcceptCharset(this, arg1);
    }

    public void setAction(String arg1) {
        WebKitDOMHTMLFormElement.setAction(this, arg1);
    }

    public void setEncoding(String arg1) {
        WebKitDOMHTMLFormElement.setEncoding(this, arg1);
    }

    public void setEnctype(String arg1) {
        WebKitDOMHTMLFormElement.setEnctype(this, arg1);
    }

    public void setNoValidate(boolean arg1) {
        WebKitDOMHTMLFormElement.setNoValidate(this, arg1);
    }

    public void dispatchFormChange() {
        WebKitDOMHTMLFormElement.dispatchFormChange(this);
    }

    public String getAction() {
        return WebKitDOMHTMLFormElement.getAction(this);
    }

    public DOMHTMLCollection getElements() {
        return WebKitDOMHTMLFormElement.getElements(this);
    }

    public void dispatchFormInput() {
        WebKitDOMHTMLFormElement.dispatchFormInput(this);
    }

    public String getAcceptCharset() {
        return WebKitDOMHTMLFormElement.getAcceptCharset(this);
    }

    public long getLength() {
        return WebKitDOMHTMLFormElement.getLength(this);
    }

    public String getName() {
        return WebKitDOMHTMLFormElement.getName(this);
    }

    public String getMethod() {
        return WebKitDOMHTMLFormElement.getMethod(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLFormElement.setName(this, arg1);
    }

    public String getTarget() {
        return WebKitDOMHTMLFormElement.getTarget(this);
    }

    public void setTarget(String arg1) {
        WebKitDOMHTMLFormElement.setTarget(this, arg1);
    }

    public void reset() {
        WebKitDOMHTMLFormElement.reset(this);
    }

}
