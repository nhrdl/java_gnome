
package org.gnome.webKit;


public class DOMDOMSettableTokenList
    extends DOMDOMTokenList
{


    protected DOMDOMSettableTokenList(long pointer) {
        super(pointer);
    }

    public String getValue() {
        return WebKitDOMDOMSettableTokenList.getValue(this);
    }

    public void setValue(String arg1) {
        WebKitDOMDOMSettableTokenList.setValue(this, arg1);
    }

}
