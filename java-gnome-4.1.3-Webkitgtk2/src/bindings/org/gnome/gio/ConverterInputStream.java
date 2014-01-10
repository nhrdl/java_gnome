
package org.gnome.gio;


public class ConverterInputStream
    extends FilterInputStream
{


    public ConverterInputStream(InputStream pbase_stream, Converter pconverter) {
        super(GConverterInputStream.createConverterInputStream(pbase_stream, pconverter));
    }

    protected ConverterInputStream(long pointer) {
        super(pointer);
    }

}
