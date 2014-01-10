package org.gnome.webKit;

import java.util.ArrayList;
import java.util.List;

import org.gnome.glib.GlibException;

public class DOMDocument extends DOMNode
{

    // Checkout
    // http://xerces.apache.org/xerces2-j/javadocs/api/org/w3c/dom/xpath/XPathResult.html

    static final short ANY_TYPE = 0, NUMBER_TYPE = 1, STRING_TYPE = 2, BOOLEAN_TYPE = 3,
            UNORDERED_NODE_ITERATOR_TYPE = 4, ORDERED_NODE_ITERATOR_TYPE = 5,
            UNORDERED_NODE_SNAPSHOT_TYPE = 6, ORDERED_NODE_SNAPSHOT_TYPE = 7,
            ANY_UNORDERED_NODE_TYPE = 8, FIRST_ORDERED_NODE_TYPE = 9;

    public DOMDocument(final long pointer) {
        super(pointer);
    }

    public String getReadyState() {
        return WebKitDOMDocument.getReadyState(this);
    }

    public String getCompatMode() {
        return WebKitDOMDocument.getCompatMode(this);
    }

    public DOMNodeList querySelectorAll(final String arg1) throws GlibException {
        return WebKitDOMDocument.querySelectorAll(this, arg1);
    }

    public DOMElement querySelector(final String arg1) throws GlibException {
        return WebKitDOMDocument.querySelector(this, arg1);
    }

    public void setTitle(final String arg1) {
        WebKitDOMDocument.setTitle(this, arg1);
    }

    public DOMNode adoptNode(final DOMNode arg1) throws GlibException {
        return WebKitDOMDocument.adoptNode(this, arg1);
    }

    public DOMCDATASection createCdataSection(final String arg1) throws GlibException {
        return WebKitDOMDocument.createCdataSection(this, arg1);
    }

    public DOMComment createComment(final String arg1) {
        return WebKitDOMDocument.createComment(this, arg1);
    }

    public DOMCSSStyleDeclaration createCssStyleDeclaration() {
        return WebKitDOMDocument.createCssStyleDeclaration(this);
    }

    public DOMDocumentFragment createDocumentFragment() {
        return WebKitDOMDocument.createDocumentFragment(this);
    }

    public DOMElement createElement(final String arg1) throws GlibException {
        return WebKitDOMDocument.createElement(this, arg1);
    }

    public DOMElement createElementNs(final String arg1, final String arg2) throws GlibException {
        return WebKitDOMDocument.createElementNs(this, arg1, arg2);
    }

    public DOMEntityReference createEntityReference(final String arg1) throws GlibException {
        return WebKitDOMDocument.createEntityReference(this, arg1);
    }

    public DOMEvent createEvent(final String arg1) throws GlibException {
        return WebKitDOMDocument.createEvent(this, arg1);
    }

    public DOMXPathExpression createExpression(final String arg1, final DOMXPathNSResolver arg2)
            throws GlibException {
        return WebKitDOMDocument.createExpression(this, arg1, arg2);
    }

    public DOMRange caretRangeFromPoint(final long arg1, final long arg2) {
        return WebKitDOMDocument.caretRangeFromPoint(this, arg1, arg2);
    }

    public DOMNodeIterator createNodeIterator(final DOMNode arg1, final long arg2,
            final DOMNodeFilter arg3, final boolean arg4) throws GlibException {
        return WebKitDOMDocument.createNodeIterator(this, arg1, arg2, arg3, arg4);
    }

    public DOMProcessingInstruction createProcessingInstruction(final String arg1, final String arg2)
            throws GlibException {
        return WebKitDOMDocument.createProcessingInstruction(this, arg1, arg2);
    }

    public DOMRange createRange() {
        return WebKitDOMDocument.createRange(this);
    }

    public DOMText createTextNode(final String arg1) {
        return WebKitDOMDocument.createTextNode(this, arg1);
    }

    public DOMTreeWalker createTreeWalker(final DOMNode arg1, final long arg2, final DOMNodeFilter arg3,
            final boolean arg4) throws GlibException {
        return WebKitDOMDocument.createTreeWalker(this, arg1, arg2, arg3, arg4);
    }

    public DOMElement elementFromPoint(final long arg1, final long arg2) {
        return WebKitDOMDocument.elementFromPoint(this, arg1, arg2);
    }

    public boolean execCommand(final String arg1, final boolean arg2, final String arg3) {
        return WebKitDOMDocument.execCommand(this, arg1, arg2, arg3);
    }

