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

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for mgmtResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mgmtResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="mgmtDefinition" type="{http://www.onem2m.org/xml/protocols}mgmtDefinition"/>
 *         &lt;element name="objectIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="objectPaths" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mgmtResource", propOrder = {
    "mgmtDefinition",
    "objectIDs",
    "objectPaths",
    "description"
})
@XmlSeeAlso({
	CmdhNetworkAccessRules.class,		// added in CDT-2.7.0
	CmdhNwAccessRule.class,				// added in CDT-2.7.0
	CmdhBuffer.class,					// added in CDT-2.7.0
	CmdhDefaults.class,					// added in CDT-2.7.0
	CmdhDefEcValue.class,				// added in CDT-2.7.0
	CmdhEcDefParamValues.class,			// added in CDT-2.7.0
	CmdhLimits.class,					// added in CDT-2.7.0
    EventLog.class,
    Reboot.class,
    ActiveCmdhPolicy.class,
    CmdhPolicy.class,
    Memory.class,
    AreaNwkDeviceInfo.class,
    DeviceInfo.class,
    Firmware.class,
    AreaNwkInfo.class,
    Battery.class,
    Software.class,
    DeviceCapability.class
    
})
public class MgmtResource
    extends AnnounceableResource
{
//	public final static String SCHEMA_LOCATION = "CDT-mgmtCmd-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-mgmtCmd-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-mgmtCmd-v2_7_0.xsd";

    //@XmlElement(required = true)
    @XmlElement(name = Naming.MGMTDEFINITION_SN)
    protected Integer mgmtDefinition;
    @XmlElement(name = Naming.OBJECTIDS_SN)
    @XmlList
    protected List<String> objectIDs;
    @XmlElement(name = Naming.OBJECTPATHS_SN)
    @XmlList
    protected List<String> objectPaths;
    @XmlElement(name = Naming.DESCRIPTION_SN)
    protected String description;

    /**
     * Gets the value of the mgmtDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMgmtDefinition() {
        return mgmtDefinition;
    }

    /**
     * Sets the value of the mgmtDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMgmtDefinition(Integer value) {
        this.mgmtDefinition = value;
    }

    /**
     * Gets the value of the objectIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectIDs() {
//    	if (objectIDs == null) {
//    		objectIDs = new ArrayList<String>();
//    	}
    	return this.objectIDs;
    }

    public void addObjectIDs(String objid) {
    	if (objectIDs == null) {
    		objectIDs = new ArrayList<String>();
    	}
    	this.objectIDs.add(objid);
    }

    
    /**
     * Gets the value of the objectPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectPaths() {
//    	if (objectPaths == null) {
//    		objectPaths = new ArrayList<String>();
//        }
    	return this.objectPaths;
    }

    public void addObjectPaths(String objPath) {
    	if (objectPaths == null) {
    		objectPaths = new ArrayList<String>();
        }
    	this.objectPaths.add(objPath);
    }

    
    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }


    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			if (this.mgmtDefinition != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is NP on CREATE operation");
			}
			if (this.objectIDs != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectIDs' is NP on CREATE operation");
			}
			if (this.objectPaths != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectPaths' is NP on CREATE operation");
			}
		}
	
		super.validate(operation);
		
	}
}
