
package org.gnome.webKit;


public class DOMNavigator
    extends DOMObject
{


    protected DOMNavigator(long pointer) {
        super(pointer);
    }

    public String getAppName() {
        return WebKitDOMNavigator.getAppName(this);
    }

    public String getAppVersion() {
        return WebKitDOMNavigator.getAppVersion(this);
    }

    public boolean getCookieEnabled() {
        return WebKitDOMNavigator.getCookieEnabled(this);
    }

    public DOMDOMMimeTypeArray getMimeTypes() {
        return WebKitDOMNavigator.getMimeTypes(this);
    }

    public boolean getOnLine() {
        return WebKitDOMNavigator.getOnLine(this);
    }

    public String getPlatform() {
        return WebKitDOMNavigator.getPlatform(this);
    }

    public String getProduct() {
        return WebKitDOMNavigator.getProduct(this);
    }

    public String getProductSub() {
        return WebKitDOMNavigator.getProductSub(this);
    }

    public void getStorageUpdates() {
        WebKitDOMNavigator.getStorageUpdates(this);
    }

    public String getVendor() {
        return WebKitDOMNavigator.getVendor(this);
    }

    public String getVendorSub() {
        return WebKitDOMNavigator.getVendorSub(this);
    }

    public boolean javaEnabled() {
        return WebKitDOMNavigator.javaEnabled(this);
    }

    public String getAppCodeName() {
        return WebKitDOMNavigator.getAppCodeName(this);
    }

    public DOMGeolocation getGeolocation() {
        return WebKitDOMNavigator.getGeolocation(this);
    }

    public DOMDOMPluginArray getPlugins() {
        return WebKitDOMNavigator.getPlugins(this);
    }

    public String getUserAgent() {
        return WebKitDOMNavigator.getUserAgent(this);
    }

    public String getLanguage() {
        return WebKitDOMNavigator.getLanguage(this);
    }

}
