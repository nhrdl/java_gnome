package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLTableElement extends DOMHTMLElement
{

    protected DOMHTMLTableElement(long pointer) {
        super(pointer);
    }

    public DOMHTMLCollection getRows() {
        return WebKitDOMHTMLTableElement.getRows(this);
    }

    public String getWidth() {
        return WebKitDOMHTMLTableElement.getWidth(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLTableElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLTableElement.setAlign(this, arg1);
    }

    public DOMHTMLElement insertRow(long arg1) throws GlibException {
        return WebKitDOMHTMLTableElement.insertRow(this, arg1);
    }

    public void setBgColor(String arg1) {
        WebKitDOMHTMLTableElement.setBgColor(this, arg1);
    }

    public void setBorder(String arg1) {
        WebKitDOMHTMLTableElement.setBorder(this, arg1);
    }

    public void setCaption(DOMHTMLTableCaptionElement arg1) throws GlibException {
        WebKitDOMHTMLTableElement.setCaption(this, arg1);
    }

    public void setCellSpacing(String arg1) {
        WebKitDOMHTMLTableElement.setCellSpacing(this, arg1);
    }

    public void setFrame(String arg1) {
        WebKitDOMHTMLTableElement.setFrame(this, arg1);
    }

    public void setRules(String arg1) {
        WebKitDOMHTMLTableElement.setRules(this, arg1);
    }

    public void setSummary(String arg1) {
        WebKitDOMHTMLTableElement.setSummary(this, arg1);
    }

    public void setTFoot(DOMHTMLTableSectionElement arg1) throws GlibException {
        WebKitDOMHTMLTableElement.setTFoot(this, arg1);
    }

    public void setTHead(DOMHTMLTableSectionElement arg1) throws GlibException {
        WebKitDOMHTMLTableElement.setTHead(this, arg1);
    }

    public void setWidth(String arg1) {
        WebKitDOMHTMLTableElement.setWidth(this, arg1);
    }

    public DOMHTMLElement createTFoot() {
        return WebKitDOMHTMLTableElement.createTFoot(this);
    }

    public DOMHTMLElement createTHead() {
        return WebKitDOMHTMLTableElement.createTHead(this);
    }

    public String getCellSpacing() {
        return WebKitDOMHTMLTableElement.getCellSpacing(this);
    }

    public DOMHTMLElement createCaption() {
        return WebKitDOMHTMLTableElement.createCaption(this);
    }

    public void deleteRow(long arg1) throws GlibException {
        WebKitDOMHTMLTableElement.deleteRow(this, arg1);
    }

    public void deleteTFoot() {
        WebKitDOMHTMLTableElement.deleteTFoot(this);
    }

    public void deleteTHead() {
        WebKitDOMHTMLTableElement.deleteTHead(this);
    }

    public String getBgColor() {
        return WebKitDOMHTMLTableElement.getBgColor(this);
    }

    public String getBorder() {
        return WebKitDOMHTMLTableElement.getBorder(this);
    }

    public DOMHTMLTableCaptionElement getCaption() {
        return WebKitDOMHTMLTableElement.getCaption(this);
    }

    public String getFrame() {
        return WebKitDOMHTMLTableElement.getFrame(this);
    }

    public String getRules() {
        return WebKitDOMHTMLTableElement.getRules(this);
    }

    public String getSummary() {
        return WebKitDOMHTMLTableElement.getSummary(this);
    }

    public DOMHTMLCollection getTBodies() {
        return WebKitDOMHTMLTableElement.getTBodies(this);
    }

    public DOMHTMLTableSectionElement getTFoot() {
        return WebKitDOMHTMLTableElement.getTFoot(this);
    }

    public DOMHTMLTableSectionElement getTHead() {
        return WebKitDOMHTMLTableElement.getTHead(this);
    }

    public void deleteCaption() {
        WebKitDOMHTMLTableElement.deleteCaption(this);
    }

    public void setCellPadding(String arg1) {
        WebKitDOMHTMLTableElement.setCellPadding(this, arg1);
    }

    public String getCellPadding() {
        return WebKitDOMHTMLTableElement.getCellPadding(this);
    }

}
