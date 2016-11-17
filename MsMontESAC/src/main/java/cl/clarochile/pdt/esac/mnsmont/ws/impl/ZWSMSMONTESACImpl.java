package cl.clarochile.pdt.esac.mnsmont.ws.impl;

import cl.clarochile.pdt.esac.mnsmont.ws.impl.type.ObjectFactory;
import cl.clarochile.pdt.esac.mnsmont.ws.impl.type.ZesCabCon;
import cl.clarochile.pdt.esac.mnsmont.ws.impl.type.ZesCabRes;

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

@WebService(name = "ZWS_MS_MONT_ESAC", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_MS_MONT_ESAC", portName = "ZWS_MS_MONT_ESAC",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_MS_MONT_ESAC.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSMSMONTESACImpl {
    
    @EJB
    PdtPersistFacadeLocal pm;
    
    public ZWSMSMONTESACImpl() {
    }

    @RequestWrapper(localName = "ZwsMsMontEsac", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.esac.mnsmont.ws.type.ZwsMsMontEsac")
    @ResponseWrapper(localName = "ZwsMsMontEsacResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.esac.mnsmont.ws.type.ZwsMsMontEsacResponse")
    @WebMethod(operationName = "ZwsMsMontEsac")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsMsMontEsac(@WebParam(name = "Comuna") String comuna,
                                   @WebParam(name = "Contratocliente") String contratocliente,
                                   @WebParam(name = "Fechainstalacion") String fechainstalacion,
                                   @WebParam(name = "ICabCon") ZesCabCon iCabCon,
                                   @WebParam(name = "Idcentroaliado") String idcentroaliado,
                                   @WebParam(name = "Idordenlegado") String idordenlegado,
                                   @WebParam(name = "Numeroserie") String numeroserie,
                                   @WebParam(name = "Pais") String pais,
                                   @WebParam(name = "Razonsocial") String razonsocial,
                                   @WebParam(name = "Region") String region,
                                   @WebParam(name = "Rutcliente") String rutcliente,
                                   @WebParam(name = "Rutsociedad") String rutsociedad,
                                   @WebParam(name = "Sku") String sku,
                                   @WebParam(name = "Tipocliente") String tipocliente) {
        
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
