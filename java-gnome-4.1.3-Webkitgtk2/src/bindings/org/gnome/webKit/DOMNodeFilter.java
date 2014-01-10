
package org.gnome.webKit;

import org.freedesktop.bindings.FIXME;

public class DOMNodeFilter
    extends DOMObject
{


    protected DOMNodeFilter(long pointer) {
        super(pointer);
    }

    public FIXME acceptNode(DOMNode arg1) {
        return WebKitDOMNodeFilter.acceptNode(this, arg1);
    }

}
