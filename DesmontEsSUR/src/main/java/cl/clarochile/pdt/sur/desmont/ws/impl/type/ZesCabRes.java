
package cl.clarochile.pdt.sur.desmont.ws.impl.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZesCabRes complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ZesCabRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Idrespuesta" type="{urn:sap-com:document:sap:rfc:functions}numeric20"/&gt;
 *         &lt;element name="Operationstatus" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Code" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="Message" type="{urn:sap-com:document:sap:rfc:functions}char255"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZesCabRes", propOrder = { "idrespuesta", "operationstatus", "code", "message" })
public class ZesCabRes {

    @XmlElement(name = "Idrespuesta", required = true)
    protected String idrespuesta;
    @XmlElement(name = "Operationstatus", required = true)
    protected String operationstatus;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Message", required = true)
    protected String message;

    /**
     * Gets the value of the idrespuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdrespuesta() {
        return idrespuesta;
    }

    /**
     * Sets the value of the idrespuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdrespuesta(String value) {
        this.idrespuesta = value;
    }

    /**
     * Gets the value of the operationstatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperationstatus() {
        return operationstatus;
    }

    /**
     * Sets the value of the operationstatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperationstatus(String value) {
        this.operationstatus = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
