
package org.gnome.webKit;


public class DOMDocumentType
    extends DOMNode
{


    protected DOMDocumentType(long pointer) {
        super(pointer);
    }

    public DOMNamedNodeMap getNotations() {
        return WebKitDOMDocumentType.getNotations(this);
    }

    public DOMNamedNodeMap getEntities() {
        return WebKitDOMDocumentType.getEntities(this);
    }

    public String getInternalSubset() {
        return WebKitDOMDocumentType.getInternalSubset(this);
    }

    public String getPublicId() {
        return WebKitDOMDocumentType.getPublicId(this);
    }

    public String getSystemId() {
        return WebKitDOMDocumentType.getSystemId(this);
    }

    public String getName() {
        return WebKitDOMDocumentType.getName(this);
    }

}
