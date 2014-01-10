
package org.gnome.webKit;


public class DOMHTMLBodyElement
    extends DOMHTMLElement
{


    protected DOMHTMLBodyElement(long pointer) {
        super(pointer);
    }

    public void setBgColor(String arg1) {
        WebKitDOMHTMLBodyElement.setBgColor(this, arg1);
    }

    public String getBgColor() {
        return WebKitDOMHTMLBodyElement.getBgColor(this);
    }

    public String getText() {
        return WebKitDOMHTMLBodyElement.getText(this);
    }

    public void setText(String arg1) {
        WebKitDOMHTMLBodyElement.setText(this, arg1);
    }

    public String getALink() {
        return WebKitDOMHTMLBodyElement.getALink(this);
    }

    public String getLink() {
        return WebKitDOMHTMLBodyElement.getLink(this);
    }

    public String getVLink() {
        return WebKitDOMHTMLBodyElement.getVLink(this);
    }

    public void setALink(String arg1) {
        WebKitDOMHTMLBodyElement.setALink(this, arg1);
    }

    public void setBackground(String arg1) {
        WebKitDOMHTMLBodyElement.setBackground(this, arg1);
    }

    public void setLink(String arg1) {
        WebKitDOMHTMLBodyElement.setLink(this, arg1);
    }

    public void setVLink(String arg1) {
        WebKitDOMHTMLBodyElement.setVLink(this, arg1);
    }

    public String getBackground() {
        return WebKitDOMHTMLBodyElement.getBackground(this);
    }

}
