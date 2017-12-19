//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:06:31 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="requestOrigin" type="{http://www.onem2m.org/xml/protocols}listOfM2MID"/>
 *         &lt;element name="requestContext" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="requestContextNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requestCharacteristics" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="limitsEventCategory" type="{http://www.onem2m.org/xml/protocols}listOfEventCat"/>
 *         &lt;element name="limitsRequestExpTime" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsResultExpTime" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsOpExecTime" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsRespPersistence" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsDelAggregation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="0 1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "order",
    "requestOrigin",
    "requestContext",
    "requestContextNotification",
    "requestCharacteristics",
    "limitsEventCategory",
    "limitsRequestExpTime",
    "limitsResultExpTime",
    "limitsOpExecTime",
    "limitsRespPersistence",
    "limitsDelAggregation"
})
//@XmlRootElement(name = "cmdhLimits")
@XmlRootElement(name = Naming.CMDHLIMITS_SN)
public class CmdhLimits
    extends MgmtResource
{
//	public final static String SCHEMA_LOCATION = "CDT-cmdhLimits-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-cmdhLimits-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-cmdhLimits-v2_7_0.xsd";

    //@XmlElement(required = true)
    @XmlElement(name = Naming.ORDER_SN, required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer order;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.REQUESTORIGIN_SN, required = true)
    protected List<String> requestOrigin;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.REQUESTCONTEXT_SN, required = true)
    protected Object requestContext;
    @XmlElement(name = Naming.REQUESTCONTEXTNOTIFICATION_SN)
    protected Boolean requestContextNotification;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.REQUESTCHARACTERISTICS_SN, required = true)
    protected Object requestCharacteristics;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.LIMITSEVENTCATEGORY_SN, required = true)
    protected List<String> limitsEventCategory;
    @XmlList
    //@XmlElement(type = Long.class)
    @XmlElement(name = Naming.LIMITSREQUESTEXPTIME_SN, type = Long.class)
    protected List<Long> limitsRequestExpTime;
    @XmlList
    //@XmlElement(type = Long.class)
    @XmlElement(name = Naming.LIMITSRESULTEXPTIME_SN, type = Long.class)
    protected List<Long> limitsResultExpTime;
    @XmlList
    //@XmlElement(type = Long.class)
    @XmlElement(name = Naming.LIMITSOPEXECTIME_SN, type = Long.class)
    protected List<Long> limitsOpExecTime;
    @XmlList
    //@XmlElement(type = Long.class)
    @XmlElement(name = Naming.LIMITSRESPPERSISTENCE_SN, type = Long.class)
    protected List<Long> limitsRespPersistence;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.LIMITSDELAGGREGATION_SN, required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String limitsDelAggregation;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * Gets the value of the requestOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestOrigin() {
//        if (requestOrigin == null) {
//            requestOrigin = new ArrayList<String>();
//        }
        return this.requestOrigin;
    }
    
    public void addRequestOrigin(String reqorg) {
    	if (requestOrigin == null) {
    		requestOrigin = new ArrayList<String>();
    	}
    	this.requestOrigin.add(reqorg);
    }

    /**
     * Gets the value of the requestContext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRequestContext() {
        return requestContext;
    }

    /**
     * Sets the value of the requestContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRequestContext(Object value) {
        this.requestContext = value;
    }

    /**
     * Gets the value of the requestContextNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestContextNotification() {
        return requestContextNotification;
    }

    /**
     * Sets the value of the requestContextNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestContextNotification(Boolean value) {
        this.requestContextNotification = value;
    }

    /**
     * Gets the value of the requestCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRequestCharacteristics() {
        return requestCharacteristics;
    }

    /**
     * Sets the value of the requestCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRequestCharacteristics(Object value) {
        this.requestCharacteristics = value;
    }

    /**
     * Gets the value of the limitsEventCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitsEventCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitsEventCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLimitsEventCategory() {
//        if (limitsEventCategory == null) {
//            limitsEventCategory = new ArrayList<String>();
//        }
        return this.limitsEventCategory;
    }

    public void addLimitsEventCategory(String lec) {
    	if (limitsEventCategory == null) {
    		limitsEventCategory = new ArrayList<String>();
    	}
    	this.limitsEventCategory.add(lec);
    }
    
    /**
     * Gets the value of the limitsRequestExpTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitsRequestExpTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitsRequestExpTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLimitsRequestExpTime() {
//        if (limitsRequestExpTime == null) {
//            limitsRequestExpTime = new ArrayList<Long>();
//        }
        return this.limitsRequestExpTime;
    }

    public void addLimitsRequestExpTime(Long lre) {
    	if (limitsRequestExpTime == null) {
    		limitsRequestExpTime = new ArrayList<Long>();
    	}
    	this.limitsRequestExpTime.add(lre);
    }
    
    /**
     * Gets the value of the limitsResultExpTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitsResultExpTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitsResultExpTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLimitsResultExpTime() {
//        if (limitsResultExpTime == null) {
//            limitsResultExpTime = new ArrayList<Long>();
//        }
        return this.limitsResultExpTime;
    }

    public void addLimitsResultExpTime(Long lre) {
    	if (limitsResultExpTime == null) {
    		limitsResultExpTime = new ArrayList<Long>();
    	}
    	this.limitsResultExpTime.add(lre);
    }
    
    /**
     * Gets the value of the limitsOpExecTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitsOpExecTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitsOpExecTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLimitsOpExecTime() {
//        if (limitsOpExecTime == null) {
//            limitsOpExecTime = new ArrayList<Long>();
//        }
        return this.limitsOpExecTime;
    }

    public void addLimitsOpExecTime(Long lot) {
    	if (limitsOpExecTime == null) {
    		limitsOpExecTime = new ArrayList<Long>();
    	}
    	this.limitsOpExecTime.add(lot);
    }
    /**
     * Gets the value of the limitsRespPersistence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitsRespPersistence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitsRespPersistence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLimitsRespPersistence() {
//        if (limitsRespPersistence == null) {
//            limitsRespPersistence = new ArrayList<Long>();
//        }
        return this.limitsRespPersistence;
    }

    public void addLimitsRespPersistence(Long lrp) {
    	if (limitsRespPersistence == null) {
    		limitsRespPersistence = new ArrayList<Long>();
    	}
    	this.limitsRespPersistence.add(lrp);
    }
    
    /**
     * Gets the value of the limitsDelAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitsDelAggregation() {
        return limitsDelAggregation;
    }

    /**
     * Sets the value of the limitsDelAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitsDelAggregation(String value) {
        this.limitsDelAggregation = value;
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.mgmtDefinition == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is M on CREATE operation");
			}
			if (this.order == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'order' is M on CREATE operation");
			}
			if (this.requestOrigin == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'requestOrigin' is M on CREATE operation");
			}
			if (this.limitsEventCategory == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'limitsEventCategory' is M on CREATE operation");
			}
			if (this.limitsRequestExpTime == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'limitsRequestExpTime' is M on CREATE operation");
			}
			if (this.limitsResultExpTime == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'limitsResultExpTime' is M on CREATE operation");
			}
			if (this.limitsOpExecTime == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'limitsOpExecTime' is M on CREATE operation");
			}
			if (this.limitsRespPersistence == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'limitsRespPersistence' is M on CREATE operation");
			}
			if (this.limitsDelAggregation == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'limitsDelAggregation' is M on CREATE operation");
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
