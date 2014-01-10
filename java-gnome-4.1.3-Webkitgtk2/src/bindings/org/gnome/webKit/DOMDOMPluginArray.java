
package org.gnome.webKit;


public class DOMDOMPluginArray
    extends DOMObject
{


    protected DOMDOMPluginArray(long pointer) {
        super(pointer);
    }

    public DOMDOMPlugin item(long arg1) {
        return WebKitDOMDOMPluginArray.item(this, arg1);
    }

    public void refresh(boolean arg1) {
        WebKitDOMDOMPluginArray.refresh(this, arg1);
    }

    public DOMDOMPlugin namedItem(String arg1) {
        return WebKitDOMDOMPluginArray.namedItem(this, arg1);
    }

    public long getLength() {
        return WebKitDOMDOMPluginArray.getLength(this);
    }

}
