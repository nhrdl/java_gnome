
package org.gnome.webKit;


public class DOMHTMLBRElement
    extends DOMHTMLElement
{


    protected DOMHTMLBRElement(long pointer) {
        super(pointer);
    }

    public void setClear(String arg1) {
        WebKitDOMHTMLBRElement.setClear(this, arg1);
    }

    public String getClear() {
        return WebKitDOMHTMLBRElement.getClear(this);
    }

}
