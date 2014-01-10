package org.gnome.webKit;

import org.freedesktop.bindings.Constant;

public class PolicyError extends Constant
{

    protected PolicyError(int ordinal, String nickname) {
        super(ordinal, nickname);
        // TODO Auto-generated constructor stub
    }

    public static final PolicyError FAILED = new PolicyError(WebKitPolicyError.FAILED,
            "WEBKIT_POLICY_ERROR_FAILED");

    public static final PolicyError CANNOT_SHOW_MIME_TYPE = new PolicyError(
            WebKitPolicyError.CANNOT_SHOW_MIME_TYPE, "WEBKIT_POLICY_ERROR_CANNOT_SHOW_MIME_TYPE");

    public static final PolicyError CANNOT_SHOW_URL = new PolicyError(WebKitPolicyError.CANNOT_SHOW_URL,
            "WEBKIT_POLICY_ERROR_CANNOT_SHOW_URL");

    public static final PolicyError FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE = new PolicyError(
            WebKitPolicyError.FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE,
            "WEBKIT_POLICY_ERROR_FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE");

    public static final PolicyError CANNOT_USE_RESTRICTED_PORT = new PolicyError(
            WebKitPolicyError.CANNOT_USE_RESTRICTED_PORT,
            "WEBKIT_POLICY_ERROR_CANNOT_USE_RESTRICTED_PORT");
}
