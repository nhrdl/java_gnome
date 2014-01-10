package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class CacheModel extends Constant
{

    protected CacheModel(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final CacheModel DEFAULT = new CacheModel(WebKitCacheModel.DEFAULT, "WEBKIT_CACHE_MODEL_DEFAULT");

    public static final CacheModel DOCUMENT_VIEWER = new CacheModel(WebKitCacheModel.DOCUMENT_VIEWER, "WEBKIT_CACHE_MODEL_DOCUMENT_VIEWER");
    
    public static final CacheModel WEB_BROWSER = new CacheModel(WebKitCacheModel.WEB_BROWSER, "WEBKIT_CACHE_MODEL_WEB_BROWSER");

    public static final CacheModel DOCUMENT_BROWSER = new CacheModel(WebKitCacheModel.DOCUMENT_BROWSER, "WEBKIT_CACHE_MODEL_DOCUMENT_BROWSER");
}
