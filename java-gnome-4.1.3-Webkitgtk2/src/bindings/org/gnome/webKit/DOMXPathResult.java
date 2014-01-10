package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMXPathResult extends DOMObject
{

    protected DOMXPathResult(long pointer) {
        super(pointer);
    }

    public DOMNode getSingleNodeValue() throws GlibException {
        return WebKitDOMXPathResult.getSingleNodeValue(this);
    }

    public boolean getInvalidIteratorState() {
        return WebKitDOMXPathResult.getInvalidIteratorState(this);
    }

    public boolean getBooleanValue() throws GlibException {
        return WebKitDOMXPathResult.getBooleanValue(this);
    }

    public double getNumberValue() throws GlibException {
        return WebKitDOMXPathResult.getNumberValue(this);
    }

    public DOMNode iterateNext() throws GlibException {
        return WebKitDOMXPathResult.iterateNext(this);
    }

    public short getResultType() {
        return WebKitDOMXPathResult.getResultType(this);
    }

    public String getStringValue() throws GlibException {
        return WebKitDOMXPathResult.getStringValue(this);
    }

    public long getSnapshotLength() throws GlibException {
        return WebKitDOMXPathResult.getSnapshotLength(this);
    }

    public DOMNode snapshotItem(long arg1) throws GlibException {
        return WebKitDOMXPathResult.snapshotItem(this, arg1);
    }

}
