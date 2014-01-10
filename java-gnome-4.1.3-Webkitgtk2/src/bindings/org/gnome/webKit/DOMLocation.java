
package org.gnome.webKit;


public class DOMLocation
    extends DOMObject
{


    protected DOMLocation(long pointer) {
        super(pointer);
    }

    public String getOrigin() {
        return WebKitDOMLocation.getOrigin(this);
    }

}
