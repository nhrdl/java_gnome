
package org.gnome.webKit;


public class DOMHTMLScriptElement
    extends DOMHTMLElement
{


    protected DOMHTMLScriptElement(long pointer) {
        super(pointer);
    }

    public boolean getDefer() {
        return WebKitDOMHTMLScriptElement.getDefer(this);
    }

    public String getCharset() {
        return WebKitDOMHTMLScriptElement.getCharset(this);
    }

    public String getSrc() {
        return WebKitDOMHTMLScriptElement.getSrc(this);
    }

    public void setSrc(String arg1) {
        WebKitDOMHTMLScriptElement.setSrc(this, arg1);
    }

    public String getText() {
        return WebKitDOMHTMLScriptElement.getText(this);
    }

    public void setAsync(boolean arg1) {
        WebKitDOMHTMLScriptElement.setAsync(this, arg1);
    }

    public void setCharset(String arg1) {
        WebKitDOMHTMLScriptElement.setCharset(this, arg1);
    }

    public void setDefer(boolean arg1) {
        WebKitDOMHTMLScriptElement.setDefer(this, arg1);
    }

    public void setEvent(String arg1) {
        WebKitDOMHTMLScriptElement.setEvent(this, arg1);
    }

    public void setHtmlFor(String arg1) {
        WebKitDOMHTMLScriptElement.setHtmlFor(this, arg1);
    }

    public void setText(String arg1) {
        WebKitDOMHTMLScriptElement.setText(this, arg1);
    }

    public boolean getAsync() {
        return WebKitDOMHTMLScriptElement.getAsync(this);
    }

    public String getEvent() {
        return WebKitDOMHTMLScriptElement.getEvent(this);
    }

    public String getHtmlFor() {
        return WebKitDOMHTMLScriptElement.getHtmlFor(this);
    }

}
