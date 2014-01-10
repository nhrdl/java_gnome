
package org.gnome.webKit;


public class DOMStyleSheet
    extends DOMObject
{


    protected DOMStyleSheet(long pointer) {
        super(pointer);
    }

    public DOMMediaList getMedia() {
        return WebKitDOMStyleSheet.getMedia(this);
    }

    public DOMNode getOwnerNode() {
        return WebKitDOMStyleSheet.getOwnerNode(this);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMStyleSheet.setDisabled(this, arg1);
    }

    public boolean getDisabled() {
        return WebKitDOMStyleSheet.getDisabled(this);
    }

    public String getTitle() {
        return WebKitDOMStyleSheet.getTitle(this);
    }

    public String getHref() {
        return WebKitDOMStyleSheet.getHref(this);
    }

    public org.gnome.webKit.DOMStyleSheet getParentStyleSheet() {
        return WebKitDOMStyleSheet.getParentStyleSheet(this);
    }

}
