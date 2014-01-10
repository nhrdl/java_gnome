package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class LoadStatus extends Constant
{

    protected LoadStatus(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static LoadStatus PROVISIONAL = new LoadStatus(WebKitLoadStatus.PROVISIONAL, "PROVISIONAL");

    public static LoadStatus COMMITTED = new LoadStatus(WebKitLoadStatus.COMMITTED, "COMMITTED");

    public static LoadStatus FINISHED = new LoadStatus(WebKitLoadStatus.FINISHED, "FINISHED");

    public static LoadStatus FIRST_VISUALLY_NON_EMPTY_LAYOUT = new LoadStatus(
            WebKitLoadStatus.FIRST_VISUALLY_NON_EMPTY_LAYOUT, "FIRST_VISUALLY_NON_EMPTY_LAYOUT");

    public static LoadStatus FAILED = new LoadStatus(WebKitLoadStatus.FAILED, "FAILED");
}
