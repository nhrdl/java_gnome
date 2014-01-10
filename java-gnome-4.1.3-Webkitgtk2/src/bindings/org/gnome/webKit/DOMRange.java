package org.gnome.webKit;

import org.freedesktop.bindings.FIXME;
import org.gnome.glib.GlibException;

public class DOMRange extends DOMObject
{

    protected DOMRange(long pointer) {
        super(pointer);
    }

    public void collapse(boolean arg1) throws GlibException {
        WebKitDOMRange.collapse(this, arg1);
    }

    public void setStartBefore(DOMNode arg1) throws GlibException {
        WebKitDOMRange.setStartBefore(this, arg1);
    }

    public void surroundContents(DOMNode arg1) throws GlibException {
        WebKitDOMRange.surroundContents(this, arg1);
    }

    public DOMDocumentFragment cloneContents() throws GlibException {
        return WebKitDOMRange.cloneContents(this);
    }


    public FIXME compareNode(DOMNode arg1) {
        return WebKitDOMRange.compareNode(this, arg1);
    }

    public FIXME comparePoint(DOMNode arg1, long arg2) {
        return WebKitDOMRange.comparePoint(this, arg1, arg2);
    }

    public DOMDocumentFragment createContextualFragment(String arg1) throws GlibException {
        return WebKitDOMRange.createContextualFragment(this, arg1);
    }

    public void deleteContents() throws GlibException {
        WebKitDOMRange.deleteContents(this);
    }

    public DOMDocumentFragment extractContents() throws GlibException {
        return WebKitDOMRange.extractContents(this);
    }

    public boolean getCollapsed() throws GlibException {
        return WebKitDOMRange.getCollapsed(this);
    }

    public DOMNode getCommonAncestorContainer() throws GlibException {
        return WebKitDOMRange.getCommonAncestorContainer(this);
    }

    public DOMNode getEndContainer() throws GlibException {
        return WebKitDOMRange.getEndContainer(this);
    }

    public long getEndOffset() throws GlibException {
        return WebKitDOMRange.getEndOffset(this);
    }

    public DOMNode getStartContainer() throws GlibException {
        return WebKitDOMRange.getStartContainer(this);
    }

    public long getStartOffset() throws GlibException {
        return WebKitDOMRange.getStartOffset(this);
    }

    public boolean intersectsNode(DOMNode arg1) throws GlibException {
        return WebKitDOMRange.intersectsNode(this, arg1);
    }

    public void insertNode(DOMNode arg1) throws GlibException {
        WebKitDOMRange.insertNode(this, arg1);
    }

    public boolean isPointInRange(DOMNode arg1, long arg2) throws GlibException {
        return WebKitDOMRange.isPointInRange(this, arg1, arg2);
    }

    public void selectNode(DOMNode arg1) throws GlibException {
        WebKitDOMRange.selectNode(this, arg1);
    }

    public void selectNodeContents(DOMNode arg1) throws GlibException {
        WebKitDOMRange.selectNodeContents(this, arg1);
    }

    public void setEnd(DOMNode arg1, long arg2) throws GlibException {
        WebKitDOMRange.setEnd(this, arg1, arg2);
    }

    public void setEndAfter(DOMNode arg1) throws GlibException {
        WebKitDOMRange.setEndAfter(this, arg1);
    }

    public void setEndBefore(DOMNode arg1) throws GlibException {
        WebKitDOMRange.setEndBefore(this, arg1);
    }

    public void setStartAfter(DOMNode arg1) throws GlibException {
        WebKitDOMRange.setStartAfter(this, arg1);
    }

    public org.gnome.webKit.DOMRange cloneRange() throws GlibException {
        return WebKitDOMRange.cloneRange(this);
    }

    public void detach() throws GlibException {
        WebKitDOMRange.detach(this);
    }

    public String getText() {
        return WebKitDOMRange.getText(this);
    }

    public void setStart(DOMNode arg1, long arg2) throws GlibException {
        WebKitDOMRange.setStart(this, arg1, arg2);
    }

    public String toString() {
        try {
            return WebKitDOMRange.toString(this);
        } catch (GlibException e) {
            throw new RuntimeException(e);
        }
    }

    public void expand(String arg1) throws GlibException {
        WebKitDOMRange.expand(this, arg1);
    }

}
