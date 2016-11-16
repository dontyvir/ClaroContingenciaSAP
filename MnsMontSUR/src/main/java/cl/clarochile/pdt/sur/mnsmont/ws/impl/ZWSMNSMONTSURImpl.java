package cl.clarochile.pdt.sur.mnsmont.ws.impl;

import cl.clarochile.pdt.sur.mnsmont.ws.type.ObjectFactory;
import cl.clarochile.pdt.sur.mnsmont.ws.type.ZesCabCon;
import cl.clarochile.pdt.sur.mnsmont.ws.type.ZesCabRes;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ZWS_MNS_MONT_SUR", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_MNS_MONT_SUR", portName = "ZWS_MNS_MONT_SUR",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_MNS_MONT_SUR.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSMNSMONTSURImpl {
    public ZWSMNSMONTSURImpl() {
    }

    @RequestWrapper(localName = "ZwsMnsMontSur", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.sur.mnsmont.ws.type.ZwsMnsMontSur")
    @ResponseWrapper(localName = "ZwsMnsMontSurResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.sur.mnsmont.ws.type.ZwsMnsMontSurResponse")
    @WebMethod(operationName = "ZwsMnsMontSur")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsMnsMontSur(@WebParam(name = "Cantidad") BigDecimal cantidad,
                                   @WebParam(name = "Fechainstalacion") String fechainstalacion,
                                   @WebParam(name = "ICabCon") ZesCabCon iCabCon,
                                   @WebParam(name = "Idcentroaliado") String idcentroaliado,
                                   @WebParam(name = "Idordenlegado") String idordenlegado,
                                   @WebParam(name = "Nodo") String nodo,
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
