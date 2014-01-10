
package org.gnome.webKit;


public class DOMHTMLObjectElement
    extends DOMHTMLElement
{


    protected DOMHTMLObjectElement(long pointer) {
        super(pointer);
    }

    public String getCodeBase() {
        return WebKitDOMHTMLObjectElement.getCodeBase(this);
    }

    public String getData() {
        return WebKitDOMHTMLObjectElement.getData(this);
    }

    public String getValidationMessage() {
        return WebKitDOMHTMLObjectElement.getValidationMessage(this);
    }

    public DOMValidityState getValidity() {
        return WebKitDOMHTMLObjectElement.getValidity(this);
    }

    public boolean getWillValidate() {
        return WebKitDOMHTMLObjectElement.getWillValidate(this);
    }

    public void setCustomValidity(String arg1) {
        WebKitDOMHTMLObjectElement.setCustomValidity(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLObjectElement.checkValidity(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLObjectElement.getForm(this);
    }

    public String getWidth() {
        return WebKitDOMHTMLObjectElement.getWidth(this);
    }

    public String getHeight() {
        return WebKitDOMHTMLObjectElement.getHeight(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLObjectElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLObjectElement.setAlign(this, arg1);
    }

    public void setBorder(String arg1) {
        WebKitDOMHTMLObjectElement.setBorder(this, arg1);
    }

    public void setWidth(String arg1) {
        WebKitDOMHTMLObjectElement.setWidth(this, arg1);
    }

    public String getBorder() {
        return WebKitDOMHTMLObjectElement.getBorder(this);
    }

    public String getUseMap() {
        return WebKitDOMHTMLObjectElement.getUseMap(this);
    }

    public void setUseMap(String arg1) {
        WebKitDOMHTMLObjectElement.setUseMap(this, arg1);
    }

    public void setHeight(String arg1) {
        WebKitDOMHTMLObjectElement.setHeight(this, arg1);
    }

    public void setData(String arg1) {
        WebKitDOMHTMLObjectElement.setData(this, arg1);
    }

    public String getArchive() {
        return WebKitDOMHTMLObjectElement.getArchive(this);
    }

    public String getCode() {
        return WebKitDOMHTMLObjectElement.getCode(this);
    }

    public String getCodeType() {
        return WebKitDOMHTMLObjectElement.getCodeType(this);
    }

    public DOMDocument getContentDocument() {
        return WebKitDOMHTMLObjectElement.getContentDocument(this);
    }

    public boolean getDeclare() {
        return WebKitDOMHTMLObjectElement.getDeclare(this);
    }

    public long getHspace() {
        return WebKitDOMHTMLObjectElement.getHspace(this);
    }

    public String getStandby() {
        return WebKitDOMHTMLObjectElement.getStandby(this);
    }

    public long getVspace() {
        return WebKitDOMHTMLObjectElement.getVspace(this);
    }

    public void setArchive(String arg1) {
        WebKitDOMHTMLObjectElement.setArchive(this, arg1);
    }

    public void setCode(String arg1) {
        WebKitDOMHTMLObjectElement.setCode(this, arg1);
    }

    public void setCodeBase(String arg1) {
        WebKitDOMHTMLObjectElement.setCodeBase(this, arg1);
    }

    public void setCodeType(String arg1) {
        WebKitDOMHTMLObjectElement.setCodeType(this, arg1);
    }

    public void setDeclare(boolean arg1) {
        WebKitDOMHTMLObjectElement.setDeclare(this, arg1);
    }

    public void setHspace(long arg1) {
        WebKitDOMHTMLObjectElement.setHspace(this, arg1);
    }

    public void setStandby(String arg1) {
        WebKitDOMHTMLObjectElement.setStandby(this, arg1);
    }

    public void setVspace(long arg1) {
        WebKitDOMHTMLObjectElement.setVspace(this, arg1);
    }

    public String getName() {
        return WebKitDOMHTMLObjectElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLObjectElement.setName(this, arg1);
    }

}
