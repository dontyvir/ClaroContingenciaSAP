
package cl.clarochile.pdt.sur.mnsmont.ws.impl.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZesCabCon complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ZesCabCon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Idenvio" type="{urn:sap-com:document:sap:rfc:functions}numeric20"/&gt;
 *         &lt;element name="Fechaenvio" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Sisorigen" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Sisdestino" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Negocio" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZesCabCon", propOrder = { "idenvio", "fechaenvio", "sisorigen", "sisdestino", "negocio" })
public class ZesCabCon {

    @XmlElement(name = "Idenvio", required = true)
    protected String idenvio;
    @XmlElement(name = "Fechaenvio", required = true)
    protected String fechaenvio;
    @XmlElement(name = "Sisorigen", required = true)
    protected String sisorigen;
    @XmlElement(name = "Sisdestino", required = true)
    protected String sisdestino;
    @XmlElement(name = "Negocio", required = true)
    protected String negocio;

    /**
     * Gets the value of the idenvio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdenvio() {
        return idenvio;
    }

    /**
     * Sets the value of the idenvio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdenvio(String value) {
        this.idenvio = value;
    }

    /**
     * Gets the value of the fechaenvio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaenvio() {
        return fechaenvio;
    }

    /**
     * Sets the value of the fechaenvio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaenvio(String value) {
        this.fechaenvio = value;
    }

    /**
     * Gets the value of the sisorigen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSisorigen() {
        return sisorigen;
    }

    /**
     * Sets the value of the sisorigen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSisorigen(String value) {
        this.sisorigen = value;
    }

    /**
     * Gets the value of the sisdestino property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSisdestino() {
        return sisdestino;
    }

    /**
     * Sets the value of the sisdestino property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSisdestino(String value) {
        this.sisdestino = value;
    }

    /**
     * Gets the value of the negocio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNegocio() {
        return negocio;
    }

    /**
     * Sets the value of the negocio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNegocio(String value) {
        this.negocio = value;
    }

}
