
package org.gnome.webKit;


public class DOMGeolocation
    extends DOMObject
{


    protected DOMGeolocation(long pointer) {
        super(pointer);
    }

    public void clearWatch(long arg1) {
        WebKitDOMGeolocation.clearWatch(this, arg1);
    }

}
