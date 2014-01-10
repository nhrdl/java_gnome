
package org.gnome.webKit;


public class DOMStyleMedia
    extends DOMObject
{


    protected DOMStyleMedia(long pointer) {
        super(pointer);
    }

    public boolean matchMedium(String arg1) {
        return WebKitDOMStyleMedia.matchMedium(this, arg1);
    }

}
