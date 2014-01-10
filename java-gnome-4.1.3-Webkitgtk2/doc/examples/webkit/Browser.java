package webkit;

import java.util.ArrayList;

import org.gnome.gdk.Event;
import org.gnome.glib.Handler;
import org.gnome.gtk.Gtk;
import org.gnome.gtk.Notebook;
import org.gnome.gtk.Widget;
import org.gnome.gtk.Window;
import org.gnome.webKit.ExtensionInitializationData;
import org.gnome.webKit.NewWindowHandler;
import org.gnome.webKit.WebView;

public class Browser
{
    public static void main(final String[] args) throws InterruptedException {
        if (args.length != 1) {
            System.err.println("Usage Browser <url>");
            System.exit(1);

        }
        Gtk.init(args);
        final Window window = new Window();
        window.setTitle("Webkit browser");

        window.connect(new Window.DeleteEvent() {
            public boolean onDeleteEvent(final Widget source, final Event event) {
                Gtk.mainQuit();
                return false;
            }
        });


        final WebView wv = new WebView();
        wv.enableWebInspector(true);
        wv.loadUri(args[0]);
        final Notebook book = new Notebook();
        book.appendPage(wv, null);

        final NewWindowHandler newWin = new NewWindowHandler() {

            private WebView view;

            public WebView createNewWindow() {
                this.view = new WebView();
                book.appendPage(view, null);
                view.showAll();
                return view;
            }

            public WebView getMasterView() {
                return view;
            }
        };

        wv.setNewWindowHandler(newWin);
        window.add(book);

        Gtk.idleAdd(new Handler() {

            public boolean run() {
                // wv.loadUri(args[0]);
                return false;
            }
        });
        window.showAll();
        window.setMaximize(true);
        Gtk.main();
    }
}
