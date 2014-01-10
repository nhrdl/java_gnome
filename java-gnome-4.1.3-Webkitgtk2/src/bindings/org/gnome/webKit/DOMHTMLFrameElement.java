
package org.gnome.webKit;


public class DOMHTMLFrameElement
    extends DOMHTMLElement
{


    protected DOMHTMLFrameElement(long pointer) {
        super(pointer);
    }

    public boolean getNoResize() {
        return WebKitDOMHTMLFrameElement.getNoResize(this);
    }

    public void setNoResize(boolean arg1) {
        WebKitDOMHTMLFrameElement.setNoResize(this, arg1);
    }

    public long getWidth() {
        return WebKitDOMHTMLFrameElement.getWidth(this);
    }

    public long getHeight() {
        return WebKitDOMHTMLFrameElement.getHeight(this);
    }

    public String getSrc() {
        return WebKitDOMHTMLFrameElement.getSrc(this);
    }

    public void setSrc(String arg1) {
        WebKitDOMHTMLFrameElement.setSrc(this, arg1);
    }

    public DOMDocument getContentDocument() {
        return WebKitDOMHTMLFrameElement.getContentDocument(this);
    }

    public String getLongDesc() {
        return WebKitDOMHTMLFrameElement.getLongDesc(this);
    }

    public String getFrameBorder() {
        return WebKitDOMHTMLFrameElement.getFrameBorder(this);
    }

    public String getMarginHeight() {
        return WebKitDOMHTMLFrameElement.getMarginHeight(this);
    }

    public String getMarginWidth() {
        return WebKitDOMHTMLFrameElement.getMarginWidth(this);
    }

    public String getScrolling() {
        return WebKitDOMHTMLFrameElement.getScrolling(this);
    }

    public void setFrameBorder(String arg1) {
        WebKitDOMHTMLFrameElement.setFrameBorder(this, arg1);
    }

    public void setLongDesc(String arg1) {
        WebKitDOMHTMLFrameElement.setLongDesc(this, arg1);
    }

    public void setMarginHeight(String arg1) {
        WebKitDOMHTMLFrameElement.setMarginHeight(this, arg1);
    }

    public void setMarginWidth(String arg1) {
        WebKitDOMHTMLFrameElement.setMarginWidth(this, arg1);
    }

    public void setScrolling(String arg1) {
        WebKitDOMHTMLFrameElement.setScrolling(this, arg1);
    }

    public DOMDOMWindow getContentWindow() {
        return WebKitDOMHTMLFrameElement.getContentWindow(this);
    }

    public String getName() {
        return WebKitDOMHTMLFrameElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLFrameElement.setName(this, arg1);
    }

}
