
package cl.clarochile.pdt.esac.serie.ws.impl;

import cl.clarochile.pdt.esac.serie.ws.impl.type.ObjectFactory;
import cl.clarochile.pdt.esac.serie.ws.impl.type.ZesCabCon;
import cl.clarochile.pdt.esac.serie.ws.impl.type.ZesCabRes;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Date;

import javax.ejb.EJB;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import cl.clarochile.pdt.persistencia.PdtEnvio;
import cl.clarochile.pdt.persistencia.PdtPersistFacadeLocal;

@WebService(name = "ZWS_SERIE_ESAC", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_SERIE_ESAC", portName = "ZWS_SERIE_ESAC",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_SERIE_ESAC.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSSERIEESACImpl {

    @EJB
    PdtPersistFacadeLocal pm;

    public ZWSSERIEESACImpl() {
    }

    @RequestWrapper(localName = "ZwsSerieEsac", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.esac.serie.ws.type.ZwsSerieEsac")
    @ResponseWrapper(localName = "ZwsSerieEsacResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.esac.serie.ws.type.ZwsSerieEsacResponse")
    @WebMethod(operationName = "ZwsSerieEsac")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsSerieEsac(@WebParam(name = "ICabCon") ZesCabCon iCabCon,
                                  @WebParam(name = "Idcentroaliado") String idcentroaliado,
                                  @WebParam(name = "Numeroserie") String numeroserie,
                                  @WebParam(name = "Rutsociedad") String rutsociedad,
                                  @WebParam(name = "Sku") String sku) {


        Date now = new Date();
        Timestamp t_now = new Timestamp(now.getTime());
        
        PdtEnvio envio = new PdtEnvio();
        envio.setPdtEstado("OK");
        envio.setPdtFechaActualizacion(t_now);
        envio.setPdtFechaEnvio(t_now);
        envio.setPdtIdEnvio(new BigDecimal(0));
        envio.setPdtMensaje("");
        envio.setPdtNegocio("pdtNegocio");
        envio.setPdtOrigen("pdtOrigen");
        envio.setPdtReintento(new BigDecimal(0));
        envio.setPdtRespuesta("pdtRespuesta");
        envio.setPdtServicio("pdtServicio");
        
        // persistencia
        pm.persistPdtEnvio(envio);

        ZesCabRes res = new ZesCabRes();
        res.setCode("001");
        res.setIdrespuesta("00000000000000000002");
        res.setMessage("Serie se encuentra disponible");
        res.setOperationstatus("OK");
        
        return res;
    }
}
