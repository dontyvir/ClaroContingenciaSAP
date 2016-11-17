
package cl.clarochile.pdt.esac.serie.ws.impl.type;

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
 *         &lt;element name="ECabRes" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZesCabRes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "eCabRes" })
@XmlRootElement(name = "ZwsSerieEsacResponse")
public class ZwsSerieEsacResponse {

    @XmlElement(name = "ECabRes", required = true)
    protected ZesCabRes eCabRes;

    /**
     * Gets the value of the eCabRes property.
     *
     * @return
     * possible object is
     * {@link cl.clarochile.pdt.esac.serie.ws.impl.type.ZesCabRes}
     *
     */
    public ZesCabRes getECabRes() {
        return eCabRes;
    }

    /**
     * Sets the value of the eCabRes property.
     *
     * @param value
     * allowed object is
     * {@link cl.clarochile.pdt.esac.serie.ws.impl.type.ZesCabRes}
     *
     */
    public void setECabRes(ZesCabRes value) {
        this.eCabRes = value;
    }

}
