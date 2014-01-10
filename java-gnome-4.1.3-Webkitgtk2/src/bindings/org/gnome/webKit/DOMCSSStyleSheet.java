package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMCSSStyleSheet extends DOMStyleSheet
{

    protected DOMCSSStyleSheet(long pointer) {
        super(pointer);
    }

    public DOMCSSRuleList getRules() {
        return WebKitDOMCSSStyleSheet.getRules(this);
    }

    public void deleteRule(long arg1) throws GlibException {
        WebKitDOMCSSStyleSheet.deleteRule(this, arg1);
    }

    public DOMCSSRuleList getCssRules() {
        return WebKitDOMCSSStyleSheet.getCssRules(this);
    }

    public DOMCSSRule getOwnerRule() {
        return WebKitDOMCSSStyleSheet.getOwnerRule(this);
    }

    public long insertRule(String arg1, long arg2) throws GlibException {
        return WebKitDOMCSSStyleSheet.insertRule(this, arg1, arg2);
    }

    public void removeRule(long arg1) throws GlibException {
        WebKitDOMCSSStyleSheet.removeRule(this, arg1);
    }

    public long addRule(String arg1, String arg2, long arg3) throws GlibException {
        return WebKitDOMCSSStyleSheet.addRule(this, arg1, arg2, arg3);
    }

}
