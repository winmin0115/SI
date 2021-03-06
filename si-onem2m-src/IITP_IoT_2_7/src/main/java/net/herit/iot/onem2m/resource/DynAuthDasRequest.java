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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for dynAuthDasRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dynAuthDasRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="targetedResourceType" type="{http://www.onem2m.org/xml/protocols}resourceType"/>
 *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation"/>
 *         &lt;element name="originatorIP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ipv4Address" type="{http://www.onem2m.org/xml/protocols}ipv4" minOccurs="0"/>
 *                   &lt;element name="ipv6Address" type="{http://www.onem2m.org/xml/protocols}ipv6" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="originatorLocation" type="{http://www.onem2m.org/xml/protocols}locationRegion" minOccurs="0"/>
 *         &lt;element name="originatorRoleIDs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}roleID" />
 *               &lt;/simpleType>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="requestTimestamp" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
 *         &lt;element name="targetedResourceID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="proposedPrivilegesLifetime" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
 *         &lt;element name="roleIDsFromACPs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}roleID" />
 *               &lt;/simpleType>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tokenIDs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}tokenID" />
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
@XmlType(name = "dynAuthDasRequest", propOrder = {
    "originator",
    "targetedResourceType",
    "operation",
    "originatorIP",
    "originatorLocation",
    "originatorRoleIDs",
    "requestTimestamp",
    "targetedResourceID",
    "proposedPrivilegesLifetime",
    "roleIDsFromACPs",
    "tokenIDs"
})
public class DynAuthDasRequest {

    //@XmlElement(required = true)
    @XmlElement(name = Naming.ORIGINATOR_SN, required = true)
    protected String originator;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.TARGETEDRESOURCETYPE_SN, required = true)
    protected Integer targetedResourceType;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.OPERATION_SN, required = true)
    protected Integer operation;
    @XmlElement(name = Naming.ORIGINATORIP_SN)
    protected DynAuthDasRequest.OriginatorIP originatorIP;
    @XmlElement(name = Naming.ORIGINATORLOCATION_SN)
    protected LocationRegion originatorLocation;
    @XmlList
    @XmlElement(name = Naming.ORIGINATORROLEIDS_SN)
    protected List<String> originatorRoleIDs;
    @XmlElement(name = Naming.REQUESTTIMESTAMP_SN)
    protected String requestTimestamp;
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = Naming.TARGETEDRESOURCEID_SN)
    protected String targetedResourceID;
    @XmlElement(name = Naming.PROPOSEDPRIVILEGESLIFETIME_SN)
    protected String proposedPrivilegesLifetime;
    @XmlList
    @XmlElement(name = Naming.ROLEIDSFROMACPS_SN)
    protected List<String> roleIDsFromACPs;
    @XmlList
    @XmlElement(name = Naming.TOKENIDS_SN)
    protected List<String> tokenIDs;

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the targetedResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetedResourceType() {
        return targetedResourceType;
    }

    /**
     * Sets the value of the targetedResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetedResourceType(Integer value) {
        this.targetedResourceType = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperation(Integer value) {
        this.operation = value;
    }

    /**
     * Gets the value of the originatorIP property.
     * 
     * @return
     *     possible object is
     *     {@link DynAuthDasRequest.OriginatorIP }
     *     
     */
    public DynAuthDasRequest.OriginatorIP getOriginatorIP() {
        return originatorIP;
    }

    /**
     * Sets the value of the originatorIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynAuthDasRequest.OriginatorIP }
     *     
     */
    public void setOriginatorIP(DynAuthDasRequest.OriginatorIP value) {
        this.originatorIP = value;
    }

    /**
     * Gets the value of the originatorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationRegion }
     *     
     */
    public LocationRegion getOriginatorLocation() {
        return originatorLocation;
    }

    /**
     * Sets the value of the originatorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRegion }
     *     
     */
    public void setOriginatorLocation(LocationRegion value) {
        this.originatorLocation = value;
    }

    /**
     * Gets the value of the originatorRoleIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originatorRoleIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginatorRoleIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOriginatorRoleIDs() {
      //  if (originatorRoleIDs == null) {
      //      originatorRoleIDs = new ArrayList<String>();
      //  }
        return this.originatorRoleIDs;
    }
    
    public void addOriginatorRoleIDs(String value) {
    	if (originatorRoleIDs == null) {
    		originatorRoleIDs = new ArrayList<String>();
    	}
    	this.originatorRoleIDs.add(value);
    }

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimestamp(String value) {
        this.requestTimestamp = value;
    }

    /**
     * Gets the value of the targetedResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetedResourceID() {
        return targetedResourceID;
    }

    /**
     * Sets the value of the targetedResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetedResourceID(String value) {
        this.targetedResourceID = value;
    }

    /**
     * Gets the value of the proposedPrivilegesLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposedPrivilegesLifetime() {
        return proposedPrivilegesLifetime;
    }

    /**
     * Sets the value of the proposedPrivilegesLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposedPrivilegesLifetime(String value) {
        this.proposedPrivilegesLifetime = value;
    }

    /**
     * Gets the value of the roleIDsFromACPs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleIDsFromACPs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleIDsFromACPs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleIDsFromACPs() {
     //   if (roleIDsFromACPs == null) {
     //       roleIDsFromACPs = new ArrayList<String>();
     //   }
        return this.roleIDsFromACPs;
    }
    
    public void addRoleIDsFromACPs(String value) {
    	if (roleIDsFromACPs == null) {
    		roleIDsFromACPs = new ArrayList<String>();
    	}
    	this.roleIDsFromACPs.add(value);
    }

    /**
     * Gets the value of the tokenIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokenIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokenIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTokenIDs() {
      //  if (tokenIDs == null) {
      //      tokenIDs = new ArrayList<String>();
      //  }
        return this.tokenIDs;
    }
    
    public void addTokenIDs(String value) {
    	if (tokenIDs == null) {
    		tokenIDs = new ArrayList<String>();
    	}
    	this.tokenIDs.add(value);
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
     *         &lt;element name="ipv4Address" type="{http://www.onem2m.org/xml/protocols}ipv4" minOccurs="0"/>
     *         &lt;element name="ipv6Address" type="{http://www.onem2m.org/xml/protocols}ipv6" minOccurs="0"/>
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
        "ipv4Address",
        "ipv6Address"
    })
    public static class OriginatorIP {

        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlElement(name = Naming.IP4ADDRESS_SN)
        protected String ipv4Address;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlElement(name = Naming.IP6ADDRESS_SN)
        protected String ipv6Address;

        /**
         * Gets the value of the ipv4Address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpv4Address() {
            return ipv4Address;
        }

        /**
         * Sets the value of the ipv4Address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpv4Address(String value) {
            this.ipv4Address = value;
        }

        /**
         * Gets the value of the ipv6Address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpv6Address() {
            return ipv6Address;
        }

        /**
         * Sets the value of the ipv6Address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpv6Address(String value) {
            this.ipv6Address = value;
        }

    }

}
