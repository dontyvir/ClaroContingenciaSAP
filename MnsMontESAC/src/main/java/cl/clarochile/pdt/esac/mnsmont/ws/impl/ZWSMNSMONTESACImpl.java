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

@WebService(name = "ZWS_MNS_MONT_ESAC", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_MNS_MONT_ESAC", portName = "ZWS_MNS_MONT_ESAC",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_MNS_MONT_ESAC.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSMNSMONTESACImpl {
    
    @EJB
    PdtPersistFacadeLocal pm;
    
    public ZWSMNSMONTESACImpl() {
    }

    @RequestWrapper(localName = "ZwsMnsMontEsac", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.esac.mnsmont.ws.type.ZwsMnsMontEsac")
    @ResponseWrapper(localName = "ZwsMnsMontEsacResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.esac.mnsmont.ws.type.ZwsMnsMontEsacResponse")
    @WebMethod(operationName = "ZwsMnsMontEsac")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsMnsMontEsac(@WebParam(name = "Cantidad") BigDecimal cantidad,
                                    @WebParam(name = "Fechainstalacion") String fechainstalacion,
                                    @WebParam(name = "ICabCon") ZesCabCon iCabCon,
                                    @WebParam(name = "Idcentroaliado") String idcentroaliado,
                                    @WebParam(name = "Idordenlegado") String idordenlegado,
                                    @WebParam(name = "Nodo") String nodo,
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
