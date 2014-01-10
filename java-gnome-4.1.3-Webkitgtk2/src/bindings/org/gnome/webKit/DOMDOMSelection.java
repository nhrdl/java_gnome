package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMDOMSelection extends DOMObject
{

    protected DOMDOMSelection(long pointer) {
        super(pointer);
    }

    public void deleteFromDocument() {
        WebKitDOMDOMSelection.deleteFromDocument(this);
    }

    public void extend(DOMNode arg1, long arg2) throws GlibException {
        WebKitDOMDOMSelection.extend(this, arg1, arg2);
    }

    public DOMNode getAnchorNode() {
        return WebKitDOMDOMSelection.getAnchorNode(this);
    }

    public long getAnchorOffset() {
        return WebKitDOMDOMSelection.getAnchorOffset(this);
    }

    public DOMNode getBaseNode() {
        return WebKitDOMDOMSelection.getBaseNode(this);
    }

    public long getBaseOffset() {
        return WebKitDOMDOMSelection.getBaseOffset(this);
    }

    public DOMNode getExtentNode() {
        return WebKitDOMDOMSelection.getExtentNode(this);
    }

    public long getExtentOffset() {
        return WebKitDOMDOMSelection.getExtentOffset(this);
    }

    public DOMNode getFocusNode() {
        return WebKitDOMDOMSelection.getFocusNode(this);
    }

    public long getFocusOffset() {
        return WebKitDOMDOMSelection.getFocusOffset(this);
    }

    public boolean getIsCollapsed() {
        return WebKitDOMDOMSelection.getIsCollapsed(this);
    }

    public DOMRange getRangeAt(long arg1) throws GlibException {
        return WebKitDOMDOMSelection.getRangeAt(this, arg1);
    }

    public long getRangeCount() {
        return WebKitDOMDOMSelection.getRangeCount(this);
    }

    public void modify(String arg1, String arg2, String arg3) {
        WebKitDOMDOMSelection.modify(this, arg1, arg2, arg3);
    }

    public void collapse(DOMNode arg1, long arg2) throws GlibException {
        WebKitDOMDOMSelection.collapse(this, arg1, arg2);
    }

    public void collapseToStart() throws GlibException {
        WebKitDOMDOMSelection.collapseToStart(this);
    }

    public void collapseToEnd() throws GlibException {
        WebKitDOMDOMSelection.collapseToEnd(this);
    }

    public boolean containsNode(DOMNode arg1, boolean arg2) {
        return WebKitDOMDOMSelection.containsNode(this, arg1, arg2);
    }

    public void addRange(DOMRange arg1) {
        WebKitDOMDOMSelection.addRange(this, arg1);
    }

    public void removeAllRanges() {
        WebKitDOMDOMSelection.removeAllRanges(this);
    }

    public void selectAllChildren(DOMNode arg1) throws GlibException {
        WebKitDOMDOMSelection.selectAllChildren(this, arg1);
    }

    public void setBaseAndExtent(DOMNode arg1, long arg2, DOMNode arg3, long arg4) throws GlibException {
        WebKitDOMDOMSelection.setBaseAndExtent(this, arg1, arg2, arg3, arg4);
    }

    public void setPosition(DOMNode arg1, long arg2) throws GlibException {
        WebKitDOMDOMSelection.setPosition(this, arg1, arg2);
    }

    public void empty() {
        WebKitDOMDOMSelection.empty(this);
    }

}
