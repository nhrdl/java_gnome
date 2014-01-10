package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class EditingBehavior extends Constant
{

    protected EditingBehavior(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final EditingBehavior MAC = new EditingBehavior(WebKitEditingBehavior.MAC, "WEBKIT_EDITING_BEHAVIOR_MAC");

    public static final EditingBehavior WINDOWS = new EditingBehavior(WebKitEditingBehavior.WINDOWS, "WEBKIT_EDITING_BEHAVIOR_WINDOWS");

    public static final EditingBehavior UNIX = new EditingBehavior(WebKitEditingBehavior.UNIX, "WEBKIT_EDITING_BEHAVIOR_UNIX");
}
