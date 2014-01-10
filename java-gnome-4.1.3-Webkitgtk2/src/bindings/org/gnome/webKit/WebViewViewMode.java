package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class WebViewViewMode extends Constant
{

    protected WebViewViewMode(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final WebViewViewMode WINDOWED = new WebViewViewMode(WebKitWebViewViewMode.WINDOWED, "WEBKIT_WEB_VIEW_VIEW_MODE_WINDOWED");
    
    public static final WebViewViewMode FLOATING = new WebViewViewMode(WebKitWebViewViewMode.FLOATING, "WEBKIT_WEB_VIEW_VIEW_MODE_FLOATING");
    
    public static final WebViewViewMode FULLSCREEN = new WebViewViewMode(WebKitWebViewViewMode.FULLSCREEN, "WEBKIT_WEB_VIEW_VIEW_MODE_FULLSCREEN");
    
    public static final WebViewViewMode MAXIMIZED = new WebViewViewMode(WebKitWebViewViewMode.MAXIMIZED, "WEBKIT_WEB_VIEW_VIEW_MODE_MAXIMIZED");
    
    public static final WebViewViewMode MINIMIZED = new WebViewViewMode(WebKitWebViewViewMode.MINIMIZED, "WEBKIT_WEB_VIEW_VIEW_MODE_MINIMIZED");
}
