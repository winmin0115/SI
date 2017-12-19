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
 * <p>Java class for receiverESPrimRandObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiverESPrimRandObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esprimRandID" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="esprimRandValue" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="esprimRandExpiry" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp"/>
 *         &lt;element name="esprimKeyGenAlgIDs">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}esprimKeyGenAlgID" />
 *               &lt;/simpleType>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="esprimProtocolAndAlgIDs">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}esprimProtocolAndAlgID" />
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
@XmlType(name = "receiverESPrimRandObject", propOrder = {
    "esprimRandID",
    "esprimRandValue",
    "esprimRandExpiry",
    "esprimKeyGenAlgIDs",
    "esprimProtocolAndAlgIDs"
})
public class ReceiverESPrimRandObject {

    //@XmlElement(required = true)
    @XmlElement(name = Naming.ESPRIMRANDID_SN, required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String esprimRandID;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.ESPRIMRANDVALUE_SN, required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String esprimRandValue;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.ESPRIMRANDEXPIRY_SN, required = true)
    protected String esprimRandExpiry;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.ESPRIMKEYGENALGIDS_SN, required = true)
    protected List<Integer> esprimKeyGenAlgIDs;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.ESPRIMPROTOCOLANDALGIDS_SN, required = true)
    protected List<Integer> esprimProtocolAndAlgIDs;

    /**
     * Gets the value of the esprimRandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsprimRandID() {
        return esprimRandID;
    }

    /**
     * Sets the value of the esprimRandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsprimRandID(String value) {
        this.esprimRandID = value;
    }

    /**
     * Gets the value of the esprimRandValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsprimRandValue() {
        return esprimRandValue;
    }

    /**
     * Sets the value of the esprimRandValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsprimRandValue(String value) {
        this.esprimRandValue = value;
    }

    /**
     * Gets the value of the esprimRandExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsprimRandExpiry() {
        return esprimRandExpiry;
    }

    /**
     * Sets the value of the esprimRandExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsprimRandExpiry(String value) {
        this.esprimRandExpiry = value;
    }

    /**
     * Gets the value of the esprimKeyGenAlgIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esprimKeyGenAlgIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsprimKeyGenAlgIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEsprimKeyGenAlgIDs() {
     //   if (esprimKeyGenAlgIDs == null) {
     //       esprimKeyGenAlgIDs = new ArrayList<Integer>();
     //   }
        return this.esprimKeyGenAlgIDs;
    }
    
    public void addEsprimKeyGenAlgIDs(Integer value) {
    	if (esprimKeyGenAlgIDs == null) {
    		esprimKeyGenAlgIDs = new ArrayList<Integer>();
    	}
    	this.esprimKeyGenAlgIDs.add(value);
    }

    /**
     * Gets the value of the esprimProtocolAndAlgIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esprimProtocolAndAlgIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsprimProtocolAndAlgIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEsprimProtocolAndAlgIDs() {
      //  if (esprimProtocolAndAlgIDs == null) {
      //      esprimProtocolAndAlgIDs = new ArrayList<Integer>();
      //  }
        return this.esprimProtocolAndAlgIDs;
    }
    
    public void addEsprimProtocolAndAlgIDs(Integer value) {
    	if (esprimProtocolAndAlgIDs == null) {
    		esprimProtocolAndAlgIDs = new ArrayList<Integer>();
    	}
    	this.esprimProtocolAndAlgIDs.add(value);
    }

}
