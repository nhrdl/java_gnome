
package org.gnome.webKit;


public class DOMDOMPlugin
    extends DOMObject
{


    protected DOMDOMPlugin(long pointer) {
        super(pointer);
    }

    public DOMDOMMimeType item(long arg1) {
        return WebKitDOMDOMPlugin.item(this, arg1);
    }

    public String getDescription() {
        return WebKitDOMDOMPlugin.getDescription(this);
    }

    public DOMDOMMimeType namedItem(String arg1) {
        return WebKitDOMDOMPlugin.namedItem(this, arg1);
    }

    public String getFilename() {
        return WebKitDOMDOMPlugin.getFilename(this);
    }

    public long getLength() {
        return WebKitDOMDOMPlugin.getLength(this);
    }

    public String getName() {
        return WebKitDOMDOMPlugin.getName(this);
    }

}
