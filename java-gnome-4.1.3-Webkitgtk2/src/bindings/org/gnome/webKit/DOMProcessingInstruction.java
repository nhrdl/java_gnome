package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMProcessingInstruction extends DOMNode
{

    protected DOMProcessingInstruction(long pointer) {
        super(pointer);
    }

    public String getData() {
        return WebKitDOMProcessingInstruction.getData(this);
    }

    public void setData(String arg1) throws GlibException {
        WebKitDOMProcessingInstruction.setData(this, arg1);
    }

    public DOMStyleSheet getSheet() {
        return WebKitDOMProcessingInstruction.getSheet(this);
    }

    public String getTarget() {
        return WebKitDOMProcessingInstruction.getTarget(this);
    }

}
