package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMDOMWindow extends DOMObject
{

    protected DOMDOMWindow(long pointer) {
        super(pointer);
    }

    public void clearTimeout(long arg1) {
        WebKitDOMDOMWindow.clearTimeout(this, arg1);
    }

    public boolean confirm(String arg1) {
        return WebKitDOMDOMWindow.confirm(this, arg1);
    }

    public boolean getClosed() {
        return WebKitDOMDOMWindow.getClosed(this);
    }

    public DOMCSSStyleDeclaration getComputedStyle(DOMElement arg1, String arg2) {
        return WebKitDOMDOMWindow.getComputedStyle(this, arg1, arg2);
    }

    public DOMConsole getConsole() {
        return WebKitDOMDOMWindow.getConsole(this);
    }

    public String getDefaultStatus() {
        return WebKitDOMDOMWindow.getDefaultStatus(this);
    }

    public double getDevicePixelRatio() {
        return WebKitDOMDOMWindow.getDevicePixelRatio(this);
    }

    public DOMDocument getDocument() {
        return WebKitDOMDOMWindow.getDocument(this);
    }

    public DOMElement getFrameElement() {
        return WebKitDOMDOMWindow.getFrameElement(this);
    }

    public org.gnome.webKit.DOMDOMWindow getFrames() {
        return WebKitDOMDOMWindow.getFrames(this);
    }

    public void focus() {
        WebKitDOMDOMWindow.focus(this);
    }

    public DOMDOMApplicationCache getApplicationCache() {
        return WebKitDOMDOMWindow.getApplicationCache(this);
    }

    public DOMNavigator getClientInformation() {
        return WebKitDOMDOMWindow.getClientInformation(this);
    }

    public String btoa(String arg1) throws GlibException {
        return WebKitDOMDOMWindow.btoa(this, arg1);
    }

    public void captureEvents() {
        WebKitDOMDOMWindow.captureEvents(this);
    }

    public void clearInterval(long arg1) {
        WebKitDOMDOMWindow.clearInterval(this, arg1);
    }

    public long getScrollY() {
        return WebKitDOMDOMWindow.getScrollY(this);
    }

   

    public DOMDOMSelection getSelection() {
        return WebKitDOMDOMWindow.getSelection(this);
    }

    public org.gnome.webKit.DOMDOMWindow getSelf() {
        return WebKitDOMDOMWindow.getSelf(this);
    }

    public DOMStorage getSessionStorage() throws GlibException {
        return WebKitDOMDOMWindow.getSessionStorage(this);
    }

    public String getStatus() {
        return WebKitDOMDOMWindow.getStatus(this);
    }

   

    public DOMStyleMedia getStyleMedia() {
        return WebKitDOMDOMWindow.getStyleMedia(this);
    }

    

    public org.gnome.webKit.DOMDOMWindow getTop() {
        return WebKitDOMDOMWindow.getTop(this);
    }

    public org.gnome.webKit.DOMDOMWindow getWindow() {
        return WebKitDOMDOMWindow.getWindow(this);
    }

    public DOMMediaQueryList matchMedia(String arg1) {
        return WebKitDOMDOMWindow.matchMedia(this, arg1);
    }

    public void moveBy(float arg1, float arg2) {
        WebKitDOMDOMWindow.moveBy(this, arg1, arg2);
    }

    public void moveTo(float arg1, float arg2) {
        WebKitDOMDOMWindow.moveTo(this, arg1, arg2);
    }

    public String prompt(String arg1, String arg2) {
        return WebKitDOMDOMWindow.prompt(this, arg1, arg2);
    }

    public void releaseEvents() {
        WebKitDOMDOMWindow.releaseEvents(this);
    }

    public void resizeBy(float arg1, float arg2) {
        WebKitDOMDOMWindow.resizeBy(this, arg1, arg2);
    }

    public void resizeTo(float arg1, float arg2) {
        WebKitDOMDOMWindow.resizeTo(this, arg1, arg2);
    }

    public void scroll(long arg1, long arg2) {
        WebKitDOMDOMWindow.scroll(this, arg1, arg2);
    }

    public void scrollBy(long arg1, long arg2) {
        WebKitDOMDOMWindow.scrollBy(this, arg1, arg2);
    }

    public boolean dispatchEvent(DOMEvent arg1) throws GlibException {
        return WebKitDOMDOMWindow.dispatchEvent(this, arg1);
    }

    public void alert(String arg1) {
        WebKitDOMDOMWindow.alert(this, arg1);
    }

    public String atob(String arg1) throws GlibException {
        return WebKitDOMDOMWindow.atob(this, arg1);
    }

    public DOMHistory getHistory() {
        return WebKitDOMDOMWindow.getHistory(this);
    }

    public long getInnerHeight() {
        return WebKitDOMDOMWindow.getInnerHeight(this);
    }

    public long getInnerWidth() {
        return WebKitDOMDOMWindow.getInnerWidth(this);
    }

    public DOMStorage getLocalStorage() throws GlibException {
        return WebKitDOMDOMWindow.getLocalStorage(this);
    }

   

    public DOMNavigator getNavigator() {
        return WebKitDOMDOMWindow.getNavigator(this);
    }

    public boolean getOffscreenBuffering() {
        return WebKitDOMDOMWindow.getOffscreenBuffering(this);
    }

    public org.gnome.webKit.DOMDOMWindow getOpener() {
        return WebKitDOMDOMWindow.getOpener(this);
    }

    public long getOuterHeight() {
        return WebKitDOMDOMWindow.getOuterHeight(this);
    }

    public long getOuterWidth() {
        return WebKitDOMDOMWindow.getOuterWidth(this);
    }

    public long getPageXOffset() {
        return WebKitDOMDOMWindow.getPageXOffset(this);
    }

    public long getPageYOffset() {
        return WebKitDOMDOMWindow.getPageYOffset(this);
    }

    

    public DOMScreen getScreen() {
        return WebKitDOMDOMWindow.getScreen(this);
    }

    public long getScreenLeft() {
        return WebKitDOMDOMWindow.getScreenLeft(this);
    }

    public long getScreenTop() {
        return WebKitDOMDOMWindow.getScreenTop(this);
    }

    public long getScreenX() {
        return WebKitDOMDOMWindow.getScreenX(this);
    }

    public long getScreenY() {
        return WebKitDOMDOMWindow.getScreenY(this);
    }

    public long getScrollX() {
        return WebKitDOMDOMWindow.getScrollX(this);
    }

    public void blur() {
        WebKitDOMDOMWindow.blur(this);
    }

    public void scrollTo(long arg1, long arg2) {
        WebKitDOMDOMWindow.scrollTo(this, arg1, arg2);
    }

    public void setDefaultStatus(String arg1) {
        WebKitDOMDOMWindow.setDefaultStatus(this, arg1);
    }

    public void setStatus(String arg1) {
        WebKitDOMDOMWindow.setStatus(this, arg1);
    }

    public void webkitCancelAnimationFrame(long arg1) {
        WebKitDOMDOMWindow.webkitCancelAnimationFrame(this, arg1);
    }

    public void webkitCancelRequestAnimationFrame(long arg1) {
        WebKitDOMDOMWindow.webkitCancelRequestAnimationFrame(this, arg1);
    }

    public DOMWebKitPoint webkitConvertPointFromNodeToPage(DOMNode arg1, DOMWebKitPoint arg2) {
        return WebKitDOMDOMWindow.webkitConvertPointFromNodeToPage(this, arg1, arg2);
    }

    public DOMWebKitPoint webkitConvertPointFromPageToNode(DOMNode arg1, DOMWebKitPoint arg2) {
        return WebKitDOMDOMWindow.webkitConvertPointFromPageToNode(this, arg1, arg2);
    }

    public long getLength() {
        return WebKitDOMDOMWindow.getLength(this);
    }

    public String getName() {
        return WebKitDOMDOMWindow.getName(this);
    }

    public boolean find(String arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5,
            boolean arg6, boolean arg7) {
        return WebKitDOMDOMWindow.find(this, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public org.gnome.webKit.DOMDOMWindow getParent() {
        return WebKitDOMDOMWindow.getParent(this);
    }

    public void setName(String arg1) {
        WebKitDOMDOMWindow.setName(this, arg1);
    }

    public void stop() {
        WebKitDOMDOMWindow.stop(this);
    }

    public void print() {
        WebKitDOMDOMWindow.print(this);
    }

    public void close() {
        WebKitDOMDOMWindow.close(this);
    }

}
