package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMNamedNodeMap extends DOMObject
{

    protected DOMNamedNodeMap(long pointer) {
        super(pointer);
    }

    public DOMNode item(long arg1) {
        return WebKitDOMNamedNodeMap.item(this, arg1);
    }

    public DOMNode getNamedItemNs(String arg1, String arg2) {
        return WebKitDOMNamedNodeMap.getNamedItemNs(this, arg1, arg2);
    }

    public DOMNode getNamedItem(String arg1) {
        return WebKitDOMNamedNodeMap.getNamedItem(this, arg1);
    }

    public DOMNode removeNamedItemNs(String arg1, String arg2) throws GlibException {
        return WebKitDOMNamedNodeMap.removeNamedItemNs(this, arg1, arg2);
    }

    public DOMNode setNamedItem(DOMNode arg1) throws GlibException {
        return WebKitDOMNamedNodeMap.setNamedItem(this, arg1);
    }

    public DOMNode setNamedItemNs(DOMNode arg1) throws GlibException {
        return WebKitDOMNamedNodeMap.setNamedItemNs(this, arg1);
    }

    public DOMNode removeNamedItem(String arg1) throws GlibException {
        return WebKitDOMNamedNodeMap.removeNamedItem(this, arg1);
    }

    public long getLength() {
        return WebKitDOMNamedNodeMap.getLength(this);
    }

}
