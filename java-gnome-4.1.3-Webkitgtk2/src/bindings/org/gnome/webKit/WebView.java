package org.gnome.webKit;

import java.util.List;

import org.gnome.glib.Signal;
import org.gnome.gtk.Container;
import org.gnome.gtk.Widget;

public class WebView extends Container implements Signal
{

    public native void initNewWindowSignal(long thisWindow);

    public native int getGError(long errorPtr);

    public native void initProxyServer(String proxyUrl);

    public native int getMajorVersion();

    public native int getMinorVersion();

    public native int getMicroVersion();

    public static native long getDefaultSoupSession();

    public native void setupCookiData(String cookieFilePath, int cookiePolicy);

    public static native void setExtensionsDirectory(String dir);

    public WebView() {
        this(WebKitWebView.createWebView());
    }

    protected WebView(final long pointer) {
        super(pointer);

        connectSignals();
    }

    public void enableWebInspector(final boolean enabled) {

        final WebSettings settings = getSettings();
        settings.enableWebInspector(enabled);
    }

    private WebSettings getSettings() {
        return WebKitWebView.getSettings(this);
    }

    private void connectSignals() {

        initNewWindowSignal(Plumbing.pointerFor(this));
    }

    public void loadExtensionInitializationHtml(final List<ExtensionInitializationData> dataItems) {
        final StringBuilder html = new StringBuilder("<!DOCTYPE html>\n");
        html.append("<html>\n");
        html.append("<body>\n");
        html.append("<table border='1'><tr><th>Property</th><th>Value</th></tr>");
        for (final ExtensionInitializationData data : dataItems) {
            addRow(html, data);
        }

        html.append("</table></body>");
        html.append("</html>\n");
        System.out.println(html);
        loadHtml(html.toString(), null);
    }

    private void addRow(final StringBuilder html, final ExtensionInitializationData data) {
        html.append("<tr><td>").append(data.displayText).append("</td>");
        html.append("<td><div id='")
                .append(data.id)
                .append("'>")
                .append(data.value)
                .append("</div></td>");
        html.append("</tr>\n");
    }

    public WebInspector getInspector() {
        return WebKitWebView.getInspector(this);
    }

    public String getUri() {
        return WebKitWebView.getUri(this);
    }

    public float getZoomLevel() {
        return WebKitWebView.getZoomLevel(this);
    }

    public void goBack() {
        WebKitWebView.goBack(this);
    }

    public void goForward() {
        WebKitWebView.goForward(this);
    }

    public void loadUri(final String arg1) {
        WebKitWebView.loadUri(this, arg1);
    }

    public void loadHtml(final String content, final String baseUri) {
        WebKitWebView.loadHtml(this, content, baseUri);
    }

    public void reload() {
        WebKitWebView.reload(this);
    }

    public void reloadBypassCache() {
        WebKitWebView.reloadBypassCache(this);
    }

    public void setZoomLevel(final float arg1) {
        WebKitWebView.setZoomLevel(this, arg1);
    }

    public void stopLoading() {
        WebKitWebView.stopLoading(this);
    }

    public WebContext getContext() {
        return WebKitWebView.getContext(this);
    }

    public static long JNICreateWebView(final long viewPtr) {
        final WebView view = (WebView) Plumbing.getObject(viewPtr);
        final Widget widget = view.createNewView();
        if (widget != null) {
            return Plumbing.pointerFor(widget);
        }
        return 0;
    }

    private Widget createNewView() {
        if (newWindowHandler == null) {
            return null;
        }

        final WebView widget = newWindowHandler.createNewWindow();

        widget.setNewWindowHandler(newWindowHandler);
        return widget;
    }

    public void setNewWindowHandler(final NewWindowHandler handler) {
        this.newWindowHandler = handler;
    }

    public NewWindowHandler getNewWindowHandler() {
        return newWindowHandler;
    }

    NewWindowHandler newWindowHandler = null;
}
