package org.gnome.gio;

import org.gnome.glib.GlibException;
import org.gnome.glib.Object;

public class CharsetConverter extends Object
{

    public CharsetConverter(final java.lang.String pto_charset, final java.lang.String pfrom_charset)
            throws GlibException {
        super(GCharsetConverter.createCharsetConverter(pto_charset, pfrom_charset));
    }

    protected CharsetConverter(final long pointer) {
        super(pointer);
    }

}
