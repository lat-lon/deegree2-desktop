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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				general service adapter settings. 
 * 				- Classes for evaluating/parsing service capabilities of a specific version can be set
 * 				- timeout (milli seconds) to be used for accessing a service
 * 			
 * 
 * <p>Java class for ServiceAdapterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAdapterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapabilitiesEvaluator" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1.1.0" />
 *                 &lt;attribute name="val" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Timeout">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="val" type="{http://www.w3.org/2001/XMLSchema}int" default="10000" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAdapterType", namespace = "http://www.deegree.org/settings", propOrder = {
    "capabilitiesEvaluator",
    "timeout"
})
@XmlSeeAlso({
    WFSFeatureAdapterType.class,
    WMSGridCoverageAdapterType.class
})
public class ServiceAdapterType {

    @XmlElement(name = "CapabilitiesEvaluator", namespace = "http://www.deegree.org/settings", required = true, nillable = true)
    protected List<ServiceAdapterType.CapabilitiesEvaluator> capabilitiesEvaluator;
    @XmlElement(name = "Timeout", namespace = "http://www.deegree.org/settings", required = true, nillable = true)
    protected ServiceAdapterType.Timeout timeout;

    /**
     * Gets the value of the capabilitiesEvaluator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capabilitiesEvaluator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapabilitiesEvaluator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAdapterType.CapabilitiesEvaluator }
     * 
     * 
     */
    public List<ServiceAdapterType.CapabilitiesEvaluator> getCapabilitiesEvaluator() {
        if (capabilitiesEvaluator == null) {
            capabilitiesEvaluator = new ArrayList<ServiceAdapterType.CapabilitiesEvaluator>();
        }
        return this.capabilitiesEvaluator;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAdapterType.Timeout }
     *     
     */
    public ServiceAdapterType.Timeout getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAdapterType.Timeout }
     *     
     */
    public void setTimeout(ServiceAdapterType.Timeout value) {
        this.timeout = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1.1.0" />
     *       &lt;attribute name="val" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CapabilitiesEvaluator {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected String version;
        @XmlAttribute(required = true)
        protected String val;
        @XmlAttribute
        protected Boolean changeable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            if (version == null) {
                return "1.1.0";
            } else {
                return version;
            }
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVal(String value) {
            this.val = value;
        }

        /**
         * Gets the value of the changeable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isChangeable() {
            if (changeable == null) {
                return false;
            } else {
                return changeable;
            }
        }

        /**
         * Sets the value of the changeable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeable(Boolean value) {
            this.changeable = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="val" type="{http://www.w3.org/2001/XMLSchema}int" default="10000" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Timeout {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected Boolean changeable;
        @XmlAttribute
        protected Integer val;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changeable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isChangeable() {
            if (changeable == null) {
                return false;
            } else {
                return changeable;
            }
        }

        /**
         * Sets the value of the changeable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeable(Boolean value) {
            this.changeable = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getVal() {
            if (val == null) {
                return  30000;
            } else {
                return val;
            }
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setVal(Integer value) {
            this.val = value;
        }

    }

}
