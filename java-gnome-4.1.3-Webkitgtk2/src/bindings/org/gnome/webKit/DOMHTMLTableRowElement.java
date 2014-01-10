package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLTableRowElement extends DOMHTMLElement
{

    protected DOMHTMLTableRowElement(long pointer) {
        super(pointer);
    }

    public long getRowIndex() {
        return WebKitDOMHTMLTableRowElement.getRowIndex(this);
    }

    public long getSectionRowIndex() {
        return WebKitDOMHTMLTableRowElement.getSectionRowIndex(this);
    }

    public DOMHTMLElement insertCell(long arg1) throws GlibException {
        return WebKitDOMHTMLTableRowElement.insertCell(this, arg1);
    }

    public DOMHTMLCollection getCells() {
        return WebKitDOMHTMLTableRowElement.getCells(this);
    }

    public void deleteCell(long arg1) throws GlibException {
        WebKitDOMHTMLTableRowElement.deleteCell(this, arg1);
    }

    public String getAlign() {
        return WebKitDOMHTMLTableRowElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLTableRowElement.setAlign(this, arg1);
    }

    public void setBgColor(String arg1) {
        WebKitDOMHTMLTableRowElement.setBgColor(this, arg1);
    }

    public void setVAlign(String arg1) {
        WebKitDOMHTMLTableRowElement.setVAlign(this, arg1);
    }

    public String getBgColor() {
        return WebKitDOMHTMLTableRowElement.getBgColor(this);
    }

    public String getVAlign() {
        return WebKitDOMHTMLTableRowElement.getVAlign(this);
    }

    public void setCh(String arg1) {
        WebKitDOMHTMLTableRowElement.setCh(this, arg1);
    }

    public void setChOff(String arg1) {
        WebKitDOMHTMLTableRowElement.setChOff(this, arg1);
    }

    public String getCh() {
        return WebKitDOMHTMLTableRowElement.getCh(this);
    }

    public String getChOff() {
        return WebKitDOMHTMLTableRowElement.getChOff(this);
    }

}
