package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMCSSValue extends DOMObject
{

    protected DOMCSSValue(long pointer) {
        super(pointer);
    }

    public short getCssValueType() {
        return WebKitDOMCSSValue.getCssValueType(this);
    }

    public void setCssText(String arg1) throws GlibException {
        WebKitDOMCSSValue.setCssText(this, arg1);
    }

    public String getCssText() {
        return WebKitDOMCSSValue.getCssText(this);
    }

}
