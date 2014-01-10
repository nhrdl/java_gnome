
package org.gnome.webKit;


public class DOMHTMLEmbedElement
    extends DOMHTMLElement
{


    protected DOMHTMLEmbedElement(long pointer) {
        super(pointer);
    }

    public long getWidth() {
        return WebKitDOMHTMLEmbedElement.getWidth(this);
    }

    public long getHeight() {
        return WebKitDOMHTMLEmbedElement.getHeight(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLEmbedElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLEmbedElement.setAlign(this, arg1);
    }

    public void setWidth(long arg1) {
        WebKitDOMHTMLEmbedElement.setWidth(this, arg1);
    }

    public String getSrc() {
        return WebKitDOMHTMLEmbedElement.getSrc(this);
    }

    public void setSrc(String arg1) {
        WebKitDOMHTMLEmbedElement.setSrc(this, arg1);
    }

    public void setHeight(long arg1) {
        WebKitDOMHTMLEmbedElement.setHeight(this, arg1);
    }

    public String getName() {
        return WebKitDOMHTMLEmbedElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLEmbedElement.setName(this, arg1);
    }

}
