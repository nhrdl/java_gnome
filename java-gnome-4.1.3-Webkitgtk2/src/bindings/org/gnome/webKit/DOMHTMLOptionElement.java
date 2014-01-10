
package org.gnome.webKit;


public class DOMHTMLOptionElement
    extends DOMHTMLElement
{


    protected DOMHTMLOptionElement(long pointer) {
        super(pointer);
    }

    public boolean getDefaultSelected() {
        return WebKitDOMHTMLOptionElement.getDefaultSelected(this);
    }

    public boolean getSelected() {
        return WebKitDOMHTMLOptionElement.getSelected(this);
    }

    public void setDefaultSelected(boolean arg1) {
        WebKitDOMHTMLOptionElement.setDefaultSelected(this, arg1);
    }

    public long getIndex() {
        return WebKitDOMHTMLOptionElement.getIndex(this);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLOptionElement.setDisabled(this, arg1);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLOptionElement.getForm(this);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLOptionElement.getDisabled(this);
    }

    public String getLabel() {
        return WebKitDOMHTMLOptionElement.getLabel(this);
    }

    public void setLabel(String arg1) {
        WebKitDOMHTMLOptionElement.setLabel(this, arg1);
    }

    public void setSelected(boolean arg1) {
        WebKitDOMHTMLOptionElement.setSelected(this, arg1);
    }

    public String getText() {
        return WebKitDOMHTMLOptionElement.getText(this);
    }

    public String getValue() {
        return WebKitDOMHTMLOptionElement.getValue(this);
    }

    public void setValue(String arg1) {
        WebKitDOMHTMLOptionElement.setValue(this, arg1);
    }

}
