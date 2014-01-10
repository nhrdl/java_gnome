package org.gnome.gio;

import org.gnome.glib.GlibException;
import org.gnome.glib.Object;

public class TlsCertificate extends Object
{

    public TlsCertificate(final java.lang.String pfile) throws GlibException {
        super(org.gnome.gio.GTlsCertificate.createTlsCertificateFromFile(pfile));
    }

    public TlsCertificate(final java.lang.String pcert_file, final java.lang.String pkey_file)
            throws GlibException {
        super(org.gnome.gio.GTlsCertificate.createTlsCertificateFromFiles(pcert_file, pkey_file));
    }

    public TlsCertificate(final java.lang.String pdata, final int plength) throws GlibException {
        super(org.gnome.gio.GTlsCertificate.createTlsCertificateFromPem(pdata, plength));
    }

    protected TlsCertificate(final long pointer) {
        super(pointer);
    }

}
