//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.10 at 01:19:14 오후 KST 
//


package org.onem2m.xml.protocols;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="locationSource" type="{http://www.onem2m.org/xml/protocols}locationSource" minOccurs="0"/>
 *         &lt;element name="locationUpdatePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="locationTargetID" type="{http://www.onem2m.org/xml/protocols}nodeID" minOccurs="0"/>
 *         &lt;element name="locationServer" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="locationContainerID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="locationContainerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "locationSource",
    "locationUpdatePeriod",
    "locationTargetID",
    "locationServer",
    "locationContainerID",
    "locationContainerName",
    "locationStatus"
})
@XmlRootElement(name = "locationPolicyAnnc")
public class LocationPolicyAnnc
    extends AnnouncedResource
{

    protected BigInteger locationSource;
    protected Duration locationUpdatePeriod;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String locationTargetID;
    @XmlSchemaType(name = "anyURI")
    protected String locationServer;
    @XmlSchemaType(name = "anyURI")
    protected String locationContainerID;
    protected String locationContainerName;
    protected String locationStatus;

    /**
     * Gets the value of the locationSource property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationSource() {
        return locationSource;
    }

    /**
     * Sets the value of the locationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationSource(BigInteger value) {
        this.locationSource = value;
    }

    /**
     * Gets the value of the locationUpdatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLocationUpdatePeriod() {
        return locationUpdatePeriod;
    }

    /**
     * Sets the value of the locationUpdatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLocationUpdatePeriod(Duration value) {
        this.locationUpdatePeriod = value;
    }

    /**
     * Gets the value of the locationTargetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTargetID() {
        return locationTargetID;
    }

    /**
     * Sets the value of the locationTargetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTargetID(String value) {
        this.locationTargetID = value;
    }

    /**
     * Gets the value of the locationServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationServer() {
        return locationServer;
    }

    /**
     * Sets the value of the locationServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationServer(String value) {
        this.locationServer = value;
    }

    /**
     * Gets the value of the locationContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationContainerID() {
        return locationContainerID;
    }

    /**
     * Sets the value of the locationContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContainerID(String value) {
        this.locationContainerID = value;
    }

    /**
     * Gets the value of the locationContainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationContainerName() {
        return locationContainerName;
    }

    /**
     * Sets the value of the locationContainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContainerName(String value) {
        this.locationContainerName = value;
    }

    /**
     * Gets the value of the locationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationStatus() {
        return locationStatus;
    }

    /**
     * Sets the value of the locationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationStatus(String value) {
        this.locationStatus = value;
    }

}
