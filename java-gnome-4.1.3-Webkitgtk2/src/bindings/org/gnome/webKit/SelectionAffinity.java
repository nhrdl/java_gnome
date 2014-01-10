package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class SelectionAffinity extends Constant
{

    protected SelectionAffinity(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final SelectionAffinity UPSTREAM = new SelectionAffinity(WebKitSelectionAffinity.UPSTREAM, "WEBKIT_SELECTION_AFFINITY_UPSTREAM");
    
    public static final SelectionAffinity DOWNSTREAM = new SelectionAffinity(WebKitSelectionAffinity.DOWNSTREAM, "WEBKIT_SELECTION_AFFINITY_DOWNSTREAM");
}
