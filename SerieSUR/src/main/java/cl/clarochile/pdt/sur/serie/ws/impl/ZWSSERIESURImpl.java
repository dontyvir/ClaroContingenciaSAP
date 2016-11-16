package cl.clarochile.pdt.sur.serie.ws.impl;

import cl.clarochile.pdt.sur.serie.ws.type.ObjectFactory;
import cl.clarochile.pdt.sur.serie.ws.type.ZesCabCon;
import cl.clarochile.pdt.sur.serie.ws.type.ZesCabRes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ZWS_SERIE_SUR", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
            serviceName = "ZWS_SERIE_SUR", portName = "ZWS_SERIE_SUR",
            wsdlLocation = "/WEB-INF/wsdl/ZWS_SERIE_SUR.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class ZWSSERIESURImpl {
    public ZWSSERIESURImpl() {
    }

    @RequestWrapper(localName = "ZwsSerieSur", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                    className = "cl.clarochile.pdt.sur.serie.ws.type.ZwsSerieSur")
    @ResponseWrapper(localName = "ZwsSerieSurResponse",
                     targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                     className = "cl.clarochile.pdt.sur.serie.ws.type.ZwsSerieSurResponse")
    @WebMethod(operationName = "ZwsSerieSur")
    @WebResult(name = "ECabRes")
    public ZesCabRes zwsSerieSur(@WebParam(name = "ICabCon") ZesCabCon iCabCon,
                                 @WebParam(name = "Idcentroaliado") String idcentroaliado,
                                 @WebParam(name = "Numeroserie") String numeroserie,
                                 @WebParam(name = "Rutsociedad") String rutsociedad,
                                 @WebParam(name = "Sku") String sku) {
        return null;
    }
}
