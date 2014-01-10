
package org.gnome.gio;

import org.gnome.glib.Object;

public class FilenameCompleter
    extends Object
{


    public FilenameCompleter() {
        super(GFilenameCompleter.createFilenameCompleter());
    }

    protected FilenameCompleter(long pointer) {
        super(pointer);
    }

}
