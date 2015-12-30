//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:16 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventNotificationCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventNotificationCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdBefore" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="createdAfter" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="modifiedSince" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="unmodifiedSince" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="stateTagSmaller" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="stateTagBigger" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="expireBefore" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="expireAfter" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="sizeAbove" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="sizeBelow" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="operationMonitor" type="{http://www.onem2m.org/xml/protocols}operation" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.onem2m.org/xml/protocols}attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notificationEventType" type="{http://www.onem2m.org/xml/protocols}notificationEventType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventNotificationCriteria", propOrder = {
    "createdBefore",
    "createdAfter",
    "modifiedSince",
    "unmodifiedSince",
    "stateTagSmaller",
    "stateTagBigger",
    "expireBefore",
    "expireAfter",
    "sizeAbove",
    "sizeBelow",
    "operationMonitor",
    "attribute",
    "notificationEventType"
})
public class EventNotificationCriteria {

	@XmlElement(name = "crb")
    protected String createdBefore;
	@XmlElement(name = "cra")
    protected String createdAfter;
	@XmlElement(name = "ms")
    protected String modifiedSince;
	@XmlElement(name = "us")
    protected String unmodifiedSince;
    @XmlSchemaType(name = "positiveInteger")
    @XmlElement(name = "sts")
    protected Integer stateTagSmaller;
    @XmlSchemaType(name = "nonNegativeInteger")
    @XmlElement(name = "stb")
    protected Integer stateTagBigger;
    @XmlElement(name = "exb")
    protected String expireBefore;
    @XmlElement(name = "exa")
    protected String expireAfter;
    @XmlSchemaType(name = "nonNegativeInteger")
    @XmlElement(name = "sza")
    protected Integer sizeAbove;
    @XmlSchemaType(name = "positiveInteger")
    @XmlElement(name = "szb")
    protected Integer sizeBelow;
    @XmlElement(name = "om")
    protected List<Integer> operationMonitor;
    @XmlElement(name = "atr")
    protected List<Attribute> attribute;
    //@XmlElement(name = "net") // resourceStatus(rss)-1.0 --> notificationEventType(net)-1.2
    @XmlElements({
    	@XmlElement(name = "rss"),	// v1.0.1
    	@XmlElement(name = "net")	// v1.2.1
     })
    protected List<Integer> notificationEventType;

    private static final String NL = "\r\n";
    public String toString() {
    	StringBuilder sbld = new StringBuilder();
    	
    	sbld.append("[EventNotificationCriteria]").append(NL);
    	sbld.append("createdBefore:").append(createdBefore).append(NL);
    	sbld.append("createdAfter:").append(createdAfter).append(NL);
    	sbld.append("modifiedSince:").append(modifiedSince).append(NL);
    	sbld.append("unmodifiedSince:").append(unmodifiedSince).append(NL);
    	sbld.append("stateTagSmaller:").append(stateTagSmaller).append(NL);
    	sbld.append("stateTagBigger:").append(stateTagBigger).append(NL);
    	sbld.append("expireBefore:").append(expireBefore).append(NL);
    	sbld.append("expireAfter:").append(expireAfter).append(NL);
    	sbld.append("sizeAbove:").append(sizeAbove).append(NL);
    	sbld.append("sizeBelow").append(sizeBelow).append(NL);
    	sbld.append("operationMonitor:").append(operationMonitor).append(NL);
//    	boolean flag = false;
    	
//    	for (int i : getOperationMonitor()) {
//    		if(flag) sbld.append(",");
//    		else flag = true;
//    		sbld.append(i);
//    	}
    	sbld.append("attribute:").append(attribute).append(NL);
//    	for (Attribute attr : getAttribute()) {
//    		sbld.append(" [").append(attr.toString()).append("]  ");
//    	}
//    	sbld.append(NL);
    	
    	return sbld.toString();
    }
    
    /**
     * Gets the value of the createdBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBefore() {
        return createdBefore;
    }

    /**
     * Sets the value of the createdBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBefore(String value) {
        this.createdBefore = value;
    }

    /**
     * Gets the value of the createdAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAfter() {
        return createdAfter;
    }

    /**
     * Sets the value of the createdAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAfter(String value) {
        this.createdAfter = value;
    }

    /**
     * Gets the value of the modifiedSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the value of the modifiedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedSince(String value) {
        this.modifiedSince = value;
    }

    /**
     * Gets the value of the unmodifiedSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmodifiedSince() {
        return unmodifiedSince;
    }

    /**
     * Sets the value of the unmodifiedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmodifiedSince(String value) {
        this.unmodifiedSince = value;
    }

    /**
     * Gets the value of the stateTagSmaller property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateTagSmaller() {
        return stateTagSmaller;
    }

    /**
     * Sets the value of the stateTagSmaller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateTagSmaller(Integer value) {
        this.stateTagSmaller = value;
    }

    /**
     * Gets the value of the stateTagBigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateTagBigger() {
        return stateTagBigger;
    }

    /**
     * Sets the value of the stateTagBigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateTagBigger(Integer value) {
        this.stateTagBigger = value;
    }

    /**
     * Gets the value of the expireBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireBefore() {
        return expireBefore;
    }

    /**
     * Sets the value of the expireBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireBefore(String value) {
        this.expireBefore = value;
    }

    /**
     * Gets the value of the expireAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireAfter() {
        return expireAfter;
    }

    /**
     * Sets the value of the expireAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireAfter(String value) {
        this.expireAfter = value;
    }

    /**
     * Gets the value of the sizeAbove property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSizeAbove() {
        return sizeAbove;
    }

    /**
     * Sets the value of the sizeAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSizeAbove(Integer value) {
        this.sizeAbove = value;
    }

    /**
     * Gets the value of the sizeBelow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSizeBelow() {
        return sizeBelow;
    }

    /**
     * Sets the value of the sizeBelow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSizeBelow(Integer value) {
        this.sizeBelow = value;
    }

    /**
     * Gets the value of the operationMonitor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationMonitor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationMonitor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOperationMonitor() {
//    	if (operationMonitor == null) {
//    		operationMonitor = new ArrayList<Integer>();
//    	}
    	return this.operationMonitor;
    }
    
    public void addOperationMonitor(Integer opm) {
    	if (operationMonitor == null) {
    		operationMonitor = new ArrayList<Integer>();
    	}
    	this.operationMonitor.add(opm);
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttribute() {
//    	if (attribute == null) {
//    		attribute = new ArrayList<Attribute>();
//    	}
    	return this.attribute;
    }

    public void addAttribute(Attribute attr) {
    	if (attribute == null) {
    		attribute = new ArrayList<Attribute>();
    	}
    	this.attribute.add(attr);
    }
    
    /**
     * Gets the value of the notificationEventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationEventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getNotificationEventType() {
//    	if (notificationEventType == null) {
//    		notificationEventType = new ArrayList<Integer>();
//    	}
    	return this.notificationEventType;
    }
    
    public void addNotificationEventType(Integer noti) {
    	if (notificationEventType == null) {
    		notificationEventType = new ArrayList<Integer>();
    	}
    	this.notificationEventType.add(noti);
    }
    
}
