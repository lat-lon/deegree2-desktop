//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.15 at 10:29:06 AM MESZ 
//


package org.deegree.igeo.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractLinkedTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractLinkedTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.deegree.org/coremapmodel}RelationKey" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractLinkedTableType", namespace = "http://www.deegree.org/coremapmodel", propOrder = {
    "title",
    "description",
    "relationKey"
})
@XmlSeeAlso({
    LinkedDatabaseTableType.class,
    LinkedFileTableType.class
})
public abstract class AbstractLinkedTableType {

    @XmlElement(namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected String title;
    @XmlElement(namespace = "http://www.deegree.org/coremapmodel")
    protected String description;
    @XmlElement(name = "RelationKey", namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected List<RelationKeyType> relationKey;
    @XmlAttribute
    protected Boolean editable;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the relationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationKeyType }
     * 
     * 
     */
    public List<RelationKeyType> getRelationKey() {
        if (relationKey == null) {
            relationKey = new ArrayList<RelationKeyType>();
        }
        return this.relationKey;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEditable() {
        if (editable == null) {
            return false;
        } else {
            return editable;
        }
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

}
