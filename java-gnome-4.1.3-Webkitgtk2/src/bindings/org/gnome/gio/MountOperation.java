
package org.gnome.gio;

import org.gnome.glib.Object;

public class MountOperation
    extends Object
{


    public MountOperation() {
        super(GMountOperation.createMountOperation());
    }

    protected MountOperation(long pointer) {
        super(pointer);
    }

}
