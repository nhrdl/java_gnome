
package org.gnome.webKit;


public class DOMWebKitPoint
    extends DOMObject
{


    protected DOMWebKitPoint(long pointer) {
        super(pointer);
    }

    public void setX(float arg1) {
        WebKitDOMWebKitPoint.setX(this, arg1);
    }

    public float getX() {
        return WebKitDOMWebKitPoint.getX(this);
    }

    public float getY() {
        return WebKitDOMWebKitPoint.getY(this);
    }

    public void setY(float arg1) {
        WebKitDOMWebKitPoint.setY(this, arg1);
    }

}
