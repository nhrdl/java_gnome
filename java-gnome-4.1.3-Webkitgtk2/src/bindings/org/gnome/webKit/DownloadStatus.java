package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class DownloadStatus extends Constant
{

    protected DownloadStatus(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    
    // There is a bug in code generation as python script seems not to be considering -1 value. Don't use the generated values.
    
    public static final DownloadStatus ERROR = new DownloadStatus(-1, "WEBKIT_DOWNLOAD_STATUS_ERROR");

    public static final DownloadStatus CREATED  = new DownloadStatus(0, "WEBKIT_DOWNLOAD_STATUS_CREATED");

    public static final DownloadStatus STARTED = new DownloadStatus(1, "WEBKIT_DOWNLOAD_STATUS_STARTED");

    public static final DownloadStatus CANCELLED = new DownloadStatus(2, "WEBKIT_DOWNLOAD_STATUS_CANCELLED");

    public static final DownloadStatus FINISHED = new DownloadStatus(3, "WEBKIT_DOWNLOAD_STATUS_FINISHED");
}
