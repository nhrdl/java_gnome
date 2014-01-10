
package org.gnome.webKit;


public class DOMHTMLQuoteElement
    extends DOMHTMLElement
{


    protected DOMHTMLQuoteElement(long pointer) {
        super(pointer);
    }

    public String getCite() {
        return WebKitDOMHTMLQuoteElement.getCite(this);
    }

    public void setCite(String arg1) {
        WebKitDOMHTMLQuoteElement.setCite(this, arg1);
    }

}
