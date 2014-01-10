
package org.gnome.gio;

import org.gnome.glib.Object;

public class Credentials
    extends Object
{


    public Credentials() {
        super(GCredentials.createCredentials());
    }

    protected Credentials(long pointer) {
        super(pointer);
    }

}
