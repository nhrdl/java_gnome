package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMCharacterData extends DOMNode
{

    protected DOMCharacterData(long pointer) {
        super(pointer);
    }

    public String getData() {
        return WebKitDOMCharacterData.getData(this);
    }

    public String substringData(long arg1, long arg2) throws GlibException {
        return WebKitDOMCharacterData.substringData(this, arg1, arg2);
    }

    public void insertData(long arg1, String arg2) throws GlibException {
        WebKitDOMCharacterData.insertData(this, arg1, arg2);
    }

    public void replaceData(long arg1, long arg2, String arg3) throws GlibException {
        WebKitDOMCharacterData.replaceData(this, arg1, arg2, arg3);
    }

    public void deleteData(long arg1, long arg2) throws GlibException {
        WebKitDOMCharacterData.deleteData(this, arg1, arg2);
    }

    public void appendData(String arg1) throws GlibException {
        WebKitDOMCharacterData.appendData(this, arg1);
    }

    public void setData(String arg1) throws GlibException {
        WebKitDOMCharacterData.setData(this, arg1);
    }

    public long getLength() {
        return WebKitDOMCharacterData.getLength(this);
    }

}
