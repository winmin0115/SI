//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:13:54 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="applicableCredIDs" type="{http://www.onem2m.org/xml/protocols}listOfM2MID" minOccurs="0"/>
 *         &lt;element name="allowedApp-IDs" type="{http://www.onem2m.org/xml/protocols}listOfM2MID" minOccurs="0"/>
 *         &lt;element name="allowedAEs" type="{http://www.onem2m.org/xml/protocols}listOfM2MID" minOccurs="0"/>
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
    "applicableCredIDs",
    "allowedAppIDs",
    "allowedAEs",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "serviceSubscribedAppRule")
@XmlRootElement(name = Naming.SERVICESUBSCRIBEDAPPRULE_SN)
public class ServiceSubscribedAppRule
    extends RegularResource
{
	
//	public final static String SCHEMA_LOCATION = "CDT-serviceSubscribedAppRule-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-serviceSubscribedAppRule-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-serviceSubscribedAppRule-v2_7_0.xsd";

    @XmlElement(name = Naming.APPLICABLECREDIDS_SN)
    @XmlList
    protected List<String> applicableCredIDs;
    @XmlList
    //@XmlElement(name = "allowedApp-IDs")
    @XmlElement(name = Naming.ALLOWEDAPPIDS_SN)
    protected List<String> allowedAppIDs;
    @XmlList
    @XmlElement(name = Naming.ALLOWEDAES_SN)
    protected List<String> allowedAEs;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the applicableCredIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableCredIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableCredIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableCredIDs() {
//    	if (applicableCredIDs == null) {
//    		applicableCredIDs = new ArrayList<String>();
//        }
    	return this.applicableCredIDs;
    }
    
    public void addApplicableCredIDs(String id) {
    	if (applicableCredIDs == null) {
    		applicableCredIDs = new ArrayList<String>();
        }
    	this.applicableCredIDs.add(id);
    }

    /**
     * Gets the value of the allowedAppIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedAppIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedAppIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllowedAppIDs() {
//    	if (allowedAppIDs == null) {
//    		allowedAppIDs = new ArrayList<String>();
//        }
    	return this.allowedAppIDs;
    }

    public void addAllowedAppIDs(String id) {
    	if (allowedAppIDs == null) {
    		allowedAppIDs = new ArrayList<String>();
        }
    	this.allowedAppIDs.add(id);
    }
    
    /**
     * Gets the value of the allowedAEs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedAEs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedAEs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllowedAEs() {
//    	if (allowedAEs == null) {
//    		allowedAEs = new ArrayList<String>();
//    	}
    	return this.allowedAEs;
    }

    public void adAllowedAEs(String ae) {
    	if (allowedAEs == null) {
    		allowedAEs = new ArrayList<String>();
    	}
    	this.allowedAEs.add(ae);
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
//        }
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
//        }
    	return this.subscription;
    }

    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
        }
    	this.subscription.add(sub);
    }
    
}
