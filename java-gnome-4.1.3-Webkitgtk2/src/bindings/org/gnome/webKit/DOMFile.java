
package org.gnome.webKit;


public class DOMFile
    extends DOMBlob
{


    protected DOMFile(long pointer) {
        super(pointer);
    }

   

    public String getFileName() {
        return WebKitDOMFile.getFileName(this);
    }

}
