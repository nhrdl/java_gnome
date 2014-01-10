
package org.gnome.webKit;


public class DOMHTMLModElement
    extends DOMHTMLElement
{


    protected DOMHTMLModElement(long pointer) {
        super(pointer);
    }

    public String getCite() {
        return WebKitDOMHTMLModElement.getCite(this);
    }

    public void setCite(String arg1) {
        WebKitDOMHTMLModElement.setCite(this, arg1);
    }

    public void setDateTime(String arg1) {
        WebKitDOMHTMLModElement.setDateTime(this, arg1);
    }

    public String getDateTime() {
        return WebKitDOMHTMLModElement.getDateTime(this);
    }

}
