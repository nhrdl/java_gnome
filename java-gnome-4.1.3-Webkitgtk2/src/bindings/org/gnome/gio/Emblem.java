package org.gnome.gio;

import org.gnome.glib.Object;

public class Emblem extends Object
{

    public Emblem(final Icon picon) {
        super(org.gnome.gio.GEmblem.createEmblem(picon));
    }

    public Emblem(final Icon picon, final EmblemOrigin porigin) {
        super(org.gnome.gio.GEmblem.createEmblemWithOrigin(picon, porigin));
    }

    protected Emblem(final long pointer) {
        super(pointer);
    }

}
