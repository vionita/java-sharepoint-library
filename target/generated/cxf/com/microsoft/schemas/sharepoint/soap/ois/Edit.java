
package com.microsoft.schemas.sharepoint.soap.ois;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
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
@XmlType(name = "", propOrder = {
    "strListName",
    "strFolder",
    "itemFileName",
    "recipe"
})
@XmlRootElement(name = "Edit")
public class Edit {

    protected String strListName;
    protected String strFolder;
    protected String itemFileName;
    protected Edit.Recipe recipe;

    /**
     * Gets the value of the strListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrListName() {
        return strListName;
    }

    /**
     * Sets the value of the strListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrListName(String value) {
        this.strListName = value;
    }

    /**
     * Gets the value of the strFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFolder() {
        return strFolder;
    }

    /**
     * Sets the value of the strFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFolder(String value) {
        this.strFolder = value;
    }

    /**
     * Gets the value of the itemFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemFileName() {
        return itemFileName;
    }

    /**
     * Sets the value of the itemFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemFileName(String value) {
        this.itemFileName = value;
    }

    /**
     * Gets the value of the recipe property.
     * 
     * @return
     *     possible object is
     *     {@link Edit.Recipe }
     *     
     */
    public Edit.Recipe getRecipe() {
        return recipe;
    }

    /**
     * Sets the value of the recipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Edit.Recipe }
     *     
     */
    public void setRecipe(Edit.Recipe value) {
        this.recipe = value;
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
     *         &lt;any/>
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
        "any"
    })
    public static class Recipe {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