    public DOMHTMLCollection getAnchors() {
        return WebKitDOMDocument.getAnchors(this);
    }

    public DOMHTMLCollection getApplets() {
        return WebKitDOMDocument.getApplets(this);
    }

    public DOMHTMLElement getBody() {
        return WebKitDOMDocument.getBody(this);
    }

    public String getCharacterSet() {
        return WebKitDOMDocument.getCharacterSet(this);
    }

    public String getCookie() throws GlibException {
        return WebKitDOMDocument.getCookie(this);
    }

    public String getDefaultCharset() {
        return WebKitDOMDocument.getDefaultCharset(this);
    }

    public DOMDOMWindow getDefaultView() {
        return WebKitDOMDocument.getDefaultView(this);
    }

    public DOMDocumentType getDoctype() {
        return WebKitDOMDocument.getDoctype(this);
    }

    public DOMElement getDocumentElement() {
        return WebKitDOMDocument.getDocumentElement(this);
    }

    public String getDocumentUri() {
        return WebKitDOMDocument.getDocumentUri(this);
    }

    public String getDomain() {
        return WebKitDOMDocument.getDomain(this);
    }

    public DOMNodeList getElementsByClassName(final String arg1) {
        return WebKitDOMDocument.getElementsByClassName(this, arg1);
    }

    public DOMAttr createAttribute(final String arg1) throws GlibException {
        return WebKitDOMDocument.createAttribute(this, arg1);
    }

    public DOMAttr createAttributeNs(final String arg1, final String arg2) throws GlibException {
        return WebKitDOMDocument.createAttributeNs(this, arg1, arg2);
    }

    public DOMNodeList getElementsByTagName(final String arg1) {
        return WebKitDOMDocument.getElementsByTagName(this, arg1);
    }

    public DOMNodeList getElementsByTagNameNs(final String arg1, final String arg2) {
        return WebKitDOMDocument.getElementsByTagNameNs(this, arg1, arg2);
    }

    public DOMHTMLCollection getForms() {
        return WebKitDOMDocument.getForms(this);
    }

    public DOMHTMLHeadElement getHead() {
        return WebKitDOMDocument.getHead(this);
    }

    public DOMHTMLCollection getImages() {
        return WebKitDOMDocument.getImages(this);
    }

    public DOMDOMImplementation getImplementation() {
        return WebKitDOMDocument.getImplementation(this);
    }

    public String getInputEncoding() {
        return WebKitDOMDocument.getInputEncoding(this);
    }

    public DOMHTMLCollection getLinks() {
        return WebKitDOMDocument.getLinks(this);
    }

    public DOMCSSStyleDeclaration getOverrideStyle(final DOMElement arg1, final String arg2) {
        return WebKitDOMDocument.getOverrideStyle(this, arg1, arg2);
    }

    public String getPreferredStylesheetSet() {
        return WebKitDOMDocument.getPreferredStylesheetSet(this);
    }

    public String getReferrer() {
        return WebKitDOMDocument.getReferrer(this);
    }

    public String getSelectedStylesheetSet() {
        return WebKitDOMDocument.getSelectedStylesheetSet(this);
    }

    public DOMStyleSheetList getStyleSheets() {
        return WebKitDOMDocument.getStyleSheets(this);
    }

    public DOMElement getWebkitCurrentFullScreenElement() {
        return WebKitDOMDocument.getWebkitCurrentFullScreenElement(this);
    }

    public boolean getWebkitFullScreenKeyboardInputAllowed() {
        return WebKitDOMDocument.getWebkitFullScreenKeyboardInputAllowed(this);
    }

    public boolean getWebkitHidden() {
        return WebKitDOMDocument.getWebkitHidden(this);
    }

    public boolean getWebkitIsFullScreen() {
        return WebKitDOMDocument.getWebkitIsFullScreen(this);
    }

    public String getWebkitVisibilityState() {
        return WebKitDOMDocument.getWebkitVisibilityState(this);
    }

    public String getXmlEncoding() {
        return WebKitDOMDocument.getXmlEncoding(this);
    }

    public boolean getXmlStandalone() {
        return WebKitDOMDocument.getXmlStandalone(this);
    }

    public String getXmlVersion() {
        return WebKitDOMDocument.getXmlVersion(this);
    }

    public DOMNode importNode(final DOMNode arg1, final boolean arg2) throws GlibException {
        return WebKitDOMDocument.importNode(this, arg1, arg2);
    }

