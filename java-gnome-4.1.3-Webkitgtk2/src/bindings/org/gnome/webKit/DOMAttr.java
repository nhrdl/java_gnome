package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMAttr extends DOMNode
{

    protected DOMAttr(long pointer) {
        super(pointer);
    }

    public DOMElement getOwnerElement() {
        return WebKitDOMAttr.getOwnerElement(this);
    }

    public boolean getIsId() {
        return WebKitDOMAttr.getIsId(this);
    }

    public boolean getSpecified() {
        return WebKitDOMAttr.getSpecified(this);
    }

    public String getName() {
        return WebKitDOMAttr.getName(this);
    }

    public String getValue() {
        return WebKitDOMAttr.getValue(this);
    }

    public void setValue(String arg1) throws GlibException {
        WebKitDOMAttr.setValue(this, arg1);
    }

}
