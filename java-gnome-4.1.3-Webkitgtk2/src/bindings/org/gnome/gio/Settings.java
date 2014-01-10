package org.gnome.gio;

import org.gnome.glib.Object;

public class Settings extends Object
{

    public Settings(final java.lang.String pschema_id) {
        super(org.gnome.gio.GSettings.createSettings(pschema_id));
    }

    // public Settings(SettingsSchema pschema, SettingsBackend pbackend,
    // java.lang.String ppath) {
    // super(org.gnome.gio.GSettings.createSettings(pschema, pbackend,
    // ppath));
    // }
    //
    // public Settings(java.lang.String pschema_id, SettingsBackend pbackend)
    // {
    // super(org.gnome.gio.GSettings.createSettings(pschema_id, pbackend));
    // }
    //
    // public Settings(java.lang.String pschema_id, SettingsBackend pbackend,
    // java.lang.String ppath) {
    // super(org.gnome.gio.GSettings.createSettings(pschema_id, pbackend,
    // ppath));
    // }
    //
    // public Settings(java.lang.String pschema_id, java.lang.String ppath) {
    // super(org.gnome.gio.GSettings.createSettings(pschema_id, ppath));
    // }

    protected Settings(final long pointer) {
        super(pointer);
    }

}
