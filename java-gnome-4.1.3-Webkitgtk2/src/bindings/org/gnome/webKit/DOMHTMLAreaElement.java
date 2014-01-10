
package org.gnome.webKit;


public class DOMHTMLAreaElement
    extends DOMHTMLElement
{


    protected DOMHTMLAreaElement(long pointer) {
        super(pointer);
    }

    public String getHost() {
        return WebKitDOMHTMLAreaElement.getHost(this);
    }

    public String getProtocol() {
        return WebKitDOMHTMLAreaElement.getProtocol(this);
    }

    public String getPort() {
        return WebKitDOMHTMLAreaElement.getPort(this);
    }

    public String getAlt() {
        return WebKitDOMHTMLAreaElement.getAlt(this);
    }

    public String getHref() {
        return WebKitDOMHTMLAreaElement.getHref(this);
    }

    public void setHref(String arg1) {
        WebKitDOMHTMLAreaElement.setHref(this, arg1);
    }

    public void setAlt(String arg1) {
        WebKitDOMHTMLAreaElement.setAlt(this, arg1);
    }

    public String getCoords() {
        return WebKitDOMHTMLAreaElement.getCoords(this);
    }

    public String getHash() {
        return WebKitDOMHTMLAreaElement.getHash(this);
    }

    public String getHostname() {
        return WebKitDOMHTMLAreaElement.getHostname(this);
    }

    public boolean getNoHref() {
        return WebKitDOMHTMLAreaElement.getNoHref(this);
    }

    public String getPathname() {
        return WebKitDOMHTMLAreaElement.getPathname(this);
    }

    public String getPing() {
        return WebKitDOMHTMLAreaElement.getPing(this);
    }

    public String getSearch() {
        return WebKitDOMHTMLAreaElement.getSearch(this);
    }

    public String getShape() {
        return WebKitDOMHTMLAreaElement.getShape(this);
    }

    public void setCoords(String arg1) {
        WebKitDOMHTMLAreaElement.setCoords(this, arg1);
    }

    public void setNoHref(boolean arg1) {
        WebKitDOMHTMLAreaElement.setNoHref(this, arg1);
    }

    public void setPing(String arg1) {
        WebKitDOMHTMLAreaElement.setPing(this, arg1);
    }

    public void setShape(String arg1) {
        WebKitDOMHTMLAreaElement.setShape(this, arg1);
    }

    public String getTarget() {
        return WebKitDOMHTMLAreaElement.getTarget(this);
    }

    public void setTarget(String arg1) {
        WebKitDOMHTMLAreaElement.setTarget(this, arg1);
    }

}
