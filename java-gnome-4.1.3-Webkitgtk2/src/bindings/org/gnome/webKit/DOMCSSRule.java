package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMCSSRule extends DOMObject
{

    protected DOMCSSRule(final long pointer) {
        super(pointer);
    }

    public org.gnome.webKit.DOMCSSRule getParentRule() {
        return WebKitDOMCSSRule.getParentRule(this);
    }

    public void setCssText(final String arg1) throws GlibException {
        WebKitDOMCSSRule.setCssText(this, arg1);
    }

    public String getCssText() {
        return WebKitDOMCSSRule.getCssText(this);
    }

}
