package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMCSSStyleDeclaration extends DOMObject
{

    protected DOMCSSStyleDeclaration(long pointer) {
        super(pointer);
    }

    public String removeProperty(String arg1) throws GlibException {
        return WebKitDOMCSSStyleDeclaration.removeProperty(this, arg1);
    }

    public String getPropertyPriority(String arg1) {
        return WebKitDOMCSSStyleDeclaration.getPropertyPriority(this, arg1);
    }

    public boolean isPropertyImplicit(String arg1) {
        return WebKitDOMCSSStyleDeclaration.isPropertyImplicit(this, arg1);
    }

    public String getPropertyShorthand(String arg1) {
        return WebKitDOMCSSStyleDeclaration.getPropertyShorthand(this, arg1);
    }

    public DOMCSSValue getPropertyCssValue(String arg1) {
        return WebKitDOMCSSStyleDeclaration.getPropertyCssValue(this, arg1);
    }

    public String getPropertyValue(String arg1) {
        return WebKitDOMCSSStyleDeclaration.getPropertyValue(this, arg1);
    }

    public String item(long arg1) {
        return WebKitDOMCSSStyleDeclaration.item(this, arg1);
    }

    public DOMCSSRule getParentRule() {
        return WebKitDOMCSSStyleDeclaration.getParentRule(this);
    }

    public void setCssText(String arg1) throws GlibException {
        WebKitDOMCSSStyleDeclaration.setCssText(this, arg1);
    }

    public String getCssText() {
        return WebKitDOMCSSStyleDeclaration.getCssText(this);
    }

    public void setProperty(String arg1, String arg2, String arg3) throws GlibException {
        WebKitDOMCSSStyleDeclaration.setProperty(this, arg1, arg2, arg3);
    }

    public long getLength() {
        return WebKitDOMCSSStyleDeclaration.getLength(this);
    }

}
