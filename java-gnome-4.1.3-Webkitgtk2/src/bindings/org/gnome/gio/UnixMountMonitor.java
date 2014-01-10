
package org.gnome.gio;

import org.gnome.glib.Object;

public class UnixMountMonitor
    extends Object
{


    public UnixMountMonitor() {
        super(GUnixMountMonitor.createUnixMountMonitor());
    }

    protected UnixMountMonitor(long pointer) {
        super(pointer);
    }

}
