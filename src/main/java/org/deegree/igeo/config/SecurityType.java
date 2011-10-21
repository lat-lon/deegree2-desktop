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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				If an application is used as part of a SDI a user may must authenticate hisself before he is allowed to access
 * 				some resources. The way how authentication must be performed is defined by this element
 * 			
 * 
 * <p>Java class for SecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/settings}_ChangeableType">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://www.deegree.org/settings}AuthenticationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityType", namespace = "http://www.deegree.org/settings", propOrder = {
    "authentication"
})
public class SecurityType
    extends _ChangeableType
{

    @XmlElement(name = "Authentication", namespace = "http://www.deegree.org/settings", required = true)
    protected List<AuthenticationType> authentication;

    /**
     * Gets the value of the authentication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authentication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthentication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationType }
     * 
     * 
     */
    public List<AuthenticationType> getAuthentication() {
        if (authentication == null) {
            authentication = new ArrayList<AuthenticationType>();
        }
        return this.authentication;
    }

}
