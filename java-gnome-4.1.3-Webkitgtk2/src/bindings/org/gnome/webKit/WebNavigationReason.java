package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class WebNavigationReason extends Constant
{

    protected WebNavigationReason(int ordinal, String nickname) {
        super(ordinal, nickname);

    }

    public static final WebNavigationReason LINK_CLICKED = new WebNavigationReason(
            WebKitWebNavigationReason.LINK_CLICKED, "WEBKIT_WEB_NAVIGATION_REASON_LINK_CLICKED");

    public static final WebNavigationReason FORM_SUBMITTED = new WebNavigationReason(
            WebKitWebNavigationReason.FORM_SUBMITTED, "WEBKIT_WEB_NAVIGATION_REASON_FORM_SUBMITTED");

    public static final WebNavigationReason BACK_FORWARD = new WebNavigationReason(
            WebKitWebNavigationReason.BACK_FORWARD, "WEBKIT_WEB_NAVIGATION_REASON_BACK_FORWARD");

    public static final WebNavigationReason RELOAD = new WebNavigationReason(
            WebKitWebNavigationReason.RELOAD, "WEBKIT_WEB_NAVIGATION_REASON_RELOAD");

    public static final WebNavigationReason FORM_RESUBMITTED = new WebNavigationReason(
            WebKitWebNavigationReason.FORM_RESUBMITTED, "WEBKIT_WEB_NAVIGATION_REASON_FORM_RESUBMITTED");

    public static final WebNavigationReason OTHER = new WebNavigationReason(
            WebKitWebNavigationReason.OTHER, "WEBKIT_WEB_NAVIGATION_REASON_OTHER");
}
