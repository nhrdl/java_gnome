package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMXPathExpression extends DOMObject
{

    protected DOMXPathExpression(long pointer) {
        super(pointer);
    }

    public DOMXPathResult evaluate(DOMNode arg1, short arg2, DOMXPathResult arg3) throws GlibException {
        return WebKitDOMXPathExpression.evaluate(this, arg1, arg2, arg3);
    }

}
