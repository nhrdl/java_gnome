package org.gnome.webKit;

import org.gnome.glib.Object;

public class WebContext extends Object
{

    protected WebContext(final long pointer) {
        super(pointer);
    }

    public void setWebExtensionsDirectory(final String dir) {
        WebKitWebContext.setWebExtensionsDirectory(this, dir);
    }
}
