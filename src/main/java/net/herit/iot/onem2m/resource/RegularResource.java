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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;
import net.herit.iot.onem2m.core.util.Utils;


/**
 * <p>Java class for regularResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regularResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}resource">
 *       &lt;sequence>
 *         &lt;element name="accessControlPolicyIDs" type="{http://www.onem2m.org/xml/protocols}acpType" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regularResource", propOrder = {
    "accessControlPolicyIDs",
    "expirationTime"
})
@XmlSeeAlso({
    Subscription.class,
    AnnounceableResource.class
})
public class RegularResource
    extends Resource
{

    @XmlList
    @XmlElement(name = Naming.ACCESSCONTROLPOLICYIDS_SN)
    protected List<String> accessControlPolicyIDs;
    //@XmlElement(name = "et", required = true)
    @XmlElement(name = Naming.EXPIRATIONTIME_SN)
    protected String expirationTime;

    /**
     * Gets the value of the accessControlPolicyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessControlPolicyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessControlPolicyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessControlPolicyIDs() {
//    	if (accessControlPolicyIDs == null) {
//    		accessControlPolicyIDs = new ArrayList<String>();
//    	}
    	return this.accessControlPolicyIDs;
    }
    
    public void addAccessControlPolicyIDs(String acp) {
    	if (accessControlPolicyIDs == null) {
    		accessControlPolicyIDs = new ArrayList<String>();
    	}
    	this.accessControlPolicyIDs.add(acp);
    }    
    

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTime(String value) {
        this.expirationTime = value;
    }
    
    
    public String toString() {
    	StringBuilder sbld = new StringBuilder();
    	sbld.append(super.toString());
    	
    	sbld.append("[RegularResource]").append(NL);
    	sbld.append("accessControlPolicyIDs: ").append(accessControlPolicyIDs).append(NL);
    	/*
    	boolean flag = false;
    	for (String policy : getAccessControlPolicyIDs()) {
    		if(flag) { 
    			sbld.append("; ");
    		} else {
    			flag = true;
    		}
    		sbld.append(policy);
    	}
    	*/
    	sbld.append("expirationTime: ").append(expirationTime).append(NL);
    	
    	return sbld.toString();
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
			
			if (Utils.checkIfExpired(getExpirationTime())) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "Expired resource cannot created");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크


		} else if (operation.equals(OPERATION.RETRIEVE)) {	// RETRIEVE 응답에 대한 유효성 체크

			if (expirationTime != null && Utils.checkIfExpired(getExpirationTime())) {
				throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "Resource expired");
			}
		}
		
		super.validate(operation);
		
	}
}
