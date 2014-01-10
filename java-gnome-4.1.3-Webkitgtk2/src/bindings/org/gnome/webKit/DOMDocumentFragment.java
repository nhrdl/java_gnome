package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMDocumentFragment extends DOMNode
{

    protected DOMDocumentFragment(long pointer) {
        super(pointer);
    }

    public DOMNodeList querySelectorAll(String arg1) throws GlibException {
        return WebKitDOMDocumentFragment.querySelectorAll(this, arg1);
    }

    public DOMElement querySelector(String arg1) throws GlibException {
        return WebKitDOMDocumentFragment.querySelector(this, arg1);
    }

}
