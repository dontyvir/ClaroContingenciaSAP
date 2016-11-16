package cl.clarochile.pdt.sur.desmont.ws.impl;

import cl.clarochile.pdt.sur.desmont.ws.type.ObjectFactory;
import cl.clarochile.pdt.sur.desmont.ws.type.ZesCabCon;
import cl.clarochile.pdt.sur.desmont.ws.type.ZesCabRes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ZWS_DESMONT_ES_SUR", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_DESMONT_ES_SUR", portName = "ZWS_DESMONT_ES_SUR",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_DESMONT_ES_SUR.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSDESMONTESSURImpl {
    public ZWSDESMONTESSURImpl() {
    }

    @RequestWrapper(localName = "ZwsDesmontEsSur", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.sur.desmont.ws.type.ZwsDesmontEsSur")
    @ResponseWrapper(localName = "ZwsDesmontEsSurResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.sur.desmont.ws.type.ZwsDesmontEsSurResponse")
    @WebMethod(operationName = "ZwsDesmontEsSur")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsDesmontEsSur(@WebParam(name = "Estadoequipo") String estadoequipo,
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
