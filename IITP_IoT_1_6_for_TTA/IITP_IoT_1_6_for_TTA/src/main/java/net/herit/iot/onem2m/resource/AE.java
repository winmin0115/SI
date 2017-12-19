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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="App-ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AE-ID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="pointOfAccess" type="{http://www.onem2m.org/xml/protocols}poaList" minOccurs="0"/>
 *         &lt;element name="ontologyRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="nodeLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="requestReachability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contentSerialization" type="{http://www.onem2m.org/xml/protocols}serializations" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}container"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}group"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}accessControlPolicy"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}pollingChannel"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}schedule"/>
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
    "appName",
    "appID",
    "aeid",
    "pointOfAccess",
    "ontologyRef",
    "nodeLink",
    "requestReachability",
    "contentSerialization",
    "e2ESecInfo",
    "childResource",
    "containerOrGroupOrAccessControlPolicy"
})
//@XmlRootElement(name = "m2m:ae")
@XmlRootElement(name = Naming.AE_SN)
public class AE
    extends AnnounceableResource
{
//	public final static String SCHEMA_LOCATION = "CDT-AE-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-AE-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-AE-v2_7_0.xsd";

//	String[] CREATE_MA = {"appID", "requestReachability"};
//	String[] CREATE_NP = {"resourceName","resourceType","resourceID","parentID","creationTime",
//							"lastModifiedTime","aeid","nodeLink"};
//	String[] UPDATE_MA = {};
//	String[] UPDATE_NP = {"resourceName","resourceType","resourceID","parentID","creationTime",
//							"lastModifiedTime","aeid","nodeLink", "appID"};
//	String[] RESPONSE_MA = {"resourceType", "resourceID", "resourceName", "parentID", "expireationTime", 
//							"creationTime", "lastModifiedTime"};
//	String[] RESPONSE_NP = {};
	
	@XmlElement(name = Naming.APPNAME_SN) //"apn")
    protected String appName;
    //@XmlElement(name = "App-ID", required = true)
	//@XmlElement(name = "api", required = true)
	@XmlElement(name = Naming.APPID_SN) //"api")
    protected String appID;
    //@XmlElement(name = "AE-ID", required = true)
    //@XmlElement(name = "aei", required = true)
	@XmlElement(name = Naming.AEID_SN) //"aei")
    protected String aeid;
    @XmlList
    @XmlElement(name = Naming.POINTOFACCESS_SN) //"poa")
    protected List<String> pointOfAccess;
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = Naming.ONTOLOGYREF_SN) //"or")
    protected String ontologyRef;
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = Naming.NODELINK_SN) //"nl")
    protected String nodeLink;
    @XmlElement(name = Naming.REQUESTREACHABILITY_SN) //"rr")
    //protected boolean requestReachability;
    protected Boolean requestReachability;
    
    @XmlList
    @XmlElement(name = Naming.CONTENTSERIALIZATION_SN) //"csz")
    protected List<PermittedMediaTypes> contentSerialization;  // added in XSD-1.6.0
    
    @XmlElement(name = Naming.E2ESECINFO_SN)
    protected E2ESecInfo e2ESecInfo;				// added in XSD-2.7.0
    
    @XmlElement(name = Naming.CHILDRESOURCE_SN) //"ch")
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "group", namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
        @XmlElement(name = "container", namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
        @XmlElement(name = "schedule", namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class),
        @XmlElement(name = "pollingChannel", namespace = "http://www.onem2m.org/xml/protocols", type = PollingChannel.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "accessControlPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
        @XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "timeSeries", namespace = "http://www.onem2m.org/xml/protocols", type = TimeSeries.class),
        @XmlElement(name = "trafficPattern", namespace = "http://www.onem2m.org/xml/protocols", type = TrafficPattern.class),
        @XmlElement(name = "sg_flexContainerResource", namespace = "http://www.onem2m.org/xml/protocols", type = FlexContainerResource.class)
    })
    protected List<Resource> containerOrGroupOrAccessControlPolicy;

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the aeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEID() {
        return aeid;
    }

    /**
     * Sets the value of the aeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEID(String value) {
        this.aeid = value;
    }

    /**
     * Gets the value of the pointOfAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPointOfAccess() {
//        if (pointOfAccess == null) {
//            pointOfAccess = new ArrayList<String>();
//        }
        return this.pointOfAccess;
    }
    
    public void addPointOfAccess(String poa) {
    	if (pointOfAccess == null) {
    		pointOfAccess = new ArrayList<String>();
    	}
    	this.pointOfAccess.add(poa);
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
     * Gets the value of the nodeLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeLink() {
        return nodeLink;
    }

    /**
     * Sets the value of the nodeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeLink(String value) {
        this.nodeLink = value;
    }

    /**
     * Gets the value of the requestReachability property.
     * 
     */
    public Boolean isRequestReachability() {
        return requestReachability;
    }

    /**
     * Sets the value of the requestReachability property.
     * 
     */
    public void setRequestReachability(Boolean value) {
        this.requestReachability = value;
    }
    
    
    /**
     * XSD-1.6.0
     * Gets the value of the contentSerialization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentSerialization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentSerialization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermittedMediaTypes }
     * 
     * 
     */
    public List<PermittedMediaTypes> getContentSerialization() {
//        if (contentSerialization == null) {
//            contentSerialization = new ArrayList<PermittedMediaTypes>();
//        }
        return this.contentSerialization;
    }
    
    public void addContentSerialization(PermittedMediaTypes pmt) {
    	 if (contentSerialization == null) {
             contentSerialization = new ArrayList<PermittedMediaTypes>();
         }
    	 contentSerialization.add(pmt);
    }
    
    /**
     * Gets the value of the e2ESecInfo property.
     * 
     * @return
     *     possible object is
     *     {@link E2ESecInfo }
     *     
     */
    public E2ESecInfo getE2ESecInfo() {
        return e2ESecInfo;
    }

    /**
     * Sets the value of the e2ESecInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link E2ESecInfo }
     *     
     */
    public void setE2ESecInfo(E2ESecInfo value) {
        this.e2ESecInfo = value;
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
     * Gets the value of the containerOrGroupOrAccessControlPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerOrGroupOrAccessControlPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerOrGroupOrAccessControlPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * {@link Container }
     * {@link Schedule }
     * {@link PollingChannel }
     * {@link Subscription }
     * {@link AccessControlPolicy }
     * 
     * 
     */
    public List<Resource> getContainerOrGroupOrAccessControlPolicy() {
//        if (containerOrGroupOrAccessControlPolicy == null) {
//            containerOrGroupOrAccessControlPolicy = new ArrayList<Resource>();
//        }
        return this.containerOrGroupOrAccessControlPolicy;
    }
    
    public void addContainerOrGroupOrAccessControlPolicy(Resource res) {
    	if (containerOrGroupOrAccessControlPolicy == null) {
    		containerOrGroupOrAccessControlPolicy = new ArrayList<Resource>();
    	}
    	this.containerOrGroupOrAccessControlPolicy.add(res);
    }
    

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			if (this.appID == null || this.appID.length() == 0) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'appID' is M on CREATE operation" );
			}
			// v1.0.1 - TBD
			//if (this.requestReachability == null) {
			//	throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'requestReachability' is M onCREATE operation");
			//}
			// requestReachability is Mandatory in CDT-2.7.0 and updated in 2016-10-17
			if (this.requestReachability == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'requestReachability' is M onCREATE operation");
			}
			if (this.aeid != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'aeid' is NP onCREATE operation");
			}
			// nodeLink is Optional in CDT-2.7.0 and blocked in 2016-10-17
			//if (this.nodeLink != null) {
			//	throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'nodeLink' is NP onCREATE operation");
			//}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.appID != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'appID' is NP on UPDATE operation");
			}
			if (this.aeid != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'aeid' is NP on UPDATE operation");
			}
			//nodeLink is Optional in CDT-2.7.0 and blocked in 2016-10-17
			//if (this.nodeLink != null) {
			//	throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'aeid' is NP on UPDATE operation");
			//}
		}
	
		super.validate(operation);
		
	}
	
	public String toString() {
		
		StringBuilder sbld = new StringBuilder();
	
		sbld.append("[AE]").append(NL);
		sbld.append("AE_ID:").append(aeid).append(NL);
		sbld.append("App_ID:").append(appID).append(NL);
		sbld.append("appName:").append(appName).append(NL);
		sbld.append("pointOfAccess:").append(pointOfAccess).append(NL);
		sbld.append("ontologyRef:").append(ontologyRef).append(NL);
		sbld.append("nodeLink:").append(nodeLink).append(NL);
		sbld.append(NL).append(super.toString());
		
		return sbld.toString();
	}

}
