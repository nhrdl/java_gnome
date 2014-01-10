
package org.gnome.webKit;


public class DOMXPathNSResolver
    extends DOMObject
{


    protected DOMXPathNSResolver(long pointer) {
        super(pointer);
    }

    public String lookupNamespaceUri(String arg1) {
        return WebKitDOMXPathNSResolver.lookupNamespaceUri(this, arg1);
    }

}
