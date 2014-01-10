
package org.gnome.webKit;


public class DOMHTMLTitleElement
    extends DOMHTMLElement
{


    protected DOMHTMLTitleElement(long pointer) {
        super(pointer);
    }

    public String getText() {
        return WebKitDOMHTMLTitleElement.getText(this);
    }

    public void setText(String arg1) {
        WebKitDOMHTMLTitleElement.setText(this, arg1);
    }

}
