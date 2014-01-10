
package org.gnome.webKit;


public class DOMHTMLMapElement
    extends DOMHTMLElement
{


    protected DOMHTMLMapElement(long pointer) {
        super(pointer);
    }

    public DOMHTMLCollection getAreas() {
        return WebKitDOMHTMLMapElement.getAreas(this);
    }

    public String getName() {
        return WebKitDOMHTMLMapElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLMapElement.setName(this, arg1);
    }

}
