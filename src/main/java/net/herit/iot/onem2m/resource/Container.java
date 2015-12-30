//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:07 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="stateTag" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="maxNrOfInstances" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="maxByteSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="maxInstanceAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="currentNrOfInstances" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="currentByteSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ontologyRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="latest" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="oldest" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}contentInstance"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}container"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *           &lt;/choice>
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
    "stateTag",
    "creator",
    "maxNrOfInstances",
    "maxByteSize",
    "maxInstanceAge",
    "currentNrOfInstances",
    "currentByteSize",
    "locationID",
    "ontologyRef",
    "latest",
    "oldest",
    "childResource",
    "contentInstanceOrContainerOrSubscription"
})
//@XmlRootElement(name = "container")
@XmlRootElement(name = "cnt")
public class Container
    extends AnnounceableResource
{

	public final static String SCHEMA_LOCATION = "CDT-container-v1_2_0.xsd ";
	
    //@XmlElement(name = "st", required = true)
	@XmlElement(name = "st")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer stateTag;
    //@XmlElement(name = "cr", required = true)
	@XmlElement(name = "cr")
	protected String creator;
    @XmlElement(name = "mni")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer maxNrOfInstances;
    @XmlElement(name = "mbs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer maxByteSize;
    @XmlElement(name = "mia")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer maxInstanceAge;
    //@XmlElement(name = "cni", required = true)
    @XmlElement(name = "cni")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer currentNrOfInstances;
    //@XmlElement(name = "cbs", required = true)
    @XmlElement(name = "cbs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer currentByteSize;
    @XmlElement(name = "li")
    @XmlSchemaType(name = "anyURI")
    protected String locationID;
    @XmlElement(name = "or")
    @XmlSchemaType(name = "anyURI")
    protected String ontologyRef;
    //@XmlElement(name = "la", required = true)
    @XmlElement(name = "la")
    @XmlSchemaType(name = "anyURI")
    protected String latest;
    //@XmlElement(required = true)
    @XmlElement(name = "ol")
    @XmlSchemaType(name = "anyURI")
    protected String oldest;
    @XmlElement(name = "ch")
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "contentInstance", namespace = "http://www.onem2m.org/xml/protocols", type = ContentInstance.class),
        @XmlElement(name = "container", namespace = "http://www.onem2m.org/xml/protocols", type = Container.class)
    })
    protected List<Resource> contentInstanceOrContainerOrSubscription;

    /**
     * Gets the value of the stateTag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateTag() {
        return stateTag;
    }

    /**
     * Sets the value of the stateTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateTag(Integer value) {
        this.stateTag = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the maxNrOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNrOfInstances() {
        return maxNrOfInstances;
    }

    /**
     * Sets the value of the maxNrOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNrOfInstances(Integer value) {
        this.maxNrOfInstances = value;
    }

    /**
     * Gets the value of the maxByteSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxByteSize() {
        return maxByteSize;
    }

    /**
     * Sets the value of the maxByteSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxByteSize(Integer value) {
        this.maxByteSize = value;
    }

    /**
     * Gets the value of the maxInstanceAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxInstanceAge() {
        return maxInstanceAge;
    }

    /**
     * Sets the value of the maxInstanceAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxInstanceAge(Integer value) {
        this.maxInstanceAge = value;
    }

    /**
     * Gets the value of the currentNrOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNrOfInstances() {
        return currentNrOfInstances;
    }

    /**
     * Sets the value of the currentNrOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNrOfInstances(Integer value) {
        this.currentNrOfInstances = value;
    }

    /**
     * Gets the value of the currentByteSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentByteSize() {
        return currentByteSize;
    }

    /**
     * Sets the value of the currentByteSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentByteSize(Integer value) {
        this.currentByteSize = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the ontologyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyRef() {
        return ontologyRef;
    }

    /**
     * Sets the value of the ontologyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyRef(String value) {
        this.ontologyRef = value;
    }

    /**
     * Gets the value of the latest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatest() {
        return latest;
    }

    /**
     * Sets the value of the latest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatest(String value) {
        this.latest = value;
    }

    /**
     * Gets the value of the oldest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldest() {
        return oldest;
    }

    /**
     * Sets the value of the oldest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldest(String value) {
        this.oldest = value;
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
//        if (childResource == null) {
//            childResource = new ArrayList<ChildResourceRef>();
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
     * Gets the value of the contentInstanceOrContainerOrSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentInstanceOrContainerOrSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentInstanceOrContainerOrSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * {@link ContentInstance }
     * {@link Container }
     * 
     * 
     */
    public List<Resource> getContentInstanceOrContainerOrSubscription() {
//        if (contentInstanceOrContainerOrSubscription == null) {
//            contentInstanceOrContainerOrSubscription = new ArrayList<Resource>();
//        }
        return this.contentInstanceOrContainerOrSubscription;
    }

    public void addContentInstanceOrContainerOrSubscription(Resource res) {
    	if (contentInstanceOrContainerOrSubscription == null) {
    		contentInstanceOrContainerOrSubscription = new ArrayList<Resource>();
    	}
    	this.contentInstanceOrContainerOrSubscription.add(res);
    }
    
    

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
//			if (this.creator != null) {	// 2015.09.15 removed... 최근 표준에서 제외 OP로 (있으면 DB 저장)
//				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'creator' is NP on CREATE operation");
//			}
			if (this.currentNrOfInstances != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'currentNrOfInstances' is NP on CREATE operation");
			}
			if (this.currentByteSize != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'currentByteSize' is NP on CREATE operation");
			}
			if (this.stateTag != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'stateTag' is NP on CREATE operation");
			}
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.creator != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'creator' is NP on UPDATE operation");
			}
			if (this.currentNrOfInstances != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'currentNrOfInstances' is NP on UPDATE operation");
			}
			if (this.currentByteSize != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'currentByteSize' is NP on UPDATE operation");
			}
			if (this.stateTag != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'stateTag' is NP on UPDATE operation");
			}
		}
	
		super.validate(operation);
		
	}
	
	public String toString() {
		return super.toString()+
				"[container]\r\n"+
				"creator:"+creator+"\r\n"+
				"maxNrOfInstance:"+this.maxNrOfInstances+"\r\n"+
				"maxByteSize:"+maxByteSize+"\r\n"+
				"maxInstanceAge:"+maxInstanceAge+"\r\n"+
				"currentNrOfInstances:"+currentNrOfInstances+"\r\n"+
				"currentByteSize:"+currentByteSize+"\r\n"+
				"locationID:"+locationID+"\r\n"+
				"ontologyRef:"+ontologyRef+"\r\n";
	}
}
