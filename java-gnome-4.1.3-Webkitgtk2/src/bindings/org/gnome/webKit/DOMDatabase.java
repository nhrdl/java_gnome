
package org.gnome.webKit;


public class DOMDatabase
    extends DOMObject
{


    protected DOMDatabase(long pointer) {
        super(pointer);
    }

    public String getVersion() {
        return WebKitDOMDatabase.getVersion(this);
    }

}
