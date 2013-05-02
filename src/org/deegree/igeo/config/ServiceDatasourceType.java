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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Root datasource for all service (OWS) based datasources. Concrete service datasources must extend this type. Common				
 * 				to all services is that URL to thir capabilities (e.g. complete GetCapabilities request) must be defined.
 * 			
 * 
 * <p>Java class for ServiceDatasourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDatasourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/coremapmodel}AbstractDatasourceType">
 *       &lt;sequence>
 *         &lt;element name="capabilitiesURL">
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
@XmlType(name = "ServiceDatasourceType", namespace = "http://www.deegree.org/coremapmodel", propOrder = {
    "capabilitiesURL"
})
@XmlSeeAlso({
    WMSDatasourceType.class,
    WFSDatasourceType.class,
    WCSDatasourceType.class
})
public class ServiceDatasourceType
    extends AbstractDatasourceType
{

    @XmlElement(namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected ServiceDatasourceType.CapabilitiesURL capabilitiesURL;

    /**
     * Gets the value of the capabilitiesURL property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDatasourceType.CapabilitiesURL }
     *     
     */
    public ServiceDatasourceType.CapabilitiesURL getCapabilitiesURL() {
        return capabilitiesURL;
    }

    /**
     * Sets the value of the capabilitiesURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDatasourceType.CapabilitiesURL }
     *     
     */
    public void setCapabilitiesURL(ServiceDatasourceType.CapabilitiesURL value) {
        this.capabilitiesURL = value;
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
    public static class CapabilitiesURL {

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