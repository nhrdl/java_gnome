
package org.gnome.webKit;


public class DOMHTMLHeadElement
    extends DOMHTMLElement
{


    protected DOMHTMLHeadElement(long pointer) {
        super(pointer);
    }

    public String getProfile() {
        return WebKitDOMHTMLHeadElement.getProfile(this);
    }

    public void setProfile(String arg1) {
        WebKitDOMHTMLHeadElement.setProfile(this, arg1);
    }

}
