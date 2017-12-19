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
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputDataPointLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;element name="outputDataPointLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}genericInterworkingServiceAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}genericInterworkingOperationInstanceAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptorAnnc"/>
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
    "serviceName",
    "inputDataPointLinks",
    "outputDataPointLinks",
    "childResource",
    "genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor"
})

@XmlRootElement(name = Naming.GENERICINTERWORKINGSERVICEANNC_SN)
public class GenericInterworkingServiceAnnc
    extends AnnouncedFlexContainerResource
{

	@XmlElement(name = Naming.SERVICENAME_SN)
    protected String serviceName;
	@XmlElement(name = Naming.INPUTDATAPOINTLINKS_SN)
    protected ListOfDataLinks inputDataPointLinks;
	@XmlElement(name = Naming.OUTPUTDATAPOINTLINKS_SN)
    protected ListOfDataLinks outputDataPointLinks;
	@XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
    	@XmlElement(name = "genericInterworkingServiceAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = GenericInterworkingServiceAnnc.class),
        @XmlElement(name = "genericInterworkingOperationInstanceAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = GenericInterworkingOperationInstanceAnnc.class),
        @XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "semanticDescriptorAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptorAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the inputDataPointLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getInputDataPointLinks() {
        return inputDataPointLinks;
    }

    /**
     * Sets the value of the inputDataPointLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setInputDataPointLinks(ListOfDataLinks value) {
        this.inputDataPointLinks = value;
    }

    /**
     * Gets the value of the outputDataPointLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getOutputDataPointLinks() {
        return outputDataPointLinks;
    }

    /**
     * Sets the value of the outputDataPointLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setOutputDataPointLinks(ListOfDataLinks value) {
        this.outputDataPointLinks = value;
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
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericInterworkingServiceAnnc }
     * {@link GenericInterworkingOperationInstanceAnnc }
     * {@link SemanticDescriptor }
     * {@link SemanticDescriptorAnnc }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getGenericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor() {
        if (genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor == null) {
            genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor = new ArrayList<Object>();
        }
        return this.genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor;
    }
    
    public void addGenericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor(Object value) {
    	if (genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor == null) {
    		genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor = new ArrayList<Object>();
    	}
    	this.genericInterworkingServiceAnncOrGenericInterworkingOperationInstanceAnncOrSemanticDescriptor.add(value);
    }

}
