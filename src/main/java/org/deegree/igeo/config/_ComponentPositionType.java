//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.15 at 10:29:06 AM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				For each layout defined for a container an according _ComponentPosition is defined for embedded modules. E.g.
 * 				if a container uses a GridLayout embedded modules uses GridPosition as concretisation of _ComponentPosition
 * 				to define in which grid cell each module is located.
 * 			
 * 
 * <p>Java class for _ComponentPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ComponentPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ComponentPositionType")
@XmlSeeAlso({
    BorderPositionType.class,
    GridPositionType.class,
    HeaderPositionType.class,
    SplitterPositionType.class,
    AbsolutePositionType.class,
    FooterPositionType.class,
    TabPositionType.class
})
public abstract class _ComponentPositionType {


}
