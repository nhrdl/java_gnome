package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMNode extends DOMObject
{

    protected DOMNode(long pointer) {
        super(pointer);
    }

    public void normalize() {
        WebKitDOMNode.normalize(this);
    }

    public DOMNamedNodeMap getAttributes() {
        return WebKitDOMNode.getAttributes(this);
    }

    public String getPrefix() {
        return WebKitDOMNode.getPrefix(this);
    }

    public boolean dispatchEvent(DOMEvent arg1) throws GlibException {
        return WebKitDOMNode.dispatchEvent(this, arg1);
    }

    public String getBaseUri() {
        return WebKitDOMNode.getBaseUri(this);
    }

    public DOMNodeList getChildNodes() {
        return WebKitDOMNode.getChildNodes(this);
    }

    public org.gnome.webKit.DOMNode getFirstChild() {
        return WebKitDOMNode.getFirstChild(this);
    }

    public org.gnome.webKit.DOMNode getLastChild() {
        return WebKitDOMNode.getLastChild(this);
    }

    public String getLocalName() {
        return WebKitDOMNode.getLocalName(this);
    }

    public String getNamespaceUri() {
        return WebKitDOMNode.getNamespaceUri(this);
    }

    public org.gnome.webKit.DOMNode cloneNode(boolean arg1) {
        return WebKitDOMNode.cloneNode(this, arg1);
    }

    public org.gnome.webKit.DOMNode appendChild(org.gnome.webKit.DOMNode arg1) throws GlibException {
        return WebKitDOMNode.appendChild(this, arg1);
    }

    public String getTextContent() {
        return WebKitDOMNode.getTextContent(this);
    }

    public void setTextContent(String arg1) throws GlibException {
        WebKitDOMNode.setTextContent(this, arg1);
    }

    public boolean isEqualNode(org.gnome.webKit.DOMNode arg1) {
        return WebKitDOMNode.isEqualNode(this, arg1);
    }

    public boolean isSameNode(org.gnome.webKit.DOMNode arg1) {
        return WebKitDOMNode.isSameNode(this, arg1);
    }

    public String lookupNamespaceUri(String arg1) {
        return WebKitDOMNode.lookupNamespaceUri(this, arg1);
    }

    public String lookupPrefix(String arg1) {
        return WebKitDOMNode.lookupPrefix(this, arg1);
    }

    public org.gnome.webKit.DOMNode removeChild(org.gnome.webKit.DOMNode arg1) throws GlibException {
        return WebKitDOMNode.removeChild(this, arg1);
    }

    public org.gnome.webKit.DOMNode replaceChild(org.gnome.webKit.DOMNode arg1,
            org.gnome.webKit.DOMNode arg2) throws GlibException {
        return WebKitDOMNode.replaceChild(this, arg1, arg2);
    }

    public void setNodeValue(String arg1) throws GlibException {
        WebKitDOMNode.setNodeValue(this, arg1);
    }

    public void setPrefix(String arg1) throws GlibException {
        WebKitDOMNode.setPrefix(this, arg1);
    }

    public short compareDocumentPosition(org.gnome.webKit.DOMNode arg1) {
        return WebKitDOMNode.compareDocumentPosition(this, arg1);
    }

    public org.gnome.webKit.DOMNode getNextSibling() {
        return WebKitDOMNode.getNextSibling(this);
    }

    public String getNodeName() {
        return WebKitDOMNode.getNodeName(this);
    }

    public short getNodeType() {
        return WebKitDOMNode.getNodeType(this);
    }

    public String getNodeValue() {
        return WebKitDOMNode.getNodeValue(this);
    }

    public DOMDocument getOwnerDocument() {
        return WebKitDOMNode.getOwnerDocument(this);
    }

    public DOMElement getParentElement() {
        return WebKitDOMNode.getParentElement(this);
    }

    public org.gnome.webKit.DOMNode getParentNode() {
        return WebKitDOMNode.getParentNode(this);
    }

    public org.gnome.webKit.DOMNode getPreviousSibling() {
        return WebKitDOMNode.getPreviousSibling(this);
    }

    public boolean hasAttributes() {
        return WebKitDOMNode.hasAttributes(this);
    }

    public boolean hasChildNodes() {
        return WebKitDOMNode.hasChildNodes(this);
    }

    public org.gnome.webKit.DOMNode insertBefore(org.gnome.webKit.DOMNode arg1,
            org.gnome.webKit.DOMNode arg2) throws GlibException {
        return WebKitDOMNode.insertBefore(this, arg1, arg2);
    }

    public boolean isDefaultNamespace(String arg1) {
        return WebKitDOMNode.isDefaultNamespace(this, arg1);
    }

    public boolean contains(org.gnome.webKit.DOMNode arg1) {
        return WebKitDOMNode.contains(this, arg1);
    }

    public boolean isSupported(String arg1, String arg2) {
        return WebKitDOMNode.isSupported(this, arg1, arg2);
    }

}
