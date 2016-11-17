package cl.clarochile.pdt.esac.desmont.ws.impl;

import cl.clarochile.pdt.esac.desmont.ws.impl.type.ObjectFactory;
import cl.clarochile.pdt.esac.desmont.ws.impl.type.ZesCabCon;
import cl.clarochile.pdt.esac.desmont.ws.impl.type.ZesCabRes;

import cl.clarochile.pdt.persistencia.PdtEnvio;

import cl.clarochile.pdt.persistencia.PdtPersistFacadeLocal;

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

@WebService(name = "ZWS_DESMONT_ES_ESAC", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_DESMONT_ES_ESAC", portName = "ZWS_DESMONT_ES_ESAC",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_DESMONT_ES_ESAC.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSDESMONTESESACImpl {
    
    @EJB
    PdtPersistFacadeLocal pm;
    
    public ZWSDESMONTESESACImpl() {
    }

    @RequestWrapper(localName = "ZwsDesmontEsEsac",
                    targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.esac.desmont.ws.type.ZwsDesmontEsEsac")
    @ResponseWrapper(localName = "ZwsDesmontEsEsacResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.esac.desmont.ws.type.ZwsDesmontEsEsacResponse")
    @WebMethod(operationName = "ZwsDesmontEsEsac")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsDesmontEsEsac(@WebParam(name = "Estadoequipo") String estadoequipo,
                                      @WebParam(name = "Fechainstalacion") String fechainstalacion,
                                      @WebParam(name = "ICabCon") ZesCabCon iCabCon,
                                      @WebParam(name = "Idcentroaliado") String idcentroaliado,
                                      @WebParam(name = "Idordenlegado") String idordenlegado,
                                      @WebParam(name = "Mac") String mac,
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
