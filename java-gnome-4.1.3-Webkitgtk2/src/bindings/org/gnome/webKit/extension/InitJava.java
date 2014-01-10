package org.gnome.webKit.extension;

import org.gnome.gtk.Gtk;
import org.gnome.webKit.DOMDocument;

public class InitJava
{

    public static void initJava(final long domDoc) {
        Gtk.init(new String[0]);
        System.out.println("InitJava:initJava called:" + domDoc);
        final DOMDocument doc = new DOMDocument(domDoc);
        System.out.println("InitJava:initJava: DOM Document created");
        try {
            System.out.println("DOMDOC Says classpath is" + doc.getElementById("cp").getTextContent());
        } catch (final Exception e) {
            e.printStackTrace();

        }
    }
}
