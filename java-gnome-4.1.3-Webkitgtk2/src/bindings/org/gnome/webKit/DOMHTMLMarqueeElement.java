package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLMarqueeElement extends DOMHTMLElement
{

    protected DOMHTMLMarqueeElement(long pointer) {
        super(pointer);
    }

    public String getWidth() {
        return WebKitDOMHTMLMarqueeElement.getWidth(this);
    }

    public String getHeight() {
        return WebKitDOMHTMLMarqueeElement.getHeight(this);
    }

    public void setBgColor(String arg1) {
        WebKitDOMHTMLMarqueeElement.setBgColor(this, arg1);
    }

    public void setWidth(String arg1) {
        WebKitDOMHTMLMarqueeElement.setWidth(this, arg1);
    }

    public String getBgColor() {
        return WebKitDOMHTMLMarqueeElement.getBgColor(this);
    }

    public void setHeight(String arg1) {
        WebKitDOMHTMLMarqueeElement.setHeight(this, arg1);
    }

    public long getHspace() {
        return WebKitDOMHTMLMarqueeElement.getHspace(this);
    }

    public long getVspace() {
        return WebKitDOMHTMLMarqueeElement.getVspace(this);
    }

    public void setHspace(long arg1) {
        WebKitDOMHTMLMarqueeElement.setHspace(this, arg1);
    }

    public void setVspace(long arg1) {
        WebKitDOMHTMLMarqueeElement.setVspace(this, arg1);
    }

    public long getScrollDelay() {
        return WebKitDOMHTMLMarqueeElement.getScrollDelay(this);
    }

    public boolean getTrueSpeed() {
        return WebKitDOMHTMLMarqueeElement.getTrueSpeed(this);
    }

    public void setBehavior(String arg1) {
        WebKitDOMHTMLMarqueeElement.setBehavior(this, arg1);
    }

    public void setDirection(String arg1) {
        WebKitDOMHTMLMarqueeElement.setDirection(this, arg1);
    }

    public void setLoop(long arg1) throws GlibException {
        WebKitDOMHTMLMarqueeElement.setLoop(this, arg1);
    }

    public void setScrollAmount(long arg1) throws GlibException {
        WebKitDOMHTMLMarqueeElement.setScrollAmount(this, arg1);
    }

    public void setScrollDelay(long arg1) throws GlibException {
        WebKitDOMHTMLMarqueeElement.setScrollDelay(this, arg1);
    }

    public void setTrueSpeed(boolean arg1) throws GlibException {
        WebKitDOMHTMLMarqueeElement.setTrueSpeed(this, arg1);
    }

    public String getDirection() {
        return WebKitDOMHTMLMarqueeElement.getDirection(this);
    }

    public String getBehavior() {
        return WebKitDOMHTMLMarqueeElement.getBehavior(this);
    }

    public long getLoop() {
        return WebKitDOMHTMLMarqueeElement.getLoop(this);
    }

    public long getScrollAmount() {
        return WebKitDOMHTMLMarqueeElement.getScrollAmount(this);
    }

    public void start() {
        WebKitDOMHTMLMarqueeElement.start(this);
    }

    public void stop() {
        WebKitDOMHTMLMarqueeElement.stop(this);
    }

}
