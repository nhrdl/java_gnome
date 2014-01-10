
package org.gnome.webKit;


public class DOMHTMLDocument
    extends DOMDocument
{


    protected DOMHTMLDocument(long pointer) {
        super(pointer);
    }

    public String getAlinkColor() {
        return WebKitDOMHTMLDocument.getAlinkColor(this);
    }

    public DOMElement getActiveElement() {
        return WebKitDOMHTMLDocument.getActiveElement(this);
    }

    public String getDir() {
        return WebKitDOMHTMLDocument.getDir(this);
    }

    public String getCompatMode() {
        return WebKitDOMHTMLDocument.getCompatMode(this);
    }

    public String getFgColor() {
        return WebKitDOMHTMLDocument.getFgColor(this);
    }

    public String getDesignMode() {
        return WebKitDOMHTMLDocument.getDesignMode(this);
    }

    public DOMHTMLCollection getEmbeds() {
        return WebKitDOMHTMLDocument.getEmbeds(this);
    }

    public String getLinkColor() {
        return WebKitDOMHTMLDocument.getLinkColor(this);
    }

    public DOMHTMLCollection getScripts() {
        return WebKitDOMHTMLDocument.getScripts(this);
    }

    public String getVlinkColor() {
        return WebKitDOMHTMLDocument.getVlinkColor(this);
    }

    public boolean hasFocus() {
        return WebKitDOMHTMLDocument.hasFocus(this);
    }

    public void setAlinkColor(String arg1) {
        WebKitDOMHTMLDocument.setAlinkColor(this, arg1);
    }

    public void setDesignMode(String arg1) {
        WebKitDOMHTMLDocument.setDesignMode(this, arg1);
    }

    public void setDir(String arg1) {
        WebKitDOMHTMLDocument.setDir(this, arg1);
    }

    public void setFgColor(String arg1) {
        WebKitDOMHTMLDocument.setFgColor(this, arg1);
    }

    public void setLinkColor(String arg1) {
        WebKitDOMHTMLDocument.setLinkColor(this, arg1);
    }

    public void setVlinkColor(String arg1) {
        WebKitDOMHTMLDocument.setVlinkColor(this, arg1);
    }

    public void open() {
        WebKitDOMHTMLDocument.open(this);
    }

    public void captureEvents() {
        WebKitDOMHTMLDocument.captureEvents(this);
    }

    public void releaseEvents() {
        WebKitDOMHTMLDocument.releaseEvents(this);
    }

    public DOMHTMLCollection getPlugins() {
        return WebKitDOMHTMLDocument.getPlugins(this);
    }

    public long getWidth() {
        return WebKitDOMHTMLDocument.getWidth(this);
    }

    public long getHeight() {
        return WebKitDOMHTMLDocument.getHeight(this);
    }

    public void setBgColor(String arg1) {
        WebKitDOMHTMLDocument.setBgColor(this, arg1);
    }

    public String getBgColor() {
        return WebKitDOMHTMLDocument.getBgColor(this);
    }

    public void clear() {
        WebKitDOMHTMLDocument.clear(this);
    }

    public void close() {
        WebKitDOMHTMLDocument.close(this);
    }

}
