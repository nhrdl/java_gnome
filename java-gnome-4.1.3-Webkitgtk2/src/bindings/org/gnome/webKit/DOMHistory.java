
package org.gnome.webKit;


public class DOMHistory
    extends DOMObject
{


    protected DOMHistory(long pointer) {
        super(pointer);
    }

    public void forward() {
        WebKitDOMHistory.forward(this);
    }

    public void back() {
        WebKitDOMHistory.back(this);
    }

    public void go(long arg1) {
        WebKitDOMHistory.go(this, arg1);
    }

    public long getLength() {
        return WebKitDOMHistory.getLength(this);
    }

}
