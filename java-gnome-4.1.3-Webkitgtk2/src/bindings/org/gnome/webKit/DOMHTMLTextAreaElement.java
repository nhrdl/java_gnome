package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLTextAreaElement extends DOMHTMLElement
{

    protected DOMHTMLTextAreaElement(long pointer) {
        super(pointer);
    }

    public String getWrap() {
        return WebKitDOMHTMLTextAreaElement.getWrap(this);
    }

    public void setSelectionDirection(String arg1) {
        WebKitDOMHTMLTextAreaElement.setSelectionDirection(this, arg1);
    }

    public void setSelectionRange(long arg1, long arg2, String arg3) {
        WebKitDOMHTMLTextAreaElement.setSelectionRange(this, arg1, arg2, arg3);
    }

    public void setSelectionStart(long arg1) {
        WebKitDOMHTMLTextAreaElement.setSelectionStart(this, arg1);
    }

    public void setWrap(String arg1) {
        WebKitDOMHTMLTextAreaElement.setWrap(this, arg1);
    }

    public long getSelectionStart() {
        return WebKitDOMHTMLTextAreaElement.getSelectionStart(this);
    }

    public long getSelectionEnd() {
        return WebKitDOMHTMLTextAreaElement.getSelectionEnd(this);
    }

    public String getSelectionDirection() {
        return WebKitDOMHTMLTextAreaElement.getSelectionDirection(this);
    }

    public void setSelectionEnd(long arg1) {
        WebKitDOMHTMLTextAreaElement.setSelectionEnd(this, arg1);
    }

    public long getTextLength() {
        return WebKitDOMHTMLTextAreaElement.getTextLength(this);
    }

    public DOMNodeList getLabels() {
        return WebKitDOMHTMLTextAreaElement.getLabels(this);
    }

    public String getValidationMessage() {
        return WebKitDOMHTMLTextAreaElement.getValidationMessage(this);
    }

    public DOMValidityState getValidity() {
        return WebKitDOMHTMLTextAreaElement.getValidity(this);
    }

    public boolean getWillValidate() {
        return WebKitDOMHTMLTextAreaElement.getWillValidate(this);
    }

    public void setAutofocus(boolean arg1) {
        WebKitDOMHTMLTextAreaElement.setAutofocus(this, arg1);
    }

    public void setCustomValidity(String arg1) {
        WebKitDOMHTMLTextAreaElement.setCustomValidity(this, arg1);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLTextAreaElement.setDisabled(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLTextAreaElement.checkValidity(this);
    }

    public boolean getAutofocus() {
        return WebKitDOMHTMLTextAreaElement.getAutofocus(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLTextAreaElement.getForm(this);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLTextAreaElement.getDisabled(this);
    }

    public String getDirName() {
        return WebKitDOMHTMLTextAreaElement.getDirName(this);
    }

    public void setRows(long arg1) {
        WebKitDOMHTMLTextAreaElement.setRows(this, arg1);
    }

    public long getCols() {
        return WebKitDOMHTMLTextAreaElement.getCols(this);
    }

    public long getRows() {
        return WebKitDOMHTMLTextAreaElement.getRows(this);
    }

    public void setCols(long arg1) {
        WebKitDOMHTMLTextAreaElement.setCols(this, arg1);
    }

    public long getMaxLength() {
        return WebKitDOMHTMLTextAreaElement.getMaxLength(this);
    }

    public String getPlaceholder() {
        return WebKitDOMHTMLTextAreaElement.getPlaceholder(this);
    }

    public boolean getReadOnly() {
        return WebKitDOMHTMLTextAreaElement.getReadOnly(this);
    }

    public boolean getRequired() {
        return WebKitDOMHTMLTextAreaElement.getRequired(this);
    }

    public boolean isEdited() {
        return WebKitDOMHTMLTextAreaElement.isEdited(this);
    }

    public void select() {
        WebKitDOMHTMLTextAreaElement.select(this);
    }

    public void setDefaultValue(String arg1) {
        WebKitDOMHTMLTextAreaElement.setDefaultValue(this, arg1);
    }

    public void setDirName(String arg1) {
        WebKitDOMHTMLTextAreaElement.setDirName(this, arg1);
    }

    public void setMaxLength(long arg1) throws GlibException {
        WebKitDOMHTMLTextAreaElement.setMaxLength(this, arg1);
    }

    public void setPlaceholder(String arg1) {
        WebKitDOMHTMLTextAreaElement.setPlaceholder(this, arg1);
    }

    public void setRequired(boolean arg1) {
        WebKitDOMHTMLTextAreaElement.setRequired(this, arg1);
    }

    public String getName() {
        return WebKitDOMHTMLTextAreaElement.getName(this);
    }

    public String getValue() {
        return WebKitDOMHTMLTextAreaElement.getValue(this);
    }

    public void setReadOnly(boolean arg1) {
        WebKitDOMHTMLTextAreaElement.setReadOnly(this, arg1);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLTextAreaElement.setName(this, arg1);
    }

    public String getDefaultValue() {
        return WebKitDOMHTMLTextAreaElement.getDefaultValue(this);
    }

    public void setValue(String arg1) {
        WebKitDOMHTMLTextAreaElement.setValue(this, arg1);
    }

}
