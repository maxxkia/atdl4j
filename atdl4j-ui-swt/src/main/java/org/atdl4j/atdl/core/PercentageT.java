//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.07 at 02:37:55 AM JST 
//


package org.atdl4j.atdl.core;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Percentage_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Percentage_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/ATDL-1-1/Core}Numeric_t">
 *       &lt;attribute name="minValue" type="{http://www.fixprotocol.org/ATDL-1-1/Core}Percentage" default="0" />
 *       &lt;attribute name="maxValue" type="{http://www.fixprotocol.org/ATDL-1-1/Core}Percentage" />
 *       &lt;attribute name="multiplyBy100" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="constValue" type="{http://www.fixprotocol.org/ATDL-1-1/Core}Percentage" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Percentage_t")
public class PercentageT
    extends NumericT
{

    @XmlAttribute
    protected BigDecimal minValue;
    @XmlAttribute
    protected BigDecimal maxValue;
    @XmlAttribute
    protected Boolean multiplyBy100;
    @XmlAttribute
    protected BigDecimal constValue;

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValue() {
        if (minValue == null) {
            return new BigDecimal("0");
        } else {
            return minValue;
        }
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the multiplyBy100 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiplyBy100() {
        if (multiplyBy100 == null) {
            return false;
        } else {
            return multiplyBy100;
        }
    }

    /**
     * Sets the value of the multiplyBy100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiplyBy100(Boolean value) {
        this.multiplyBy100 = value;
    }

    /**
     * Gets the value of the constValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConstValue() {
        return constValue;
    }

    /**
     * Sets the value of the constValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConstValue(BigDecimal value) {
        this.constValue = value;
    }

}
