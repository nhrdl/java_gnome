package org.gnome.webKit;

import org.gnome.glib.Object;

public class WebResource extends Object
{

    // public WebResource(final String data, final int size, final String uri,
    // final String mimeType,
    // final String encoding, final String frameName) {
    // this(WebKitWebResource.createWebResource(data, size, uri, mimeType,
    // encoding, frameName));
    // }

    protected WebResource(final long pointer) {
        super(pointer);
    }

    // public String getFrameName() {
    // return WebKitWebResource.getFrameName(this);
    // }
    //
    // public String getMimeType() {
    // return WebKitWebResource.getMimeType(this);
    // }
    //
    // public String getEncoding() {
    // return WebKitWebResource.getEncoding(this);
    // }
    //
    // public FIXME getData() {
    // return WebKitWebResource.getData(this);
    // }
    //
    // public String getUri() {
    // return WebKitWebResource.getUri(this);
    // }

}
