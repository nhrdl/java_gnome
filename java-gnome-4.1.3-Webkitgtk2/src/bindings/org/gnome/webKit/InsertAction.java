package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class InsertAction extends Constant
{

    protected InsertAction(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final InsertAction TYPED = new InsertAction(WebKitInsertAction.TYPED, "WEBKIT_INSERT_ACTION_TYPED");

    public static final InsertAction PASTED = new InsertAction(WebKitInsertAction.PASTED, "WEBKIT_INSERT_ACTION_PASTED");

    public static final InsertAction DROPPED = new InsertAction(WebKitInsertAction.DROPPED, "WEBKIT_INSERT_ACTION_DROPPED");
}
