//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.15 at 01:47:13 PM CDT 
//


package org.openhie.openempi.configuration.xml.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column-index" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="field-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="subfields" type="{http://configuration.openempi.openhie.org/fileloadermap}SubFieldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="datatype" type="{http://configuration.openempi.openhie.org/fileloadermap}datatype" />
 *       &lt;attribute name="date-format-string" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delimeter" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="enclosing-character" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is-cluster-id" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="is-identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="is-ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="identifier-domain-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namespace-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="one-to-many" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="universal-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="universal-identifier-type-code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldType", propOrder = {
    "columnIndex",
    "fieldName",
    "subfields"
})
public class FieldType {

    @XmlElement(name = "column-index", required = true)
    protected BigInteger columnIndex;
    @XmlElement(name = "field-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fieldName;
    protected SubFieldsType subfields;
    @XmlAttribute(name = "datatype")
    protected Datatype datatype;
    @XmlAttribute(name = "date-format-string")
    protected String dateFormatString;
    @XmlAttribute(name = "delimeter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String delimeter;
    @XmlAttribute(name = "enclosing-character")
    protected String enclosingCharacter;
    @XmlAttribute(name = "is-cluster-id")
    protected Boolean isClusterId;
    @XmlAttribute(name = "is-identifier")
    protected Boolean isIdentifier;
    @XmlAttribute(name = "is-ignored")
    protected Boolean isIgnored;
    @XmlAttribute(name = "identifier-domain-name")
    protected String identifierDomainName;
    @XmlAttribute(name = "namespace-identifier")
    protected String namespaceIdentifier;
    @XmlAttribute(name = "one-to-many")
    protected Boolean oneToMany;
    @XmlAttribute(name = "universal-identifier")
    protected String universalIdentifier;
    @XmlAttribute(name = "universal-identifier-type-code")
    protected String universalIdentifierTypeCode;

    /**
     * Gets the value of the columnIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnIndex(BigInteger value) {
        this.columnIndex = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the subfields property.
     * 
     * @return
     *     possible object is
     *     {@link SubFieldsType }
     *     
     */
    public SubFieldsType getSubfields() {
        return subfields;
    }

    /**
     * Sets the value of the subfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubFieldsType }
     *     
     */
    public void setSubfields(SubFieldsType value) {
        this.subfields = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link Datatype }
     *     
     */
    public Datatype getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datatype }
     *     
     */
    public void setDatatype(Datatype value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the dateFormatString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormatString() {
        return dateFormatString;
    }

    /**
     * Sets the value of the dateFormatString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormatString(String value) {
        this.dateFormatString = value;
    }

    /**
     * Gets the value of the delimeter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimeter() {
        return delimeter;
    }

    /**
     * Sets the value of the delimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimeter(String value) {
        this.delimeter = value;
    }

    /**
     * Gets the value of the enclosingCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosingCharacter() {
        return enclosingCharacter;
    }

    /**
     * Sets the value of the enclosingCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosingCharacter(String value) {
        this.enclosingCharacter = value;
    }

    /**
     * Gets the value of the isClusterId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsClusterId() {
        if (isClusterId == null) {
            return false;
        } else {
            return isClusterId;
        }
    }

    /**
     * Sets the value of the isClusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClusterId(Boolean value) {
        this.isClusterId = value;
    }

    /**
     * Gets the value of the isIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIdentifier() {
        if (isIdentifier == null) {
            return false;
        } else {
            return isIdentifier;
        }
    }

    /**
     * Sets the value of the isIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIdentifier(Boolean value) {
        this.isIdentifier = value;
    }

    /**
     * Gets the value of the isIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIgnored() {
        if (isIgnored == null) {
            return false;
        } else {
            return isIgnored;
        }
    }

    /**
     * Sets the value of the isIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIgnored(Boolean value) {
        this.isIgnored = value;
    }

    /**
     * Gets the value of the identifierDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierDomainName() {
        return identifierDomainName;
    }

    /**
     * Sets the value of the identifierDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierDomainName(String value) {
        this.identifierDomainName = value;
    }

    /**
     * Gets the value of the namespaceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceIdentifier() {
        return namespaceIdentifier;
    }

    /**
     * Sets the value of the namespaceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceIdentifier(String value) {
        this.namespaceIdentifier = value;
    }

    /**
     * Gets the value of the oneToMany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOneToMany() {
        if (oneToMany == null) {
            return false;
        } else {
            return oneToMany;
        }
    }

    /**
     * Sets the value of the oneToMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneToMany(Boolean value) {
        this.oneToMany = value;
    }

    /**
     * Gets the value of the universalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalIdentifier() {
        return universalIdentifier;
    }

    /**
     * Sets the value of the universalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalIdentifier(String value) {
        this.universalIdentifier = value;
    }

    /**
     * Gets the value of the universalIdentifierTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalIdentifierTypeCode() {
        return universalIdentifierTypeCode;
    }

    /**
     * Sets the value of the universalIdentifierTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalIdentifierTypeCode(String value) {
        this.universalIdentifierTypeCode = value;
    }

}
