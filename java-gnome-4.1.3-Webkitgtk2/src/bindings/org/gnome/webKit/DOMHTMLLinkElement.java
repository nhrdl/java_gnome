
package org.gnome.webKit;


public class DOMHTMLLinkElement
    extends DOMHTMLElement
{


    protected DOMHTMLLinkElement(long pointer) {
        super(pointer);
    }

    public String getHreflang() {
        return WebKitDOMHTMLLinkElement.getHreflang(this);
    }

    public String getRel() {
        return WebKitDOMHTMLLinkElement.getRel(this);
    }

    public String getRev() {
        return WebKitDOMHTMLLinkElement.getRev(this);
    }

    public void setHreflang(String arg1) {
        WebKitDOMHTMLLinkElement.setHreflang(this, arg1);
    }

    public void setRel(String arg1) {
        WebKitDOMHTMLLinkElement.setRel(this, arg1);
    }

    public void setRev(String arg1) {
        WebKitDOMHTMLLinkElement.setRev(this, arg1);
    }

    public void setMedia(String arg1) {
        WebKitDOMHTMLLinkElement.setMedia(this, arg1);
    }

    public String getMedia() {
        return WebKitDOMHTMLLinkElement.getMedia(this);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLLinkElement.setDisabled(this, arg1);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLLinkElement.getDisabled(this);
    }

    public String getHref() {
        return WebKitDOMHTMLLinkElement.getHref(this);
    }

    public void setHref(String arg1) {
        WebKitDOMHTMLLinkElement.setHref(this, arg1);
    }

    public String getCharset() {
        return WebKitDOMHTMLLinkElement.getCharset(this);
    }

    public void setCharset(String arg1) {
        WebKitDOMHTMLLinkElement.setCharset(this, arg1);
    }

    public DOMStyleSheet getSheet() {
        return WebKitDOMHTMLLinkElement.getSheet(this);
    }

    public String getTarget() {
        return WebKitDOMHTMLLinkElement.getTarget(this);
    }

    public void setTarget(String arg1) {
        WebKitDOMHTMLLinkElement.setTarget(this, arg1);
    }

}
