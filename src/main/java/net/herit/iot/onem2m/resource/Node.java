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
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}memory"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}battery"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}areaNwkInfo"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}areaNwkDeviceInfo"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}firmware"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}software"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}deviceInfo"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}deviceCapability"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}reboot"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}eventLog"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}cmdhPolicy"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}activeCmdhPolicy"/>
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
    "memoryOrBatteryOrAreaNwkInfo"
})
//@XmlRootElement(name = "node")
@XmlRootElement(name = "nod")
public class Node
    extends AnnounceableResource
{
	public final static String SCHEMA_LOCATION = "CDT-node-v1_2_0.xsd";

	//@XmlElement(required = true)
    @XmlElement(name = "ni", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nodeID;
    @XmlElement(name = "hcl")
    protected String hostedCSELink;
    @XmlElement(name = "ch")
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "software", namespace = "http://www.onem2m.org/xml/protocols", type = Software.class),
        @XmlElement(name = "areaNwkDeviceInfo", namespace = "http://www.onem2m.org/xml/protocols", type = AreaNwkDeviceInfo.class),
        @XmlElement(name = "firmware", namespace = "http://www.onem2m.org/xml/protocols", type = Firmware.class),
        @XmlElement(name = "deviceCapability", namespace = "http://www.onem2m.org/xml/protocols", type = DeviceCapability.class),
        @XmlElement(name = "cmdhPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = CmdhPolicy.class),
        @XmlElement(name = "activeCmdhPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = ActiveCmdhPolicy.class),
        @XmlElement(name = "memory", namespace = "http://www.onem2m.org/xml/protocols", type = Memory.class),
        @XmlElement(name = "areaNwkInfo", namespace = "http://www.onem2m.org/xml/protocols", type = AreaNwkInfo.class),
        @XmlElement(name = "deviceInfo", namespace = "http://www.onem2m.org/xml/protocols", type = DeviceInfo.class),
        @XmlElement(name = "battery", namespace = "http://www.onem2m.org/xml/protocols", type = Battery.class),
        @XmlElement(name = "reboot", namespace = "http://www.onem2m.org/xml/protocols", type = Reboot.class),
        @XmlElement(name = "eventLog", namespace = "http://www.onem2m.org/xml/protocols", type = EventLog.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<RegularResource> memoryOrBatteryOrAreaNwkInfo;

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
     * Gets the value of the memoryOrBatteryOrAreaNwkInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoryOrBatteryOrAreaNwkInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoryOrBatteryOrAreaNwkInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Software }
     * {@link AreaNwkDeviceInfo }
     * {@link Firmware }
     * {@link DeviceCapability }
     * {@link CmdhPolicy }
     * {@link ActiveCmdhPolicy }
     * {@link Memory }
     * {@link AreaNwkInfo }
     * {@link DeviceInfo }
     * {@link Battery }
     * {@link Reboot }
     * {@link EventLog }
     * {@link Subscription }
     * 
     * 
     */
    public List<RegularResource> getMemoryOrBatteryOrAreaNwkInfo() {
//    	if (memoryOrBatteryOrAreaNwkInfo == null) {
//    		memoryOrBatteryOrAreaNwkInfo = new ArrayList<RegularResource>();
//        }
    	return this.memoryOrBatteryOrAreaNwkInfo;
    }
    
    public void addMemoryOrBatteryOrAreaNwkInfo(RegularResource regres) {
    	if (memoryOrBatteryOrAreaNwkInfo == null) {
    		memoryOrBatteryOrAreaNwkInfo = new ArrayList<RegularResource>();
        }
    	this.memoryOrBatteryOrAreaNwkInfo.add(regres);
    }


    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.nodeID == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'nodeID' is M on CREATE operation");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.hostedCSELink != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'hostedCSELink' is NP on UPDATE operation");
			}
		}
	
		super.validate(operation);
		
	}
}
