
package org.gnome.webKit;


public class DOMMediaQueryList
    extends DOMObject
{


    protected DOMMediaQueryList(long pointer) {
        super(pointer);
    }

    public String getMedia() {
        return WebKitDOMMediaQueryList.getMedia(this);
    }

    public boolean getMatches() {
        return WebKitDOMMediaQueryList.getMatches(this);
    }

}
