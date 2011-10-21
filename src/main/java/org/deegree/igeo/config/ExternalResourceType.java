//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.15 at 10:29:06 AM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.deegree.org/coremapmodel}OnlineResource"/>
 *         &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalResourceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalResourceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalResourceType", namespace = "http://www.deegree.org/coremapmodel", propOrder = {
    "onlineResource",
    "_abstract",
    "externalResourceTitle",
    "externalResourceType"
})
public class ExternalResourceType {

    @XmlElement(name = "OnlineResource", namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected OnlineResourceType onlineResource;
    @XmlElement(name = "abstract", namespace = "http://www.deegree.org/coremapmodel")
    protected String _abstract;
    @XmlElement(namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected String externalResourceTitle;
    @XmlElement(namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected String externalResourceType;

    /**
     * Gets the value of the onlineResource property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResourceType }
     *     
     */
    public OnlineResourceType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Sets the value of the onlineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResourceType }
     *     
     */
    public void setOnlineResource(OnlineResourceType value) {
        this.onlineResource = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the externalResourceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalResourceTitle() {
        return externalResourceTitle;
    }

    /**
     * Sets the value of the externalResourceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalResourceTitle(String value) {
        this.externalResourceTitle = value;
    }

    /**
     * Gets the value of the externalResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalResourceType() {
        return externalResourceType;
    }

    /**
     * Sets the value of the externalResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalResourceType(String value) {
        this.externalResourceType = value;
    }

}
