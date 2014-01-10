package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLSelectElement extends DOMHTMLElement
{

    protected DOMHTMLSelectElement(long pointer) {
        super(pointer);
    }

    public long getSelectedIndex() {
        return WebKitDOMHTMLSelectElement.getSelectedIndex(this);
    }

    public void setSelectedIndex(long arg1) {
        WebKitDOMHTMLSelectElement.setSelectedIndex(this, arg1);
    }

    public DOMHTMLOptionsCollection getOptions() {
        return WebKitDOMHTMLSelectElement.getOptions(this);
    }

    public DOMNode item(long arg1) {
        return WebKitDOMHTMLSelectElement.item(this, arg1);
    }

    public DOMNodeList getLabels() {
        return WebKitDOMHTMLSelectElement.getLabels(this);
    }

    public String getValidationMessage() {
        return WebKitDOMHTMLSelectElement.getValidationMessage(this);
    }

    public DOMValidityState getValidity() {
        return WebKitDOMHTMLSelectElement.getValidity(this);
    }

    public boolean getWillValidate() {
        return WebKitDOMHTMLSelectElement.getWillValidate(this);
    }

    public void setAutofocus(boolean arg1) {
        WebKitDOMHTMLSelectElement.setAutofocus(this, arg1);
    }

    public void setCustomValidity(String arg1) {
        WebKitDOMHTMLSelectElement.setCustomValidity(this, arg1);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLSelectElement.setDisabled(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLSelectElement.checkValidity(this);
    }

    public boolean getAutofocus() {
        return WebKitDOMHTMLSelectElement.getAutofocus(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLSelectElement.getForm(this);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLSelectElement.getDisabled(this);
    }

    public boolean getMultiple() {
        return WebKitDOMHTMLSelectElement.getMultiple(this);
    }

    public boolean getRequired() {
        return WebKitDOMHTMLSelectElement.getRequired(this);
    }

    public DOMNode namedItem(String arg1) {
        return WebKitDOMHTMLSelectElement.namedItem(this, arg1);
    }

    public void setMultiple(boolean arg1) {
        WebKitDOMHTMLSelectElement.setMultiple(this, arg1);
    }

    public void setRequired(boolean arg1) {
        WebKitDOMHTMLSelectElement.setRequired(this, arg1);
    }

    public void add(DOMHTMLElement arg1, DOMHTMLElement arg2) throws GlibException {
        WebKitDOMHTMLSelectElement.add(this, arg1, arg2);
    }

    public long getLength() {
        return WebKitDOMHTMLSelectElement.getLength(this);
    }

    public String getName() {
        return WebKitDOMHTMLSelectElement.getName(this);
    }

    public String getValue() {
        return WebKitDOMHTMLSelectElement.getValue(this);
    }

    public void remove(long arg1) {
        WebKitDOMHTMLSelectElement.remove(this, arg1);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLSelectElement.setName(this, arg1);
    }

    public long getSize() {
        return WebKitDOMHTMLSelectElement.getSize(this);
    }

    public void setLength(long arg1) throws GlibException {
        WebKitDOMHTMLSelectElement.setLength(this, arg1);
    }

    public void setSize(long arg1) {
        WebKitDOMHTMLSelectElement.setSize(this, arg1);
    }

    public void setValue(String arg1) {
        WebKitDOMHTMLSelectElement.setValue(this, arg1);
    }

}
