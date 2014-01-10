
package org.gnome.webKit;


public class DOMHTMLParamElement
    extends DOMHTMLElement
{


    protected DOMHTMLParamElement(long pointer) {
        super(pointer);
    }

    public void setValueType(String arg1) {
        WebKitDOMHTMLParamElement.setValueType(this, arg1);
    }

    public String getValueType() {
        return WebKitDOMHTMLParamElement.getValueType(this);
    }

    public String getName() {
        return WebKitDOMHTMLParamElement.getName(this);
    }

    public String getValue() {
        return WebKitDOMHTMLParamElement.getValue(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLParamElement.setName(this, arg1);
    }

    public void setValue(String arg1) {
        WebKitDOMHTMLParamElement.setValue(this, arg1);
    }

}
