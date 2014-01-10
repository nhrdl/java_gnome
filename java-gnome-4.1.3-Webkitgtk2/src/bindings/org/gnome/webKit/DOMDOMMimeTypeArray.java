
package org.gnome.webKit;


public class DOMDOMMimeTypeArray
    extends DOMObject
{


    protected DOMDOMMimeTypeArray(long pointer) {
        super(pointer);
    }

    public DOMDOMMimeType item(long arg1) {
        return WebKitDOMDOMMimeTypeArray.item(this, arg1);
    }

    public DOMDOMMimeType namedItem(String arg1) {
        return WebKitDOMDOMMimeTypeArray.namedItem(this, arg1);
    }

    public long getLength() {
        return WebKitDOMDOMMimeTypeArray.getLength(this);
    }

}
