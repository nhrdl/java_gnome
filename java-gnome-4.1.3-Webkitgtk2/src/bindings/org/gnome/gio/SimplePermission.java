
package org.gnome.gio;


public class SimplePermission
    extends Permission
{


    public SimplePermission(boolean pallowed) {
        super(GSimplePermission.createSimplePermission(pallowed));
    }

    protected SimplePermission(long pointer) {
        super(pointer);
    }

}
