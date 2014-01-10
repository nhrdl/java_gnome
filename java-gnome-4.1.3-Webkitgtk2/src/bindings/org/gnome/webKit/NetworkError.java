package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class NetworkError extends Constant
{

    protected NetworkError(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final NetworkError FAILED = new NetworkError(
            WebKitNetworkError.FAILED, "WEBKIT_NETWORK_ERROR_FAILED");
    
    public static final NetworkError TRANSPORT = new NetworkError(
            WebKitNetworkError.TRANSPORT, "WEBKIT_NETWORK_ERROR_TRANSPORT");
    
    public static final NetworkError UNKNOWN_PROTOCOL = new NetworkError(
            WebKitNetworkError.UNKNOWN_PROTOCOL, "WEBKIT_NETWORK_ERROR_UNKNOWN_PROTOCOL");
    
    public static final NetworkError CANCELLED = new NetworkError(
            WebKitNetworkError.CANCELLED, "WEBKIT_NETWORK_ERROR_CANCELLED");
    
    public static final NetworkError FILE_DOES_NOT_EXIST = new NetworkError(
            WebKitNetworkError.FILE_DOES_NOT_EXIST, "WEBKIT_NETWORK_ERROR_FILE_DOES_NOT_EXIST");
}
