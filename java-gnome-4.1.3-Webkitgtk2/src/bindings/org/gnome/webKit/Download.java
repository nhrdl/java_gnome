package org.gnome.webKit;

import org.gnome.glib.Object;

public class Download extends Object
{

    protected Download(final long pointer) {
        super(pointer);
    }

    public double getElapsedTime() {
        return WebKitDownload.getElapsedTime(this);
    }

    public void cancel() {
        WebKitDownload.cancel(this);
    }

}
