package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class PluginError extends Constant
{

    protected PluginError(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final PluginError FAILED = new PluginError(
            WebKitPluginError.FAILED, "WEBKIT_PLUGIN_ERROR_FAILED");

    public static final PluginError CANNOT_FIND_PLUGIN = new PluginError(
            WebKitPluginError.CANNOT_FIND_PLUGIN, "WEBKIT_PLUGIN_ERROR_CANNOT_FIND_PLUGIN");
    
    public static final PluginError CANNOT_LOAD_PLUGIN = new PluginError(
            WebKitPluginError.CANNOT_LOAD_PLUGIN, "WEBKIT_PLUGIN_ERROR_CANNOT_LOAD_PLUGIN");
    
    public static final PluginError JAVA_UNAVAILABLE = new PluginError(
            WebKitPluginError.JAVA_UNAVAILABLE, "WEBKIT_PLUGIN_ERROR_JAVA_UNAVAILABLE");
    
    public static final PluginError CONNECTION_CANCELLED = new PluginError(
            WebKitPluginError.CONNECTION_CANCELLED, "WEBKIT_PLUGIN_ERROR_CONNECTION_CANCELLED");
    
    public static final PluginError WILL_HANDLE_LOAD = new PluginError(
            WebKitPluginError.WILL_HANDLE_LOAD, "WEBKIT_PLUGIN_ERROR_WILL_HANDLE_LOAD");
}
