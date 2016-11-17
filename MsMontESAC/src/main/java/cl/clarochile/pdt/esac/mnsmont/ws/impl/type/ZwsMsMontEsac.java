
package cl.clarochile.pdt.esac.mnsmont.ws.impl.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comuna" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Contratocliente" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Fechainstalacion" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ICabCon" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZesCabCon"/&gt;
 *         &lt;element name="Idcentroaliado" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Idordenlegado" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Numeroserie" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Pais" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Razonsocial" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Region" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Rutcliente" type="{urn:sap-com:document:sap:rfc:functions}char9"/&gt;
 *         &lt;element name="Rutsociedad" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Sku" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Tipocliente" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder =
         { "comuna", "contratocliente", "fechainstalacion", "iCabCon", "idcentroaliado", "idordenlegado", "numeroserie",
           "pais", "razonsocial", "region", "rutcliente", "rutsociedad", "sku", "tipocliente"
    })
@XmlRootElement(name = "ZwsMsMontEsac")
public class ZwsMsMontEsac {

    @XmlElement(name = "Comuna", required = true)
    protected String comuna;
    @XmlElement(name = "Contratocliente", required = true)
    protected String contratocliente;
    @XmlElement(name = "Fechainstalacion", required = true)
    protected String fechainstalacion;
    @XmlElement(name = "ICabCon", required = true)
    protected ZesCabCon iCabCon;
    @XmlElement(name = "Idcentroaliado", required = true)
    protected String idcentroaliado;
    @XmlElement(name = "Idordenlegado", required = true)
    protected String idordenlegado;
    @XmlElement(name = "Numeroserie", required = true)
    protected String numeroserie;
    @XmlElement(name = "Pais", required = true)
    protected String pais;
    @XmlElement(name = "Razonsocial", required = true)
    protected String razonsocial;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "Rutcliente", required = true)
    protected String rutcliente;
    @XmlElement(name = "Rutsociedad", required = true)
    protected String rutsociedad;
    @XmlElement(name = "Sku", required = true)
    protected String sku;
    @XmlElement(name = "Tipocliente", required = true)
    protected String tipocliente;

    /**
     * Gets the value of the comuna property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Sets the value of the comuna property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComuna(String value) {
        this.comuna = value;
    }

    /**
     * Gets the value of the contratocliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContratocliente() {
        return contratocliente;
    }

    /**
     * Sets the value of the contratocliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContratocliente(String value) {
        this.contratocliente = value;
    }

    /**
     * Gets the value of the fechainstalacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechainstalacion() {
        return fechainstalacion;
    }

    /**
     * Sets the value of the fechainstalacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechainstalacion(String value) {
        this.fechainstalacion = value;
    }

    /**
     * Gets the value of the iCabCon property.
     *
     * @return
     * possible object is
     * {@link cl.clarochile.pdt.esac.mnsmont.ws.impl.type.ZesCabCon}
     *
     */
    public ZesCabCon getICabCon() {
        return iCabCon;
    }

    /**
     * Sets the value of the iCabCon property.
     *
     * @param value
     * allowed object is
     * {@link cl.clarochile.pdt.esac.mnsmont.ws.impl.type.ZesCabCon}
     *
     */
    public void setICabCon(ZesCabCon value) {
        this.iCabCon = value;
    }

    /**
     * Gets the value of the idcentroaliado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdcentroaliado() {
        return idcentroaliado;
    }

    /**
     * Sets the value of the idcentroaliado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdcentroaliado(String value) {
        this.idcentroaliado = value;
    }

    /**
     * Gets the value of the idordenlegado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdordenlegado() {
        return idordenlegado;
    }

    /**
     * Sets the value of the idordenlegado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdordenlegado(String value) {
        this.idordenlegado = value;
    }

    /**
     * Gets the value of the numeroserie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroserie() {
        return numeroserie;
    }

    /**
     * Sets the value of the numeroserie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroserie(String value) {
        this.numeroserie = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the razonsocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRazonsocial() {
        return razonsocial;
    }

    /**
     * Sets the value of the razonsocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRazonsocial(String value) {
        this.razonsocial = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the rutcliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRutcliente() {
        return rutcliente;
    }

    /**
     * Sets the value of the rutcliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRutcliente(String value) {
        this.rutcliente = value;
    }

    /**
     * Gets the value of the rutsociedad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRutsociedad() {
        return rutsociedad;
    }

    /**
     * Sets the value of the rutsociedad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRutsociedad(String value) {
        this.rutsociedad = value;
    }

    /**
     * Gets the value of the sku property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the tipocliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipocliente() {
        return tipocliente;
    }

    /**
     * Sets the value of the tipocliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipocliente(String value) {
        this.tipocliente = value;
    }

}
