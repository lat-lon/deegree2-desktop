//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.14 at 02:46:42 PM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.deegree.org/coremapmodel}identifier"/>
 *         &lt;element name="View" type="{http://www.deegree.org/project}ViewType"/>
 *         &lt;element name="Settings" type="{http://www.deegree.org/settings}SettingsType"/>
 *         &lt;element ref="{http://www.deegree.org/coremapmodel}MapModelCollection"/>
 *       &lt;/sequence>
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "identifier",
    "view",
    "settings",
    "mapModelCollection"
})
@XmlRootElement(name = "Project")
public class Project {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected IdentifierType identifier;
    @XmlElement(name = "View", required = true)
    protected ViewType view;
    @XmlElement(name = "Settings", required = true)
    protected SettingsType settings;
    @XmlElement(name = "MapModelCollection", namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected MapModelCollectionType mapModelCollection;
    @XmlAttribute
    protected String language;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIdentifier(IdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link ViewType }
     *     
     */
    public ViewType getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewType }
     *     
     */
    public void setView(ViewType value) {
        this.view = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link SettingsType }
     *     
     */
    public SettingsType getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettingsType }
     *     
     */
    public void setSettings(SettingsType value) {
        this.settings = value;
    }

    /**
     * Gets the value of the mapModelCollection property.
     * 
     * @return
     *     possible object is
     *     {@link MapModelCollectionType }
     *     
     */
    public MapModelCollectionType getMapModelCollection() {
        return mapModelCollection;
    }

    /**
     * Sets the value of the mapModelCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapModelCollectionType }
     *     
     */
    public void setMapModelCollection(MapModelCollectionType value) {
        this.mapModelCollection = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}