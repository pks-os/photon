
package org.smpte_ra.schemas.st0429_9_2007.AM;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssetMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}UUID"/>
 *         &lt;element name="AnnotationText" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}UserText" minOccurs="0"/>
 *         &lt;element name="Creator" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}UserText"/>
 *         &lt;element name="VolumeCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Issuer" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}UserText"/>
 *         &lt;element name="AssetList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Asset" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}AssetType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetMapType", propOrder = {
    "id",
    "annotationText",
    "creator",
    "volumeCount",
    "issueDate",
    "issuer",
    "assetList"
})
public class AssetMapType {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(name = "AnnotationText")
    protected UserText annotationText;
    @XmlElement(name = "Creator", required = true)
    protected UserText creator;
    @XmlElement(name = "VolumeCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger volumeCount;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "Issuer", required = true)
    protected UserText issuer;
    @XmlElement(name = "AssetList", required = true)
    protected AssetMapType.AssetList assetList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the annotationText property.
     * 
     * @return
     *     possible object is
     *     {@link UserText }
     *     
     */
    public UserText getAnnotationText() {
        return annotationText;
    }

    /**
     * Sets the value of the annotationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserText }
     *     
     */
    public void setAnnotationText(UserText value) {
        this.annotationText = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link UserText }
     *     
     */
    public UserText getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserText }
     *     
     */
    public void setCreator(UserText value) {
        this.creator = value;
    }

    /**
     * Gets the value of the volumeCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolumeCount() {
        return volumeCount;
    }

    /**
     * Sets the value of the volumeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolumeCount(BigInteger value) {
        this.volumeCount = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link UserText }
     *     
     */
    public UserText getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserText }
     *     
     */
    public void setIssuer(UserText value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the assetList property.
     * 
     * @return
     *     possible object is
     *     {@link AssetMapType.AssetList }
     *     
     */
    public AssetMapType.AssetList getAssetList() {
        return assetList;
    }

    /**
     * Sets the value of the assetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetMapType.AssetList }
     *     
     */
    public void setAssetList(AssetMapType.AssetList value) {
        this.assetList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Asset" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}AssetType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "asset"
    })
    public static class AssetList {

        @XmlElement(name = "Asset", required = true)
        protected List<AssetType> asset;

        /**
         * Gets the value of the asset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssetType }
         * 
         * 
         */
        public List<AssetType> getAsset() {
            if (asset == null) {
                asset = new ArrayList<AssetType>();
            }
            return this.asset;
        }

    }

}
