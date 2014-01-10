package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMText extends DOMCharacterData
{

    protected DOMText(long pointer) {
        super(pointer);
    }

    public org.gnome.webKit.DOMText replaceWholeText(String arg1) throws GlibException {
        return WebKitDOMText.replaceWholeText(this, arg1);
    }

    public org.gnome.webKit.DOMText splitText(long arg1) throws GlibException {
        return WebKitDOMText.splitText(this, arg1);
    }

    public String getWholeText() {
        return WebKitDOMText.getWholeText(this);
    }

}
