//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.07 at 09:56:03 AM KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dynAuthTokenSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dynAuthTokenSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenID" type="{http://www.onem2m.org/xml/protocols}tokenID"/>
 *         &lt;element name="notBefore" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="notAfter" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="tokenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audience" type="{http://www.onem2m.org/xml/protocols}listOfM2MID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dynAuthTokenSummary", propOrder = {
    "tokenID",
    "notBefore",
    "notAfter",
    "tokenName",
    "audience"
})
public class DynAuthTokenSummary {

    //@XmlElement(required = true)
    @XmlElement(name = Naming.TOKENID_SN, required = true)
    protected String tokenID;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.NOTBEFORE_SN, required = true)
    protected String notBefore;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.NOTAFTER_SN, required = true)
    protected String notAfter;
    @XmlElement(name = Naming.TOKENNAME_SN)
    protected String tokenName;
    @XmlList
    @XmlElement(name = Naming.AUDIENCE_SN)
    protected List<String> audience;

    /**
     * Gets the value of the tokenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenID() {
        return tokenID;
    }

    /**
     * Sets the value of the tokenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenID(String value) {
        this.tokenID = value;
    }

    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotBefore() {
        return notBefore;
    }

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotBefore(String value) {
        this.notBefore = value;
    }

    /**
     * Gets the value of the notAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAfter() {
        return notAfter;
    }

    /**
     * Sets the value of the notAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAfter(String value) {
        this.notAfter = value;
    }

    /**
     * Gets the value of the tokenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenName() {
        return tokenName;
    }

    /**
     * Sets the value of the tokenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenName(String value) {
        this.tokenName = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudience() {
      //  if (audience == null) {
      //      audience = new ArrayList<String>();
      //  }
        return this.audience;
    }
    
    public void addAudience(String value) {
    	if (audience == null) {
    		audience = new ArrayList<String>();
    	}
    	this.audience.add(value);
    }

}