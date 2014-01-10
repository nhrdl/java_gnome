
package org.gnome.gio;

import org.gnome.glib.Object;

public class AppLaunchContext
    extends Object
{


    public AppLaunchContext() {
        super(GAppLaunchContext.createAppLaunchContext());
    }

    protected AppLaunchContext(long pointer) {
        super(pointer);
    }

}
