package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class DownloadError extends Constant
{

    protected DownloadError(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final DownloadError CANCELLED_BY_USER = new DownloadError(WebKitDownloadError.CANCELLED_BY_USER, "WEBKIT_DOWNLOAD_ERROR_CANCELLED_BY_USER");

    public static final DownloadError DESTINATION = new DownloadError(WebKitDownloadError.DESTINATION, "WEBKIT_DOWNLOAD_ERROR_DESTINATION");

    public static final DownloadError NETWORK = new DownloadError(WebKitDownloadError.NETWORK, "WEBKIT_DOWNLOAD_ERROR_NETWORK");

}
