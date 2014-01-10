
package org.gnome.webKit;


public class DOMDOMMimeType
    extends DOMObject
{


    protected DOMDOMMimeType(long pointer) {
        super(pointer);
    }

    public DOMDOMPlugin getEnabledPlugin() {
        return WebKitDOMDOMMimeType.getEnabledPlugin(this);
    }

    public String getSuffixes() {
        return WebKitDOMDOMMimeType.getSuffixes(this);
    }

    public String getDescription() {
        return WebKitDOMDOMMimeType.getDescription(this);
    }

}
