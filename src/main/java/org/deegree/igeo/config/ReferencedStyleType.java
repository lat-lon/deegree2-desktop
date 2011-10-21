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
 * 
 * 			A 	ReferencedStyle is much like a DirectStyle except that a SLD document is not included but referenced. (not supported at the moment)
 * 			
 * 
 * <p>Java class for ReferencedStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/coremapmodel}DefinedStyleType">
 *       &lt;sequence>
 *         &lt;element name="linkage">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.deegree.org/coremapmodel}OnlineResource"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedStyleType", namespace = "http://www.deegree.org/coremapmodel", propOrder = {
    "linkage"
})
public class ReferencedStyleType
    extends DefinedStyleType
{

    @XmlElement(namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected ReferencedStyleType.Linkage linkage;

    /**
     * Gets the value of the linkage property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedStyleType.Linkage }
     *     
     */
    public ReferencedStyleType.Linkage getLinkage() {
        return linkage;
    }

    /**
     * Sets the value of the linkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedStyleType.Linkage }
     *     
     */
    public void setLinkage(ReferencedStyleType.Linkage value) {
        this.linkage = value;
    }


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
     *         &lt;element ref="{http://www.deegree.org/coremapmodel}OnlineResource"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onlineResource"
    })
    public static class Linkage {

        @XmlElement(name = "OnlineResource", namespace = "http://www.deegree.org/coremapmodel", required = true)
        protected OnlineResourceType onlineResource;

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

    }

}
