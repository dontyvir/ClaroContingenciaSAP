
package cl.clarochile.pdt.sur.msmont.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "ZWS_MS_MONT_SUR", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style",
                  wsdlLocation =
                  "http://localhost:8088/ZWS_MS_MONT_SUR/#%7Burn%3Asap-com%3Adocument%3Asap%3Asoap%3Afunctions%3Amc-style%7DZWS_MS_MONT_SUR?wsdl")
public class ZWSMSMONTSUR_Service extends Service {

    private final static URL ZWSMSMONTSUR_WSDL_LOCATION;
    private final static WebServiceException ZWSMSMONTSUR_EXCEPTION;
    private final static QName ZWSMSMONTSUR_QNAME =
        new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZWS_MS_MONT_SUR");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://localhost:8088/ZWS_MS_MONT_SUR/#%7Burn%3Asap-com%3Adocument%3Asap%3Asoap%3Afunctions%3Amc-style%7DZWS_MS_MONT_SUR?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZWSMSMONTSUR_WSDL_LOCATION = url;
        ZWSMSMONTSUR_EXCEPTION = e;
    }

    public ZWSMSMONTSUR_Service() {
        super(__getWsdlLocation(), ZWSMSMONTSUR_QNAME);
    }

    public ZWSMSMONTSUR_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZWSMSMONTSUR_QNAME, features);
    }

    public ZWSMSMONTSUR_Service(URL wsdlLocation) {
        super(wsdlLocation, ZWSMSMONTSUR_QNAME);
    }

    public ZWSMSMONTSUR_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZWSMSMONTSUR_QNAME, features);
    }

    public ZWSMSMONTSUR_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZWSMSMONTSUR_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ZWSMSMONTSUR
     */
    @WebEndpoint(name = "ZWS_MS_MONT_SUR")
    public ZWSMSMONTSUR getZWSMSMONTSUR() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZWS_MS_MONT_SUR"),
                             ZWSMSMONTSUR.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZWSMSMONTSUR
     */
    @WebEndpoint(name = "ZWS_MS_MONT_SUR")
    public ZWSMSMONTSUR getZWSMSMONTSUR(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZWS_MS_MONT_SUR"),
                             ZWSMSMONTSUR.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZWSMSMONTSUR_EXCEPTION != null) {
            throw ZWSMSMONTSUR_EXCEPTION;
        }
        return ZWSMSMONTSUR_WSDL_LOCATION;
    }

}
