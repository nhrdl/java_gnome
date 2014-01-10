
package org.gnome.gio;

import org.gnome.glib.Object;

public class Cancellable
    extends Object
{


    public Cancellable() {
        super(GCancellable.createCancellable());
    }

    protected Cancellable(long pointer) {
        super(pointer);
    }

}
