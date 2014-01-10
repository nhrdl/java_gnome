
package org.gnome.webKit;


public class DOMWebKitNamedFlow
    extends DOMObject
{


    protected DOMWebKitNamedFlow(long pointer) {
        super(pointer);
    }

    public boolean getOverflow() {
        return WebKitDOMWebKitNamedFlow.getOverflow(this);
    }

}
