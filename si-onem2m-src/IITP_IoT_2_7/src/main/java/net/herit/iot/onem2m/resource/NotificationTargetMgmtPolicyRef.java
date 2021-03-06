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

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


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
 *         &lt;element name="notificationTargetURI" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="notificationlPolicyID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
    "notificationTargetURI",
    "notificationlPolicyID",
    "childResource",
    "subscription"
})
public class NotificationTargetMgmtPolicyRef
    extends RegularResource
{

	public final static String SCHEMA_LOCATION = "CDT-notificationTargetMgmtPolicyRef-v2_7_0.xsd";
	
    @XmlList
    @XmlElement(name = Naming.NOTIFICATIONTARGETURI_SN)
    protected List<String> notificationTargetURI;
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = Naming.NOTIFICATIONPOLICYID_SN)
    protected String notificationlPolicyID;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElement(name = Naming.SUBSCRIPTION_SN , namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the notificationTargetURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationTargetURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationTargetURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotificationTargetURI() {
      //  if (notificationTargetURI == null) {
      //      notificationTargetURI = new ArrayList<String>();
      //  }
        return this.notificationTargetURI;
    }
    
    public void addNotificationTargetURI(String value) {
        if (notificationTargetURI == null) {
        	notificationTargetURI = new ArrayList<String>();
         }
        notificationTargetURI.add(value);
      }

    /**
     * Gets the value of the notificationlPolicyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationlPolicyID() {
        return notificationlPolicyID;
    }

    /**
     * Sets the value of the notificationlPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationlPolicyID(String value) {
        this.notificationlPolicyID = value;
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
     //   if (childResource == null) {
     //       childResource = new ArrayList<ChildResourceRef>();
     //   }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef childRef) {
        if (childResource == null) {
            childResource = new ArrayList<ChildResourceRef>();
         }
        childResource.add(childRef);
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
     //   if (subscription == null) {
     //       subscription = new ArrayList<Subscription>();
     //   }
        return this.subscription;
    }
    
    public void addSubscription(Subscription value) {
        if (subscription == null) {
        	subscription = new ArrayList<Subscription>();
         }
        subscription.add(value);
      }
    
    // added in CDT-2.7.0
    @Override
	public void validate(OPERATION operation) throws OneM2MException {
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
		
			if (this.notificationTargetURI == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "notificationTargetURI is M on CREATE");				
			}

		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크
			
		}
		
		super.validate(operation);
		
	}
}
