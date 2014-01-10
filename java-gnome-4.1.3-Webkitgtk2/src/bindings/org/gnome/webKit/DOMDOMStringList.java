
package org.gnome.webKit;


public class DOMDOMStringList
    extends DOMObject
{


    protected DOMDOMStringList(long pointer) {
        super(pointer);
    }

    public String item(long arg1) {
        return WebKitDOMDOMStringList.item(this, arg1);
    }

    public long getLength() {
        return WebKitDOMDOMStringList.getLength(this);
    }

    public boolean contains(String arg1) {
        return WebKitDOMDOMStringList.contains(this, arg1);
    }

}
