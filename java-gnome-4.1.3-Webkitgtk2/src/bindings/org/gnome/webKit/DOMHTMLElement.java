package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLElement extends DOMElement
{

    protected DOMHTMLElement(long pointer) {
        super(pointer);
    }

    public String getDir() {
        return WebKitDOMHTMLElement.getDir(this);
    }

    public boolean getDraggable() {
        return WebKitDOMHTMLElement.getDraggable(this);
    }

    public boolean getHidden() {
        return WebKitDOMHTMLElement.getHidden(this);
    }

    public String getInnerHtml() {
        return WebKitDOMHTMLElement.getInnerHtml(this);
    }

    public String getInnerText() {
        return WebKitDOMHTMLElement.getInnerText(this);
    }

    public boolean getIsContentEditable() {
        return WebKitDOMHTMLElement.getIsContentEditable(this);
    }

    public String getItemId() {
        return WebKitDOMHTMLElement.getItemId(this);
    }

    public DOMDOMSettableTokenList getItemProp() {
        return WebKitDOMHTMLElement.getItemProp(this);
    }

    public DOMDOMSettableTokenList getItemRef() {
        return WebKitDOMHTMLElement.getItemRef(this);
    }

    public String getAccessKey() {
        return WebKitDOMHTMLElement.getAccessKey(this);
    }

    public boolean getItemScope() {
        return WebKitDOMHTMLElement.getItemScope(this);
    }

    public DOMDOMTokenList getClassList() {
        return WebKitDOMHTMLElement.getClassList(this);
    }

    public void setDir(String arg1) {
        WebKitDOMHTMLElement.setDir(this, arg1);
    }

    public DOMDOMSettableTokenList getItemType() {
        return WebKitDOMHTMLElement.getItemType(this);
    }

    public String getLang() {
        return WebKitDOMHTMLElement.getLang(this);
    }

    public String getOuterHtml() {
        return WebKitDOMHTMLElement.getOuterHtml(this);
    }

    public String getOuterText() {
        return WebKitDOMHTMLElement.getOuterText(this);
    }

    public boolean getSpellcheck() {
        return WebKitDOMHTMLElement.getSpellcheck(this);
    }

    public long getTabIndex() {
        return WebKitDOMHTMLElement.getTabIndex(this);
    }

    public boolean getTranslate() {
        return WebKitDOMHTMLElement.getTranslate(this);
    }

    public String getWebkitdropzone() {
        return WebKitDOMHTMLElement.getWebkitdropzone(this);
    }

    public DOMElement insertAdjacentElement(String arg1, DOMElement arg2) throws GlibException {
        return WebKitDOMHTMLElement.insertAdjacentElement(this, arg1, arg2);
    }

    public void insertAdjacentHtml(String arg1, String arg2) throws GlibException {
        WebKitDOMHTMLElement.insertAdjacentHtml(this, arg1, arg2);
    }

    public void insertAdjacentText(String arg1, String arg2) throws GlibException {
        WebKitDOMHTMLElement.insertAdjacentText(this, arg1, arg2);
    }

    public void setAccessKey(String arg1) {
        WebKitDOMHTMLElement.setAccessKey(this, arg1);
    }

    public void setClassName(String arg1) {
        WebKitDOMHTMLElement.setClassName(this, arg1);
    }

    public void setContentEditable(String arg1) throws GlibException {
        WebKitDOMHTMLElement.setContentEditable(this, arg1);
    }

    public void setDraggable(boolean arg1) {
        WebKitDOMHTMLElement.setDraggable(this, arg1);
    }

    public void setHidden(boolean arg1) {
        WebKitDOMHTMLElement.setHidden(this, arg1);
    }

    public void setId(String arg1) {
        WebKitDOMHTMLElement.setId(this, arg1);
    }

    public void setInnerHtml(String arg1) throws GlibException {
        WebKitDOMHTMLElement.setInnerHtml(this, arg1);
    }

    public void setInnerText(String arg1) throws GlibException {
        WebKitDOMHTMLElement.setInnerText(this, arg1);
    }

    public void setItemId(String arg1) {
        WebKitDOMHTMLElement.setItemId(this, arg1);
    }

    public void setItemScope(boolean arg1) {
        WebKitDOMHTMLElement.setItemScope(this, arg1);
    }

    public void setLang(String arg1) {
        WebKitDOMHTMLElement.setLang(this, arg1);
    }

    public void setOuterHtml(String arg1) throws GlibException {
        WebKitDOMHTMLElement.setOuterHtml(this, arg1);
    }

    public void setOuterText(String arg1) throws GlibException {
        WebKitDOMHTMLElement.setOuterText(this, arg1);
    }

    public void setSpellcheck(boolean arg1) {
        WebKitDOMHTMLElement.setSpellcheck(this, arg1);
    }

    public void setTabIndex(long arg1) {
        WebKitDOMHTMLElement.setTabIndex(this, arg1);
    }

    public void setTitle(String arg1) {
        WebKitDOMHTMLElement.setTitle(this, arg1);
    }

    public void setTranslate(boolean arg1) {
        WebKitDOMHTMLElement.setTranslate(this, arg1);
    }

    public void setWebkitdropzone(String arg1) {
        WebKitDOMHTMLElement.setWebkitdropzone(this, arg1);
    }

    public String getContentEditable() {
        return WebKitDOMHTMLElement.getContentEditable(this);
    }

    public void click() {
        WebKitDOMHTMLElement.click(this);
    }

    public String getTitle() {
        return WebKitDOMHTMLElement.getTitle(this);
    }

    public DOMHTMLCollection getChildren() {
        return WebKitDOMHTMLElement.getChildren(this);
    }

    public String getId() {
        return WebKitDOMHTMLElement.getId(this);
    }

    public String getClassName() {
        return WebKitDOMHTMLElement.getClassName(this);
    }

}
