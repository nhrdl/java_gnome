
package org.gnome.webKit;


public class DOMHTMLHtmlElement
    extends DOMHTMLElement
{


    protected DOMHTMLHtmlElement(long pointer) {
        super(pointer);
    }

    public String getManifest() {
        return WebKitDOMHTMLHtmlElement.getManifest(this);
    }

    public String getVersion() {
        return WebKitDOMHTMLHtmlElement.getVersion(this);
    }

    public void setManifest(String arg1) {
        WebKitDOMHTMLHtmlElement.setManifest(this, arg1);
    }

    public void setVersion(String arg1) {
        WebKitDOMHTMLHtmlElement.setVersion(this, arg1);
    }

}
