
package org.gnome.webKit;

import org.freedesktop.bindings.FIXME;

public class DOMMouseEvent
    extends DOMUIEvent
{


    protected DOMMouseEvent(long pointer) {
        super(pointer);
    }

    public long getOffsetX() {
        return WebKitDOMMouseEvent.getOffsetX(this);
    }

    public long getOffsetY() {
        return WebKitDOMMouseEvent.getOffsetY(this);
    }

    public FIXME getRelatedTarget() {
        return WebKitDOMMouseEvent.getRelatedTarget(this);
    }

    public boolean getShiftKey() {
        return WebKitDOMMouseEvent.getShiftKey(this);
    }

    public DOMNode getToElement() {
        return WebKitDOMMouseEvent.getToElement(this);
    }

    public boolean getAltKey() {
        return WebKitDOMMouseEvent.getAltKey(this);
    }

    public long getWebkitMovementX() {
        return WebKitDOMMouseEvent.getWebkitMovementX(this);
    }

    public long getWebkitMovementY() {
        return WebKitDOMMouseEvent.getWebkitMovementY(this);
    }

  

    public DOMNode getFromElement() {
        return WebKitDOMMouseEvent.getFromElement(this);
    }

    public long getClientX() {
        return WebKitDOMMouseEvent.getClientX(this);
    }

    public long getClientY() {
        return WebKitDOMMouseEvent.getClientY(this);
    }

    public boolean getCtrlKey() {
        return WebKitDOMMouseEvent.getCtrlKey(this);
    }

    public boolean getMetaKey() {
        return WebKitDOMMouseEvent.getMetaKey(this);
    }

    public long getScreenX() {
        return WebKitDOMMouseEvent.getScreenX(this);
    }

    public long getScreenY() {
        return WebKitDOMMouseEvent.getScreenY(this);
    }

    public long getX() {
        return WebKitDOMMouseEvent.getX(this);
    }

    public long getY() {
        return WebKitDOMMouseEvent.getY(this);
    }

    public short getButton() {
        return WebKitDOMMouseEvent.getButton(this);
    }

}
