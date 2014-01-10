
package org.gnome.webKit;


public class DOMScreen
    extends DOMObject
{


    protected DOMScreen(long pointer) {
        super(pointer);
    }

    public long getAvailWidth() {
        return WebKitDOMScreen.getAvailWidth(this);
    }

    public long getColorDepth() {
        return WebKitDOMScreen.getColorDepth(this);
    }

    public long getPixelDepth() {
        return WebKitDOMScreen.getPixelDepth(this);
    }

    public long getAvailHeight() {
        return WebKitDOMScreen.getAvailHeight(this);
    }

    public long getAvailLeft() {
        return WebKitDOMScreen.getAvailLeft(this);
    }

    public long getAvailTop() {
        return WebKitDOMScreen.getAvailTop(this);
    }

    public long getWidth() {
        return WebKitDOMScreen.getWidth(this);
    }

    public long getHeight() {
        return WebKitDOMScreen.getHeight(this);
    }

}
