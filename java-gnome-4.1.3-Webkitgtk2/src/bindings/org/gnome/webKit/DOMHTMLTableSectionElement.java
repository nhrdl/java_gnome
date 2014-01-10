package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLTableSectionElement extends DOMHTMLElement
{

    protected DOMHTMLTableSectionElement(long pointer) {
        super(pointer);
    }

    public DOMHTMLCollection getRows() {
        return WebKitDOMHTMLTableSectionElement.getRows(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLTableSectionElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLTableSectionElement.setAlign(this, arg1);
    }

    public DOMHTMLElement insertRow(long arg1) throws GlibException {
        return WebKitDOMHTMLTableSectionElement.insertRow(this, arg1);
    }

    public void setVAlign(String arg1) {
        WebKitDOMHTMLTableSectionElement.setVAlign(this, arg1);
    }

    public void deleteRow(long arg1) throws GlibException {
        WebKitDOMHTMLTableSectionElement.deleteRow(this, arg1);
    }

    public String getVAlign() {
        return WebKitDOMHTMLTableSectionElement.getVAlign(this);
    }

    public void setCh(String arg1) {
        WebKitDOMHTMLTableSectionElement.setCh(this, arg1);
    }

    public void setChOff(String arg1) {
        WebKitDOMHTMLTableSectionElement.setChOff(this, arg1);
    }

    public String getCh() {
        return WebKitDOMHTMLTableSectionElement.getCh(this);
    }

    public String getChOff() {
        return WebKitDOMHTMLTableSectionElement.getChOff(this);
    }

}
