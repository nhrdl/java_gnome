package org.gnome.webKit;

import org.gnome.glib.Object;

public class WebInspector extends Object
{

    protected WebInspector(final long pointer) {
        super(pointer);
    }

    public WebView getWebView() {
        return WebKitWebInspector.getWebView(this);
    }

    public String getInspectedUri() {
        return WebKitWebInspector.getInspectedUri(this);
    }

    public void show() {
        WebKitWebInspector.show(this);
    }

    public void close() {
        WebKitWebInspector.close(this);
    }

}
