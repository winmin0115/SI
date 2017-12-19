//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:07 오후 KST 
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedSubordinateResource">
 *       &lt;sequence>
 *         &lt;element name="stateTag" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="contentInfo" type="{http://www.onem2m.org/xml/protocols}contentInfo" minOccurs="0"/>
 *         &lt;element name="contentSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ontologyRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "contentInfo",
    "contentSize",
    "ontologyRef",
    "content",
    "childResource",		// added in CDT-2.7.0
    "semanticDescriptor"	// added in CDT-2.7.0
})
//@XmlRootElement(name = "contentInstanceAnnc")
@XmlRootElement(name = Naming.CONTENTINSTANCEANNC)
public class ContentInstanceAnnc
    extends AnnouncedSubordinateResource
{

//	public final static String SCHEMA_LOCATION = "CDT-contentInstance-v1_2_0.xsd";
//	public final static String SCHEMA_LOCATION = "CDT-contentInstance-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-contentInstance-v2_7_0.xsd";
	
	public static final List<String> MA = new ArrayList<String>(
			Arrays.asList(Naming.RESOURCEID_SN,
							Naming.RESOURCENAME_SN,
							Naming.LABELS_SN
			)
		);
		public static final Set<String> OA = new HashSet<String>(
			Arrays.asList(Naming.STATETAG_SN,
							Naming.CONTENTINFO_SN,
							Naming.CONTENTSIZE_SN,
							Naming.ONTOLOGYREF_SN,
							Naming.CONTENT_SN
			)
		);
	
    //@XmlElement(required = true)
    @XmlElement(name = Naming.STATETAG_SN)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer stateTag;
    @XmlElement(name = Naming.CONTENTINFO_SN)
    protected String contentInfo;
    @XmlElement(name = Naming.CONTENTSIZE_SN)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer contentSize;
    @XmlElement(name = Naming.ONTOLOGYREF_SN)
    @XmlSchemaType(name = "anyURI")
    protected String ontologyRef;
    @XmlElement(name = Naming.CONTENT_SN)
    protected String content;
    protected List<ChildResourceRef> childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<SemanticDescriptor> semanticDescriptor;

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
     * Gets the value of the contentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentInfo() {
        return contentInfo;
    }

    /**
     * Sets the value of the contentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentInfo(String value) {
        this.contentInfo = value;
    }

    /**
     * Gets the value of the contentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentSize() {
        return contentSize;
    }

    /**
     * Sets the value of the contentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentSize(Integer value) {
        this.contentSize = value;
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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
      //  if (childResource == null) {
      //      childResource = new ArrayList<ChildResourceRef>();
      //  }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the semanticDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticDescriptor }
     * 
     * 
     */
    public List<SemanticDescriptor> getSemanticDescriptor() {
     //   if (semanticDescriptor == null) {
     //       semanticDescriptor = new ArrayList<SemanticDescriptor>();
     //   }
        return this.semanticDescriptor;
    }
    
    public void addSemanticDescriptor(SemanticDescriptor value) {
    	if (semanticDescriptor == null) {
    		semanticDescriptor = new ArrayList<SemanticDescriptor>();
    	}
    	this.semanticDescriptor.add(value);
    }

}
