package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMNodeIterator extends DOMObject
{

    protected DOMNodeIterator(long pointer) {
        super(pointer);
    }

    public void detach() {
        WebKitDOMNodeIterator.detach(this);
    }

    public boolean getExpandEntityReferences() {
        return WebKitDOMNodeIterator.getExpandEntityReferences(this);
    }

    public DOMNodeFilter getFilter() {
        return WebKitDOMNodeIterator.getFilter(this);
    }

    public boolean getPointerBeforeReferenceNode() {
        return WebKitDOMNodeIterator.getPointerBeforeReferenceNode(this);
    }

    public DOMNode getReferenceNode() {
        return WebKitDOMNodeIterator.getReferenceNode(this);
    }

    public DOMNode getRoot() {
        return WebKitDOMNodeIterator.getRoot(this);
    }

    public long getWhatToShow() {
        return WebKitDOMNodeIterator.getWhatToShow(this);
    }

    public DOMNode nextNode() throws GlibException {
        return WebKitDOMNodeIterator.nextNode(this);
    }

    public DOMNode previousNode() throws GlibException {
        return WebKitDOMNodeIterator.previousNode(this);
    }

}
