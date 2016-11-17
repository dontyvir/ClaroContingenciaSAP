
package cl.clarochile.pdt.esac.desmont.ws.impl.type;

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
 *         &lt;element name="Estadoequipo" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Fechainstalacion" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ICabCon" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZesCabCon"/&gt;
 *         &lt;element name="Idcentroaliado" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Idordenlegado" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Mac" type="{urn:sap-com:document:sap:rfc:functions}char18" minOccurs="0"/&gt;
 *         &lt;element name="Numeroserie" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Rutsociedad" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Sku" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
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
         { "estadoequipo", "fechainstalacion", "iCabCon", "idcentroaliado", "idordenlegado", "mac", "numeroserie",
           "rutsociedad", "sku"
    })
@XmlRootElement(name = "ZwsDesmontEsEsac")
public class ZwsDesmontEsEsac {

    @XmlElement(name = "Estadoequipo", required = true)
    protected String estadoequipo;
    @XmlElement(name = "Fechainstalacion", required = true)
    protected String fechainstalacion;
    @XmlElement(name = "ICabCon", required = true)
    protected ZesCabCon iCabCon;
    @XmlElement(name = "Idcentroaliado", required = true)
    protected String idcentroaliado;
    @XmlElement(name = "Idordenlegado", required = true)
    protected String idordenlegado;
    @XmlElement(name = "Mac")
    protected String mac;
    @XmlElement(name = "Numeroserie", required = true)
    protected String numeroserie;
    @XmlElement(name = "Rutsociedad", required = true)
    protected String rutsociedad;
    @XmlElement(name = "Sku", required = true)
    protected String sku;

    /**
     * Gets the value of the estadoequipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstadoequipo() {
        return estadoequipo;
    }

    /**
     * Sets the value of the estadoequipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstadoequipo(String value) {
        this.estadoequipo = value;
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
     * {@link cl.clarochile.pdt.esac.desmont.ws.impl.type.ZesCabCon}
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
     * {@link cl.clarochile.pdt.esac.desmont.ws.impl.type.ZesCabCon}
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
     * Gets the value of the mac property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMac(String value) {
        this.mac = value;
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

}
