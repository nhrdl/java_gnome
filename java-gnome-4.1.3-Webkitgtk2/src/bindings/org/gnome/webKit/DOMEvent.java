
package org.gnome.webKit;

import org.freedesktop.bindings.FIXME;

public class DOMEvent
    extends DOMObject
{


    protected DOMEvent(long pointer) {
        super(pointer);
    }

    public boolean getBubbles() {
        return WebKitDOMEvent.getBubbles(this);
    }

    public FIXME getSrcElement() {
        return WebKitDOMEvent.getSrcElement(this);
    }

    public int getTimeStamp() {
        return WebKitDOMEvent.getTimeStamp(this);
    }

    public void initEvent(String arg1, boolean arg2, boolean arg3) {
        WebKitDOMEvent.initEvent(this, arg1, arg2, arg3);
    }

    public void preventDefault() {
        WebKitDOMEvent.preventDefault(this);
    }

    public void setCancelBubble(boolean arg1) {
        WebKitDOMEvent.setCancelBubble(this, arg1);
    }

    public void setReturnValue(boolean arg1) {
        WebKitDOMEvent.setReturnValue(this, arg1);
    }

    public void stopImmediatePropagation() {
        WebKitDOMEvent.stopImmediatePropagation(this);
    }

    public void stopPropagation() {
        WebKitDOMEvent.stopPropagation(this);
    }

    public boolean getCancelable() {
        return WebKitDOMEvent.getCancelable(this);
    }

    public FIXME getCurrentTarget() {
        return WebKitDOMEvent.getCurrentTarget(this);
    }

    public boolean getDefaultPrevented() {
        return WebKitDOMEvent.getDefaultPrevented(this);
    }

    public short getEventPhase() {
        return WebKitDOMEvent.getEventPhase(this);
    }

    public boolean getReturnValue() {
        return WebKitDOMEvent.getReturnValue(this);
    }

    public boolean getCancelBubble() {
        return WebKitDOMEvent.getCancelBubble(this);
    }

    public FIXME getTarget() {
        return WebKitDOMEvent.getTarget(this);
    }

}
