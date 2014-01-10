
package org.gnome.gio;

import org.gnome.glib.Object;

public class SimpleActionGroup
    extends Object
{


    public SimpleActionGroup() {
        super(GSimpleActionGroup.createSimpleActionGroup());
    }

    protected SimpleActionGroup(long pointer) {
        super(pointer);
    }

}
