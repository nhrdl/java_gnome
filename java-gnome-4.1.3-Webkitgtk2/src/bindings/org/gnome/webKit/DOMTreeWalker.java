package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMTreeWalker extends DOMObject
{

    protected DOMTreeWalker(long pointer) {
        super(pointer);
    }

    public DOMNode firstChild() {
        return WebKitDOMTreeWalker.firstChild(this);
    }

    public DOMNode parentNode() {
        return WebKitDOMTreeWalker.parentNode(this);
    }

    public DOMNode previousSibling() {
        return WebKitDOMTreeWalker.previousSibling(this);
    }

    public void setCurrentNode(DOMNode arg1) throws GlibException {
        WebKitDOMTreeWalker.setCurrentNode(this, arg1);
    }

    public DOMNode getCurrentNode() {
        return WebKitDOMTreeWalker.getCurrentNode(this);
    }

    public DOMNode lastChild() {
        return WebKitDOMTreeWalker.lastChild(this);
    }

    public DOMNode nextSibling() {
        return WebKitDOMTreeWalker.nextSibling(this);
    }

    public boolean getExpandEntityReferences() {
        return WebKitDOMTreeWalker.getExpandEntityReferences(this);
    }

    public DOMNodeFilter getFilter() {
        return WebKitDOMTreeWalker.getFilter(this);
    }

    public DOMNode getRoot() {
        return WebKitDOMTreeWalker.getRoot(this);
    }

    public long getWhatToShow() {
        return WebKitDOMTreeWalker.getWhatToShow(this);
    }

    public DOMNode nextNode() {
        return WebKitDOMTreeWalker.nextNode(this);
    }

    public DOMNode previousNode() {
        return WebKitDOMTreeWalker.previousNode(this);
    }

}
