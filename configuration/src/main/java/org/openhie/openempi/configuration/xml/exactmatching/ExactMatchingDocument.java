/*
 * An XML document type.
 * Localname: exact-matching
 * Namespace: http://configuration.openempi.openhie.org/exact-matching
 * Java type: org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.exactmatching;


/**
 * A document containing one exact-matching(@http://configuration.openempi.openhie.org/exact-matching) element.
 *
 * This is a complex type.
 */
public interface ExactMatchingDocument extends org.openhie.openempi.configuration.xml.MatchingConfigurationDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExactMatchingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFA072E9AE4BE4D55B7C5CC50942AC27F").resolveHandle("exactmatching191fdoctype");
    
    /**
     * Gets the "exact-matching" element
     */
    org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingType getExactMatching();
    
    /**
     * Sets the "exact-matching" element
     */
    void setExactMatching(org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingType exactMatching);
    
    /**
     * Appends and returns a new empty "exact-matching" element
     */
    org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingType addNewExactMatching();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument newInstance() {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
