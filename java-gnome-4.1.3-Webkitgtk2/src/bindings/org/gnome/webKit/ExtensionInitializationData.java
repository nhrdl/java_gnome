package org.gnome.webKit;

public class ExtensionInitializationData
{
    public String id;

    public String displayText;

    public String value;

    public ExtensionInitializationData(final String id, final String text, final String value) {
        this.id = id;
        this.displayText = text;
        this.value = value;
    }
}
