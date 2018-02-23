//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:16 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="nodeID" type="{http://www.onem2m.org/xml/protocols}nodeID"/>
 *         &lt;element name="hostedCSELink" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}memoryAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}batteryAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}areaNwkInfoAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}areaNwkDeviceInfoAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}firmwareAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}softwareAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}deviceInfoAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}deviceCapabilityAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}rebootAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}eventLogAnnc"/>
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
    "nodeID",
    "hostedCSELink",
    "childResource",
    "memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc"
})
//@XmlRootElement(name = "nodeAnnc")
@XmlRootElement(name = Naming.NODEANNC_SN)
public class NodeAnnc
    extends AnnouncedResource    // fixed in 1.6.0 (x)AnnounceableResource  -> AnnouncedResource
{
	
//	public final static String SCHEMA_LOCATION = "CDT-node-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-node-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-node-v2_7_0.xsd";

	public static final List<String> MA = new ArrayList<String>(
		Arrays.asList(Naming.RESOURCEID_SN,
					  Naming.RESOURCENAME_SN,
					  Naming.EXPIRATIONTIME_SN,
					  Naming.ACCESSCONTROLPOLICYIDS_SN,
					  Naming.LABELS_SN,
					  Naming.NODEID_SN
		)
	);
	public static final Set<String> OA = new HashSet<String>(
		Arrays.asList(Naming.HOSTEDCSELINK_SN
		)
	);
	
    //@XmlElement(required = true)
    @XmlElement(name = Naming.NODEID_SN, required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nodeID;
    @XmlElement(name = Naming.HOSTEDCSELINK_SN)
    protected String hostedCSELink;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "memoryAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = MemoryAnnc.class),
        @XmlElement(name = "batteryAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = BatteryAnnc.class),
        @XmlElement(name = "areaNwkInfoAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AreaNwkInfoAnnc.class),
        @XmlElement(name = "areaNwkDeviceInfoAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AreaNwkDeviceInfoAnnc.class),
        @XmlElement(name = "firmwareAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = FirmwareAnnc.class),
        @XmlElement(name = "softwareAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SoftwareAnnc.class),
        @XmlElement(name = "deviceInfoAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = DeviceInfoAnnc.class),
        @XmlElement(name = "deviceCapabilityAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = DeviceCapabilityAnnc.class),
        @XmlElement(name = "rebootAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = RebootAnnc.class),
        @XmlElement(name = "eventLogAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = EventLogAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),			// added in CDT-2.7.0
        @XmlElement(name = "semanticDescriptorAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptorAnnc.class),	// added in CDT-2.7.0
        @XmlElement(name = "trafficPatternAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = TrafficPatternAnnc.class)			// added in CDT-2.7.0
    })
    protected List<Resource> memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc;

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the hostedCSELink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedCSELink() {
        return hostedCSELink;
    }

    /**
     * Sets the value of the hostedCSELink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedCSELink(String value) {
        this.hostedCSELink = value;
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
     * Gets the value of the memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoryAnncOrBatteryAnncOrAreaNwkInfoAnnc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemoryAnnc }
     * {@link BatteryAnnc }
     * {@link AreaNwkInfoAnnc }
     * {@link AreaNwkDeviceInfoAnnc }
     * {@link FirmwareAnnc }
     * {@link SoftwareAnnc }
     * {@link DeviceInfoAnnc }
     * {@link DeviceCapabilityAnnc }
     * {@link RebootAnnc }
     * {@link EventLogAnnc }
     * {@link Subscription }
     * {@link SemanticDescriptor }
     * {@link SemanticDescriptorAnnc }
     * {@link TrafficPatternAnnc }
     * 
     * 
     */
    public List<Resource> getMemoryAnncOrBatteryAnncOrAreaNwkInfoAnnc() {
//    	if (memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc == null) {
//    		memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc = new ArrayList<Resource>();
//        }
    	return this.memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc;
    }

    public void addMemoryAnncOrBatteryAnncOrAreaNwkInfoAnnc(Resource res) {
    	if (memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc == null) {
    		memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc = new ArrayList<Resource>();
        }
    	this.memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc.add(res);
    }


    @Override
	public void validate(OPERATION operation) throws OneM2MException {
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크

			if (this.nodeID == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "nodeID is MA on CREATE");				
			}

		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크

		}
		
		super.validate(operation);
		
	}
}