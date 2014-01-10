
package org.gnome.gio;


public class DataInputStream
    extends BufferedInputStream
{


    public DataInputStream(InputStream pbase_stream) {
        super(GDataInputStream.createDataInputStream(pbase_stream));
    }

    protected DataInputStream(long pointer) {
        super(pointer);
    }

}
