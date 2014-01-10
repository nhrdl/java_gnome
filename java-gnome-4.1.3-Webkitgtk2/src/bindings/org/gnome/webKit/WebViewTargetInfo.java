package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class WebViewTargetInfo extends Constant
{

    protected WebViewTargetInfo(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final WebViewTargetInfo HTML = new WebViewTargetInfo(WebKitWebViewTargetInfo.HTML,
            "WEBKIT_WEB_VIEW_TARGET_INFO_HTML");

    public static final WebViewTargetInfo TEXT = new WebViewTargetInfo(WebKitWebViewTargetInfo.TEXT,
            "WEBKIT_WEB_VIEW_TARGET_INFO_TEXT");

    public static final WebViewTargetInfo IMAGE = new WebViewTargetInfo(WebKitWebViewTargetInfo.IMAGE,
            "WEBKIT_WEB_VIEW_TARGET_INFO_IMAGE");

    public static final WebViewTargetInfo URI_LIST = new WebViewTargetInfo(
            WebKitWebViewTargetInfo.URI_LIST, "WEBKIT_WEB_VIEW_TARGET_INFO_URI_LIST");

    public static final WebViewTargetInfo NETSCAPE_URL = new WebViewTargetInfo(
            WebKitWebViewTargetInfo.NETSCAPE_URL, "WEBKIT_WEB_VIEW_TARGET_INFO_NETSCAPE_URL");

}
