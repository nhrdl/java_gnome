package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLVideoElement extends DOMHTMLMediaElement
{

    protected DOMHTMLVideoElement(long pointer) {
        super(pointer);
    }

    public String getPoster() {
        return WebKitDOMHTMLVideoElement.getPoster(this);
    }

    public void webkitEnterFullScreen() throws GlibException {
        WebKitDOMHTMLVideoElement.webkitEnterFullScreen(this);
    }

    public void webkitEnterFullscreen() throws GlibException {
        WebKitDOMHTMLVideoElement.webkitEnterFullscreen(this);
    }

    public long getWebkitDecodedFrameCount() {
        return WebKitDOMHTMLVideoElement.getWebkitDecodedFrameCount(this);
    }

    public boolean getWebkitDisplayingFullscreen() {
        return WebKitDOMHTMLVideoElement.getWebkitDisplayingFullscreen(this);
    }

    public long getWebkitDroppedFrameCount() {
        return WebKitDOMHTMLVideoElement.getWebkitDroppedFrameCount(this);
    }

    public boolean getWebkitSupportsFullscreen() {
        return WebKitDOMHTMLVideoElement.getWebkitSupportsFullscreen(this);
    }

    public void webkitExitFullscreen() {
        WebKitDOMHTMLVideoElement.webkitExitFullscreen(this);
    }

    public long getVideoWidth() {
        return WebKitDOMHTMLVideoElement.getVideoWidth(this);
    }

    public void webkitExitFullScreen() {
        WebKitDOMHTMLVideoElement.webkitExitFullScreen(this);
    }

    public void setPoster(String arg1) {
        WebKitDOMHTMLVideoElement.setPoster(this, arg1);
    }

    public long getVideoHeight() {
        return WebKitDOMHTMLVideoElement.getVideoHeight(this);
    }

    public long getWidth() {
        return WebKitDOMHTMLVideoElement.getWidth(this);
    }

    public long getHeight() {
        return WebKitDOMHTMLVideoElement.getHeight(this);
    }

    public void setWidth(long arg1) {
        WebKitDOMHTMLVideoElement.setWidth(this, arg1);
    }

    public void setHeight(long arg1) {
        WebKitDOMHTMLVideoElement.setHeight(this, arg1);
    }

}