    public boolean queryCommandEnabled(final String arg1) {
        return WebKitDOMDocument.queryCommandEnabled(this, arg1);
    }

    public boolean queryCommandIndeterm(final String arg1) {
        return WebKitDOMDocument.queryCommandIndeterm(this, arg1);
    }

    public boolean queryCommandState(final String arg1) {
        return WebKitDOMDocument.queryCommandState(this, arg1);
    }

    public boolean queryCommandSupported(final String arg1) {
        return WebKitDOMDocument.queryCommandSupported(this, arg1);
    }

    public String queryCommandValue(final String arg1) {
        return WebKitDOMDocument.queryCommandValue(this, arg1);
    }

    public void setBody(final DOMHTMLElement arg1) throws GlibException {
        WebKitDOMDocument.setBody(this, arg1);
    }

    public void setCookie(final String arg1) throws GlibException {
        WebKitDOMDocument.setCookie(this, arg1);
    }

    public void setDocumentUri(final String arg1) {
        WebKitDOMDocument.setDocumentUri(this, arg1);
    }

    public void setSelectedStylesheetSet(final String arg1) {
        WebKitDOMDocument.setSelectedStylesheetSet(this, arg1);
    }

    public void setXmlStandalone(final boolean arg1) throws GlibException {
        WebKitDOMDocument.setXmlStandalone(this, arg1);
    }

    public void setXmlVersion(final String arg1) throws GlibException {
        WebKitDOMDocument.setXmlVersion(this, arg1);
    }

    public void webkitCancelFullScreen() {
        WebKitDOMDocument.webkitCancelFullScreen(this);
    }

    public String getLastModified() {
        return WebKitDOMDocument.getLastModified(this);
    }

    public DOMElement getElementById(final String arg1) {
        return WebKitDOMDocument.getElementById(this, arg1);
    }

    public DOMNodeList getElementsByName(final String arg1) {
        return WebKitDOMDocument.getElementsByName(this, arg1);
    }

    public DOMXPathNSResolver createNsResolver(final DOMNode arg1) {
        return WebKitDOMDocument.createNsResolver(this, arg1);
    }

    public DOMXPathResult evaluate(final String arg1, final DOMNode arg2, final DOMXPathNSResolver arg3,
            final short arg4, final DOMXPathResult arg5) throws GlibException {
        return WebKitDOMDocument.evaluate(this, arg1, arg2, arg3, arg4, arg5);
    }

    public String getTitle() {
        return WebKitDOMDocument.getTitle(this);
    }

    public String getCharset() {
        return WebKitDOMDocument.getCharset(this);
    }

    public void setCharset(final String arg1) {
        WebKitDOMDocument.setCharset(this, arg1);
    }

    public DOMXPathNSResolver createResolver() {
        return WebKitDOMDocument.createNsResolver(this, this);
    }

    public List<DOMNode> evaluateMultiple(final String xpath) throws GlibException {
        return evaluateMultiple(xpath, this);
        /*
         * DOMXPathResult res = WebKitDOMDocument.evaluate(this, xpath, this,
         * createResolver(), ORDERED_NODE_SNAPSHOT_TYPE, null);
         * 
         * ArrayList<DOMNode> list = new ArrayList<DOMNode>(); long count =
         * res.getSnapshotLength(); for (int i = 0; i < count; i++) {
         * list.add(res.snapshotItem(i)); } return list;
         */
    }

    public List<DOMNode> evaluateMultiple(final String xpath, final DOMNode contextNode)
            throws GlibException {
        final DOMXPathResult res = WebKitDOMDocument.evaluate(this, xpath, contextNode,
                createResolver(), ORDERED_NODE_SNAPSHOT_TYPE, null);

        final ArrayList<DOMNode> list = new ArrayList<DOMNode>();
        final long count = res.getSnapshotLength();
        for (int i = 0; i < count; i++) {
            list.add(res.snapshotItem(i));
        }
        return list;

    }

    public DOMNode evaluate(final String xpath) throws GlibException {

        final DOMXPathResult res = WebKitDOMDocument.evaluate(this, xpath, this, createResolver(),
                ANY_UNORDERED_NODE_TYPE, null);

        return res.getSingleNodeValue();

    }

    public DOMNode evaluate(final String xpath, final DOMNode contextNode) throws GlibException {

        final DOMXPathResult res = WebKitDOMDocument.evaluate(this, xpath, contextNode,
                createResolver(), ANY_UNORDERED_NODE_TYPE, null);

        return res.getSingleNodeValue();

    }

    @Override
    protected void finalize() {}
}
