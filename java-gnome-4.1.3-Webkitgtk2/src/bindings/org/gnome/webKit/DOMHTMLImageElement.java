
package org.gnome.webKit;


public class DOMHTMLImageElement
    extends DOMHTMLElement
{


    protected DOMHTMLImageElement(long pointer) {
        super(pointer);
    }

    public boolean getComplete() {
        return WebKitDOMHTMLImageElement.getComplete(this);
    }

    public String getAlt() {
        return WebKitDOMHTMLImageElement.getAlt(this);
    }

    public long getWidth() {
        return WebKitDOMHTMLImageElement.getWidth(this);
    }

    public long getHeight() {
        return WebKitDOMHTMLImageElement.getHeight(this);
    }

    public long getX() {
        return WebKitDOMHTMLImageElement.getX(this);
    }

    public long getY() {
        return WebKitDOMHTMLImageElement.getY(this);
    }

    public String getAlign() {
        return WebKitDOMHTMLImageElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLImageElement.setAlign(this, arg1);
    }

    public void setBorder(String arg1) {
        WebKitDOMHTMLImageElement.setBorder(this, arg1);
    }

    public void setWidth(long arg1) {
        WebKitDOMHTMLImageElement.setWidth(this, arg1);
    }

    public String getBorder() {
        return WebKitDOMHTMLImageElement.getBorder(this);
    }

    public String getSrc() {
        return WebKitDOMHTMLImageElement.getSrc(this);
    }

    public String getUseMap() {
        return WebKitDOMHTMLImageElement.getUseMap(this);
    }

    public void setAlt(String arg1) {
        WebKitDOMHTMLImageElement.setAlt(this, arg1);
    }

    public void setSrc(String arg1) {
        WebKitDOMHTMLImageElement.setSrc(this, arg1);
    }

    public void setUseMap(String arg1) {
        WebKitDOMHTMLImageElement.setUseMap(this, arg1);
    }

    public void setHeight(long arg1) {
        WebKitDOMHTMLImageElement.setHeight(this, arg1);
    }

    public long getHspace() {
        return WebKitDOMHTMLImageElement.getHspace(this);
    }

    public long getVspace() {
        return WebKitDOMHTMLImageElement.getVspace(this);
    }

    public void setHspace(long arg1) {
        WebKitDOMHTMLImageElement.setHspace(this, arg1);
    }

    public void setVspace(long arg1) {
        WebKitDOMHTMLImageElement.setVspace(this, arg1);
    }

    public String getLongDesc() {
        return WebKitDOMHTMLImageElement.getLongDesc(this);
    }

    public void setLongDesc(String arg1) {
        WebKitDOMHTMLImageElement.setLongDesc(this, arg1);
    }

    public boolean getIsMap() {
        return WebKitDOMHTMLImageElement.getIsMap(this);
    }

    public String getLowsrc() {
        return WebKitDOMHTMLImageElement.getLowsrc(this);
    }

    public long getNaturalWidth() {
        return WebKitDOMHTMLImageElement.getNaturalWidth(this);
    }

    public void setCrossOrigin(String arg1) {
        WebKitDOMHTMLImageElement.setCrossOrigin(this, arg1);
    }

    public void setIsMap(boolean arg1) {
        WebKitDOMHTMLImageElement.setIsMap(this, arg1);
    }

    public void setLowsrc(String arg1) {
        WebKitDOMHTMLImageElement.setLowsrc(this, arg1);
    }

    public String getCrossOrigin() {
        return WebKitDOMHTMLImageElement.getCrossOrigin(this);
    }

    public long getNaturalHeight() {
        return WebKitDOMHTMLImageElement.getNaturalHeight(this);
    }

    public String getName() {
        return WebKitDOMHTMLImageElement.getName(this);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLImageElement.setName(this, arg1);
    }

}
