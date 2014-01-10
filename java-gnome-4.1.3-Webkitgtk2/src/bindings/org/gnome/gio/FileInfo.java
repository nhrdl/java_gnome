
package org.gnome.gio;

import org.gnome.glib.Object;

public class FileInfo
    extends Object
{


    public FileInfo() {
        super(GFileInfo.createFileInfo());
    }

    protected FileInfo(long pointer) {
        super(pointer);
    }

}
