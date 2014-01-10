
package org.gnome.webKit;


public class DOMConsole
    extends DOMObject
{


    protected DOMConsole(long pointer) {
        super(pointer);
    }

  

    public void groupEnd() {
        WebKitDOMConsole.groupEnd(this);
    }

    public void time(String arg1) {
        WebKitDOMConsole.time(this, arg1);
    }

}
