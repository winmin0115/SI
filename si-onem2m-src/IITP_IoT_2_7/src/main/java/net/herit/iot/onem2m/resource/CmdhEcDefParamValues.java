//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:05:59 오후 KST 
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="applicableEventCategory" type="{http://www.onem2m.org/xml/protocols}listOfEventCatWithDef"/>
 *         &lt;element name="defaultRequestExpTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="defaultResultExpTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="defaultOpExecTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="defaultRespPersistence" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="defaultDelAggregation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "applicableEventCategory",
    "defaultRequestExpTime",
    "defaultResultExpTime",
    "defaultOpExecTime",
    "defaultRespPersistence",
    "defaultDelAggregation"
})
//@XmlRootElement(name = "cmdhEcDefParamValues")
@XmlRootElement(name = Naming.CMDHECDEFPARAMVALUES_SN)
public class CmdhEcDefParamValues
    extends MgmtResource
{

//	public final static String SCHEMA_LOCATION = "CDT-cmdhEcDefParamValues-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-cmdhEcDefParamValues-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-cmdhEcDefParamValues-v2_7_0.xsd";
	
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.APPLICABLEEVENTCATEGORY_SN, required = true)
    protected List<String> applicableEventCategory;
    @XmlElement(name = Naming.DEFAULTREQUESTEXPTIME_SN)
//    protected long defaultRequestExpTime;
    protected Long defaultRequestExpTime;
    @XmlElement(name = Naming.DEFAULTRESULTEXPTIME_SN)
//    protected long defaultResultExpTime;
    protected Long defaultResultExpTime;
    @XmlElement(name = Naming.DEFAULTOPEXPTIME_SN)
//    protected long defaultOpExecTime;
    protected Long defaultOpExecTime;
    @XmlElement(name = Naming.DEFAULTRESPPERSISTENCE_SN)
//    protected long defaultRespPersistence;
    protected Long defaultRespPersistence;
    @XmlElement(name = Naming.DEFAULTDELAGGREGATION_SN)
//    protected boolean defaultDelAggregation;
    protected Boolean defaultDelAggregation;

    /**
     * Gets the value of the applicableEventCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableEventCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableEventCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableEventCategory() {
//        if (applicableEventCategory == null) {
//            applicableEventCategory = new ArrayList<String>();
//        }
        return this.applicableEventCategory;
    }

    public void addApplicableEventCategory(String aec) {
    	if (applicableEventCategory == null) {
    		applicableEventCategory = new ArrayList<String>();
    	}
    	this.applicableEventCategory.add(aec);
    }
    
    /**
     * Gets the value of the defaultRequestExpTime property.
     * 
     */
    public Long getDefaultRequestExpTime() {
        return defaultRequestExpTime;
    }

    /**
     * Sets the value of the defaultRequestExpTime property.
     * 
     */
    public void setDefaultRequestExpTime(Long value) {
        this.defaultRequestExpTime = value;
    }

    /**
     * Gets the value of the defaultResultExpTime property.
     * 
     */
    public Long getDefaultResultExpTime() {
        return defaultResultExpTime;
    }

    /**
     * Sets the value of the defaultResultExpTime property.
     * 
     */
    public void setDefaultResultExpTime(Long value) {
        this.defaultResultExpTime = value;
    }

    /**
     * Gets the value of the defaultOpExecTime property.
     * 
     */
    public Long getDefaultOpExecTime() {
        return defaultOpExecTime;
    }

    /**
     * Sets the value of the defaultOpExecTime property.
     * 
     */
    public void setDefaultOpExecTime(Long value) {
        this.defaultOpExecTime = value;
    }

    /**
     * Gets the value of the defaultRespPersistence property.
     * 
     */
    public Long getDefaultRespPersistence() {
        return defaultRespPersistence;
    }

    /**
     * Sets the value of the defaultRespPersistence property.
     * 
     */
    public void setDefaultRespPersistence(Long value) {
        this.defaultRespPersistence = value;
    }

    /**
     * Gets the value of the defaultDelAggregation property.
     * 
     */
    public Boolean isDefaultDelAggregation() {
        return defaultDelAggregation;
    }

    /**
     * Sets the value of the defaultDelAggregation property.
     * 
     */
    public void setDefaultDelAggregation(Boolean value) {
        this.defaultDelAggregation = value;
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.mgmtDefinition == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is M on CREATE operation");
			}
			if (this.applicableEventCategory == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'applicableEventCategory' is M on CREATE operation");
			}
			if (this.defaultRequestExpTime == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'defaultRequestExpTime' is M on CREATE operation");
			}
			if (this.defaultResultExpTime == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'defaultResultExpTime' is M on CREATE operation");
			}
			if (this.defaultOpExecTime == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'defaultOpExecTime' is M on CREATE operation");
			}
			if (this.defaultRespPersistence == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'defaultRespPersistence' is M on CREATE operation");
			}
			if (this.defaultDelAggregation == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'defaultDelAggregation' is M on CREATE operation");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.mgmtDefinition != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is NP on UPDATE operation");
			}
			if (this.objectIDs != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectIDs' is NP on UPDATE operation");
			}
			if (this.objectPaths != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectPaths' is NP on UPDATE operation");
			}
			
		}
	
		super.validate(operation);
		
	}
}
