
package org.gnome.gio;


public class ConverterOutputStream
    extends FilterOutputStream
{


    public ConverterOutputStream(OutputStream pbase_stream, Converter pconverter) {
        super(GConverterOutputStream.createConverterOutputStream(pbase_stream, pconverter));
    }

    protected ConverterOutputStream(long pointer) {
        super(pointer);
    }

}
