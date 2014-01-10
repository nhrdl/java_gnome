package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMMediaList extends DOMObject
{

    protected DOMMediaList(long pointer) {
        super(pointer);
    }

    public String item(long arg1) {
        return WebKitDOMMediaList.item(this, arg1);
    }

    public void deleteMedium(String arg1) throws GlibException {
        WebKitDOMMediaList.deleteMedium(this, arg1);
    }

    public String getMediaText() {
        return WebKitDOMMediaList.getMediaText(this);
    }

    public void setMediaText(String arg1) throws GlibException {
        WebKitDOMMediaList.setMediaText(this, arg1);
    }

    public void appendMedium(String arg1) throws GlibException {
        WebKitDOMMediaList.appendMedium(this, arg1);
    }

    public long getLength() {
        return WebKitDOMMediaList.getLength(this);
    }

}
