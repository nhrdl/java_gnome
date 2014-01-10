package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMElement extends DOMNode
{

    protected DOMElement(long pointer) {
        super(pointer);
    }

    public DOMNodeList querySelectorAll(String arg1) throws GlibException {
        return WebKitDOMElement.querySelectorAll(this, arg1);
    }

    public org.gnome.webKit.DOMElement querySelector(String arg1) throws GlibException {
        return WebKitDOMElement.querySelector(this, arg1);
    }

    public DOMNodeList getElementsByClassName(String arg1) {
        return WebKitDOMElement.getElementsByClassName(this, arg1);
    }

    public boolean hasAttribute(String arg1) {
        return WebKitDOMElement.hasAttribute(this, arg1);
    }

    public boolean hasAttributeNs(String arg1, String arg2) {
        return WebKitDOMElement.hasAttributeNs(this, arg1, arg2);
    }

    public void removeAttribute(String arg1) {
        WebKitDOMElement.removeAttribute(this, arg1);
    }

    public DOMAttr removeAttributeNode(DOMAttr arg1) throws GlibException {
        return WebKitDOMElement.removeAttributeNode(this, arg1);
    }

    public void removeAttributeNs(String arg1, String arg2) {
        WebKitDOMElement.removeAttributeNs(this, arg1, arg2);
    }

    public void scrollByLines(long arg1) {
        WebKitDOMElement.scrollByLines(this, arg1);
    }

    public void scrollByPages(long arg1) {
        WebKitDOMElement.scrollByPages(this, arg1);
    }

    public void scrollIntoView(boolean arg1) {
        WebKitDOMElement.scrollIntoView(this, arg1);
    }

    public void scrollIntoViewIfNeeded(boolean arg1) {
        WebKitDOMElement.scrollIntoViewIfNeeded(this, arg1);
    }

    public void setAttribute(String arg1, String arg2) throws GlibException {
        WebKitDOMElement.setAttribute(this, arg1, arg2);
    }

    public DOMAttr setAttributeNode(DOMAttr arg1) throws GlibException {
        return WebKitDOMElement.setAttributeNode(this, arg1);
    }

    public DOMAttr setAttributeNodeNs(DOMAttr arg1) throws GlibException {
        return WebKitDOMElement.setAttributeNodeNs(this, arg1);
    }

    public void setAttributeNs(String arg1, String arg2, String arg3) throws GlibException {
        WebKitDOMElement.setAttributeNs(this, arg1, arg2, arg3);
    }

    public void setScrollLeft(long arg1) {
        WebKitDOMElement.setScrollLeft(this, arg1);
    }

    public void setScrollTop(long arg1) {
        WebKitDOMElement.setScrollTop(this, arg1);
    }

    public boolean webkitMatchesSelector(String arg1) throws GlibException {
        return WebKitDOMElement.webkitMatchesSelector(this, arg1);
    }

    public void webkitRequestFullScreen(short arg1) {
        WebKitDOMElement.webkitRequestFullScreen(this, arg1);
    }

    public DOMAttr getAttributeNode(String arg1) {
        return WebKitDOMElement.getAttributeNode(this, arg1);
    }

    public org.gnome.webKit.DOMElement getFirstElementChild() {
        return WebKitDOMElement.getFirstElementChild(this);
    }

    public org.gnome.webKit.DOMElement getLastElementChild() {
        return WebKitDOMElement.getLastElementChild(this);
    }

    public org.gnome.webKit.DOMElement getNextElementSibling() {
        return WebKitDOMElement.getNextElementSibling(this);
    }

    public long getOffsetHeight() {
        return WebKitDOMElement.getOffsetHeight(this);
    }

    public long getOffsetLeft() {
        return WebKitDOMElement.getOffsetLeft(this);
    }

    public org.gnome.webKit.DOMElement getOffsetParent() {
        return WebKitDOMElement.getOffsetParent(this);
    }

    public long getOffsetTop() {
        return WebKitDOMElement.getOffsetTop(this);
    }

    public long getOffsetWidth() {
        return WebKitDOMElement.getOffsetWidth(this);
    }

    public org.gnome.webKit.DOMElement getPreviousElementSibling() {
        return WebKitDOMElement.getPreviousElementSibling(this);
    }

    public long getScrollHeight() {
        return WebKitDOMElement.getScrollHeight(this);
    }

    public long getScrollLeft() {
        return WebKitDOMElement.getScrollLeft(this);
    }

    public long getScrollTop() {
        return WebKitDOMElement.getScrollTop(this);
    }

    public long getScrollWidth() {
        return WebKitDOMElement.getScrollWidth(this);
    }

    public DOMCSSStyleDeclaration getStyle() {
        return WebKitDOMElement.getStyle(this);
    }

    public String getTagName() {
        return WebKitDOMElement.getTagName(this);
    }

    public String getWebkitRegionOverflow() {
        return WebKitDOMElement.getWebkitRegionOverflow(this);
    }

    public DOMAttr getAttributeNodeNs(String arg1, String arg2) {
        return WebKitDOMElement.getAttributeNodeNs(this, arg1, arg2);
    }

    public String getAttributeNs(String arg1, String arg2) {
        return WebKitDOMElement.getAttributeNs(this, arg1, arg2);
    }

    public long getChildElementCount() {
        return WebKitDOMElement.getChildElementCount(this);
    }

    public long getClientHeight() {
        return WebKitDOMElement.getClientHeight(this);
    }

    public long getClientLeft() {
        return WebKitDOMElement.getClientLeft(this);
    }

    public long getClientTop() {
        return WebKitDOMElement.getClientTop(this);
    }

    public long getClientWidth() {
        return WebKitDOMElement.getClientWidth(this);
    }

    public DOMNodeList getElementsByTagName(String arg1) {
        return WebKitDOMElement.getElementsByTagName(this, arg1);
    }

    public DOMNodeList getElementsByTagNameNs(String arg1, String arg2) {
        return WebKitDOMElement.getElementsByTagNameNs(this, arg1, arg2);
    }

    public String getAttribute(String arg1) {
        return WebKitDOMElement.getAttribute(this, arg1);
    }

    public void focus() {
        WebKitDOMElement.focus(this);
    }

    public void blur() {
        WebKitDOMElement.blur(this);
    }

}
