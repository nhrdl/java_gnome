package org.gnome.webKit;

import org.gnome.glib.Object;

public class WebSettings extends Object
{

    protected WebSettings(final long pointer) {
        super(pointer);
    }

    public void enableWebInspector(final boolean enabled) {
        setPropertyBoolean("enable-developer-extras", enabled);
    }

}
