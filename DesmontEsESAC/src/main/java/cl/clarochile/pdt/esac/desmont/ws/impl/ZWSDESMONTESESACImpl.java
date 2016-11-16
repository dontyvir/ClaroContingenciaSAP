package cl.clarochile.pdt.esac.desmont.ws.impl;

import cl.clarochile.pdt.esac.desmont.ws.type.ObjectFactory;
import cl.clarochile.pdt.esac.desmont.ws.type.ZesCabCon;
import cl.clarochile.pdt.esac.desmont.ws.type.ZesCabRes;

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
        
        ZesCabRes res = new ZesCabRes();
        res.setCode("001");
        res.setIdrespuesta("00000000000000000002");
        res.setMessage("Serie se encuentra disponible");
        res.setOperationstatus("OK");
        
        return res;
    }
}
