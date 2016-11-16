package cl.clarochile.pdt.sur.msmont.ws.impl;

import cl.clarochile.pdt.sur.msmont.ws.impl.type.ObjectFactory;
import cl.clarochile.pdt.sur.msmont.ws.impl.type.ZesCabCon;
import cl.clarochile.pdt.sur.msmont.ws.impl.type.ZesCabRes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ZWS_MS_MONT_SUR", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_MS_MONT_SUR", portName = "ZWS_MS_MONT_SUR",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_MS_MONT_SUR.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSMSMONTSURImpl {
    public ZWSMSMONTSURImpl() {
    }

    @RequestWrapper(localName = "ZwsMsMontSur", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.sur.msmont.ws.impl.type.ZwsMsMontSur")
    @ResponseWrapper(localName = "ZwsMsMontSurResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.sur.msmont.ws.impl.type.ZwsMsMontSurResponse")
    @WebMethod(operationName = "ZwsMsMontSur")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsMsMontSur(@WebParam(name = "Comuna") String comuna,
                                  @WebParam(name = "Contratocliente") String contratocliente,
                                  @WebParam(name = "Fechainstalacion") String fechainstalacion,
                                  @WebParam(name = "ICabCon") ZesCabCon iCabCon,
                                  @WebParam(name = "Idcentroaliado") String idcentroaliado,
                                  @WebParam(name = "Idordenlegado") String idordenlegado,
                                  @WebParam(name = "Nodo") String nodo,
                                  @WebParam(name = "Numeroserie") String numeroserie,
                                  @WebParam(name = "Pais") String pais,
                                  @WebParam(name = "Razonsocial") String razonsocial,
                                  @WebParam(name = "Region") String region,
                                  @WebParam(name = "Rutcliente") String rutcliente,
                                  @WebParam(name = "Rutsociedad") String rutsociedad,
                                  @WebParam(name = "Sku") String sku,
                                  @WebParam(name = "Tipocliente") String tipocliente) {
        return null;
    }
}
