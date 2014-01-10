
package org.gnome.gio;

import org.gnome.glib.Object;

public class EmblemedIcon
    extends Object
{


    public EmblemedIcon(Icon picon, Emblem pemblem) {
        super(GEmblemedIcon.createEmblemedIcon(picon, pemblem));
    }

    protected EmblemedIcon(long pointer) {
        super(pointer);
    }

}
