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
 * <p>Java class for dynAuthDasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dynAuthDasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dynamicACPInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grantedPrivileges" type="{http://www.onem2m.org/xml/protocols}setOfAcrs" minOccurs="0"/>
 *                   &lt;element name="privilegesLifetime" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tokens" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}dynAuthJWT" />
 *               &lt;/simpleType>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "dynAuthDasResponse", propOrder = {
    "dynamicACPInfo",
    "tokens"
})
public class DynAuthDasResponse {

	@XmlElement(name = Naming.DYNAMICACPINFO_SN)
    protected DynAuthDasResponse.DynamicACPInfo dynamicACPInfo;
    @XmlList
    @XmlElement(name = Naming.TOKENS_SN)
    protected List<String> tokens;

    /**
     * Gets the value of the dynamicACPInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DynAuthDasResponse.DynamicACPInfo }
     *     
     */
    public DynAuthDasResponse.DynamicACPInfo getDynamicACPInfo() {
        return dynamicACPInfo;
    }

    /**
     * Sets the value of the dynamicACPInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynAuthDasResponse.DynamicACPInfo }
     *     
     */
    public void setDynamicACPInfo(DynAuthDasResponse.DynamicACPInfo value) {
        this.dynamicACPInfo = value;
    }

    /**
     * Gets the value of the tokens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTokens() {
      //  if (tokens == null) {
      //      tokens = new ArrayList<String>();
      //  }
        return this.tokens;
    }

    public void addTokens(String value) {
    	if (tokens == null) {
    		tokens = new ArrayList<String>();
    	}
    	this.tokens.add(value);
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
     *         &lt;element name="grantedPrivileges" type="{http://www.onem2m.org/xml/protocols}setOfAcrs" minOccurs="0"/>
     *         &lt;element name="privilegesLifetime" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
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
        "grantedPrivileges",
        "privilegesLifetime"
    })
    public static class DynamicACPInfo {

    	@XmlElement(name = Naming.GRANTEDPRIVILEGES_SN)
        protected SetOfAcrs grantedPrivileges;
    	@XmlElement(name = Naming.PROPOSEDPRIVILEGESLIFETIME_SN)
        protected String privilegesLifetime;

        /**
         * Gets the value of the grantedPrivileges property.
         * 
         * @return
         *     possible object is
         *     {@link SetOfAcrs }
         *     
         */
        public SetOfAcrs getGrantedPrivileges() {
            return grantedPrivileges;
        }

        /**
         * Sets the value of the grantedPrivileges property.
         * 
         * @param value
         *     allowed object is
         *     {@link SetOfAcrs }
         *     
         */
        public void setGrantedPrivileges(SetOfAcrs value) {
            this.grantedPrivileges = value;
        }

        /**
         * Gets the value of the privilegesLifetime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrivilegesLifetime() {
            return privilegesLifetime;
        }

        /**
         * Sets the value of the privilegesLifetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivilegesLifetime(String value) {
            this.privilegesLifetime = value;
        }

    }

}
