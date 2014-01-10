package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class NavigationResponse extends Constant
{

    protected NavigationResponse(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final NavigationResponse ACCEPT = new NavigationResponse(WebKitNavigationResponse.ACCEPT, "WEBKIT_NAVIGATION_RESPONSE_ACCEPT");
    
    public static final NavigationResponse IGNORE = new NavigationResponse(WebKitNavigationResponse.IGNORE, "WEBKIT_NAVIGATION_RESPONSE_IGNORE");
    
    public static final NavigationResponse DOWNLOAD = new NavigationResponse(WebKitNavigationResponse.DOWNLOAD, "WEBKIT_NAVIGATION_RESPONSE_DOWNLOAD");
}
