
package org.gnome.gio;


public class DataOutputStream
    extends FilterOutputStream
{


    public DataOutputStream(OutputStream pbase_stream) {
        super(GDataOutputStream.createDataOutputStream(pbase_stream));
    }

    protected DataOutputStream(long pointer) {
        super(pointer);
    }

}
