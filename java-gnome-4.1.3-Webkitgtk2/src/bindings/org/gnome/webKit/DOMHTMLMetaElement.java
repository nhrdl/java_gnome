
package org.gnome.webKit;


public class DOMHTMLMetaElement
    extends DOMHTMLElement
{


    protected DOMHTMLMetaElement(long pointer) {
        super(pointer);
    }

    public void setContent(String arg1) {
        WebKitDOMHTMLMetaElement.setContent(this, arg1);
    }

    public void setHttpEquiv(String arg1) {
        WebKitDOMHTMLMetaElement.setHttpEquiv(this, arg1);
    }

    public void setScheme(String arg1) {
        WebKitDOMHTMLMetaElement.setScheme(this, arg1);
    }

    public String getHttpEquiv() {
        return WebKitDOMHTMLMetaElement.getHttpEquiv(this);
    }

    public String getScheme() {
        return WebKitDOMHTMLMetaElement.getScheme(this);
    }

    public String getContent() {
        return WebKitDOMHTMLMetaElement.getContent(this);
    }

    public String getName() {
        return WebKitDOMHTMLMetaElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLMetaElement.setName(this, arg1);
    }

}
