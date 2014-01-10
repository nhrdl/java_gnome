
package org.gnome.webKit;


public class DOMHTMLStyleElement
    extends DOMHTMLElement
{


    protected DOMHTMLStyleElement(long pointer) {
        super(pointer);
    }

    public void setMedia(String arg1) {
        WebKitDOMHTMLStyleElement.setMedia(this, arg1);
    }

    public void setScoped(boolean arg1) {
        WebKitDOMHTMLStyleElement.setScoped(this, arg1);
    }

    public boolean getScoped() {
        return WebKitDOMHTMLStyleElement.getScoped(this);
    }

    public String getMedia() {
        return WebKitDOMHTMLStyleElement.getMedia(this);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLStyleElement.setDisabled(this, arg1);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLStyleElement.getDisabled(this);
    }

    public DOMStyleSheet getSheet() {
        return WebKitDOMHTMLStyleElement.getSheet(this);
    }

}
