
package org.gnome.webKit;


public class DOMHTMLBaseElement
    extends DOMHTMLElement
{


    protected DOMHTMLBaseElement(long pointer) {
        super(pointer);
    }

    public String getHref() {
        return WebKitDOMHTMLBaseElement.getHref(this);
    }

    public void setHref(String arg1) {
        WebKitDOMHTMLBaseElement.setHref(this, arg1);
    }

    public String getTarget() {
        return WebKitDOMHTMLBaseElement.getTarget(this);
    }

    public void setTarget(String arg1) {
        WebKitDOMHTMLBaseElement.setTarget(this, arg1);
    }

}
