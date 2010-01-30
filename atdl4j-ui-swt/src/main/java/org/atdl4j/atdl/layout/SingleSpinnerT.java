//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.07 at 02:37:55 AM JST 
//


package org.atdl4j.atdl.layout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleSpinner_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleSpinner_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/ATDL-1-1/Layout}Control_t">
 *       &lt;attribute name="initValue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="increment" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="incrementPolicy">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Tick"/>
 *             &lt;enumeration value="LotSize"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleSpinner_t")
public class SingleSpinnerT
    extends ControlT
{

    @XmlAttribute
    protected Double initValue;
    @XmlAttribute
    protected Double increment;
    @XmlAttribute
    protected String incrementPolicy;

    /**
     * Gets the value of the initValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitValue() {
        return initValue;
    }

    /**
     * Sets the value of the initValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitValue(Double value) {
        this.initValue = value;
    }

    /**
     * Gets the value of the increment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIncrement() {
        return increment;
    }

    /**
     * Sets the value of the increment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIncrement(Double value) {
        this.increment = value;
    }

    /**
     * Gets the value of the incrementPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementPolicy() {
        return incrementPolicy;
    }

    /**
     * Sets the value of the incrementPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementPolicy(String value) {
        this.incrementPolicy = value;
    }

}
