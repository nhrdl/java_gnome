package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMDOMImplementation extends DOMObject
{

    protected DOMDOMImplementation(final long pointer) {
        super(pointer);
    }

    public DOMDocumentType createDocumentType(final String arg1, final String arg2, final String arg3)
            throws GlibException {
        return WebKitDOMDOMImplementation.createDocumentType(this, arg1, arg2, arg3);
    }

    public DOMHTMLDocument createHtmlDocument(final String arg1) {
        return WebKitDOMDOMImplementation.createHtmlDocument(this, arg1);
    }

    public boolean hasFeature(final String arg1, final String arg2) {
        return WebKitDOMDOMImplementation.hasFeature(this, arg1, arg2);
    }

    public DOMDocument createDocument(final String arg1, final String arg2, final DOMDocumentType arg3)
            throws GlibException {
        return WebKitDOMDOMImplementation.createDocument(this, arg1, arg2, arg3);
    }

}
