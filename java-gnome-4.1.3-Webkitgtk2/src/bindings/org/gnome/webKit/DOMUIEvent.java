
package org.gnome.webKit;


public class DOMUIEvent
    extends DOMEvent
{


    protected DOMUIEvent(long pointer) {
        super(pointer);
    }

    public long getPageY() {
        return WebKitDOMUIEvent.getPageY(this);
    }

    public DOMDOMWindow getView() {
        return WebKitDOMUIEvent.getView(this);
    }

    public long getWhich() {
        return WebKitDOMUIEvent.getWhich(this);
    }

    public void initUiEvent(String arg1, boolean arg2, boolean arg3, DOMDOMWindow arg4, long arg5) {
        WebKitDOMUIEvent.initUiEvent(this, arg1, arg2, arg3, arg4, arg5);
    }

    public long getLayerX() {
        return WebKitDOMUIEvent.getLayerX(this);
    }

    public long getLayerY() {
        return WebKitDOMUIEvent.getLayerY(this);
    }

    public long getPageX() {
        return WebKitDOMUIEvent.getPageX(this);
    }

    public long getCharCode() {
        return WebKitDOMUIEvent.getCharCode(this);
    }

    public long getDetail() {
        return WebKitDOMUIEvent.getDetail(this);
    }

    public long getKeyCode() {
        return WebKitDOMUIEvent.getKeyCode(this);
    }

}
