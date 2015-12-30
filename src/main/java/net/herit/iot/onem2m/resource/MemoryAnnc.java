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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedMgmtResource">
 *       &lt;sequence>
 *         &lt;element name="memAvailable" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="memTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memAvailable",
    "memTotal",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "memoryAnnc")
@XmlRootElement(name = "memA")
public class MemoryAnnc
    extends AnnouncedMgmtResource
{
	public final static String SCHEMA_LOCATION = "CDT-memory-v1_2_0.xsd";

    @XmlElement(name = "mma")
    @XmlSchemaType(name = "unsignedLong")
    protected Integer memAvailable;
    @XmlElement(name = "mmt")
    @XmlSchemaType(name = "unsignedLong")
    protected Integer memTotal;
    @XmlElement(name = "ch")
    protected List<ChildResourceRef> childResource;
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    @XmlElement(name = "sub", namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;
    
    
    /**
     * Gets the value of the memAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemAvailable() {
        return memAvailable;
    }

    /**
     * Sets the value of the memAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemAvailable(Integer value) {
        this.memAvailable = value;
    }

    /**
     * Gets the value of the memTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemTotal() {
        return memTotal;
    }

    /**
     * Sets the value of the memTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemTotal(Integer value) {
        this.memTotal = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
//    	if (childResource == null) {
//    		childResource = new ArrayList<ChildResourceRef>();
//    	}
    	return this.childResource;
    }

    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(ch);
    }

    
    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
//    	if (subscription == null) {
//    		subscription = new ArrayList<Subscription>();
//    	}
    	return this.subscription;
    }

    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
    	}
    	this.subscription.add(sub);
    }
    
}
