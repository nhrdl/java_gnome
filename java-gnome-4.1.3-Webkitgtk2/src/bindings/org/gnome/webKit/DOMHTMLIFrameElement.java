
package org.gnome.webKit;


public class DOMHTMLIFrameElement
    extends DOMHTMLElement
{


    protected DOMHTMLIFrameElement(long pointer) {
        super(pointer);
    }

    public String getWidth() {
        return WebKitDOMHTMLIFrameElement.getWidth(this);
    }

    public String getHeight() {
        return WebKitDOMHTMLIFrameElement.getHeight(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLIFrameElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLIFrameElement.setAlign(this, arg1);
    }

    public void setWidth(String arg1) {
        WebKitDOMHTMLIFrameElement.setWidth(this, arg1);
    }

    public String getSrc() {
        return WebKitDOMHTMLIFrameElement.getSrc(this);
    }

    public void setSrc(String arg1) {
        WebKitDOMHTMLIFrameElement.setSrc(this, arg1);
    }

    public void setHeight(String arg1) {
        WebKitDOMHTMLIFrameElement.setHeight(this, arg1);
    }

    public DOMDocument getContentDocument() {
        return WebKitDOMHTMLIFrameElement.getContentDocument(this);
    }

    public String getLongDesc() {
        return WebKitDOMHTMLIFrameElement.getLongDesc(this);
    }

    public String getFrameBorder() {
        return WebKitDOMHTMLIFrameElement.getFrameBorder(this);
    }

    public String getMarginHeight() {
        return WebKitDOMHTMLIFrameElement.getMarginHeight(this);
    }

    public String getMarginWidth() {
        return WebKitDOMHTMLIFrameElement.getMarginWidth(this);
    }

    public String getSandbox() {
        return WebKitDOMHTMLIFrameElement.getSandbox(this);
    }

    public String getScrolling() {
        return WebKitDOMHTMLIFrameElement.getScrolling(this);
    }

    public void setFrameBorder(String arg1) {
        WebKitDOMHTMLIFrameElement.setFrameBorder(this, arg1);
    }

    public void setLongDesc(String arg1) {
        WebKitDOMHTMLIFrameElement.setLongDesc(this, arg1);
    }

    public void setMarginHeight(String arg1) {
        WebKitDOMHTMLIFrameElement.setMarginHeight(this, arg1);
    }

    public void setMarginWidth(String arg1) {
        WebKitDOMHTMLIFrameElement.setMarginWidth(this, arg1);
    }

    public void setSandbox(String arg1) {
        WebKitDOMHTMLIFrameElement.setSandbox(this, arg1);
    }

    public void setScrolling(String arg1) {
        WebKitDOMHTMLIFrameElement.setScrolling(this, arg1);
    }

    public DOMDOMWindow getContentWindow() {
        return WebKitDOMHTMLIFrameElement.getContentWindow(this);
    }

    public String getName() {
        return WebKitDOMHTMLIFrameElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLIFrameElement.setName(this, arg1);
    }

}
