package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMDOMApplicationCache extends DOMObject
{

    protected DOMDOMApplicationCache(long pointer) {
        super(pointer);
    }

    public void swapCache() throws GlibException {
        WebKitDOMDOMApplicationCache.swapCache(this);
    }

    public void abort() {
        WebKitDOMDOMApplicationCache.abort(this);
    }

    public void update() throws GlibException {
        WebKitDOMDOMApplicationCache.update(this);
    }

    public short getStatus() {
        return WebKitDOMDOMApplicationCache.getStatus(this);
    }

    public boolean dispatchEvent(DOMEvent arg1) throws GlibException {
        return WebKitDOMDOMApplicationCache.dispatchEvent(this, arg1);
    }

}
