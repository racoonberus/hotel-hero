
package com.gfb.hotelHero.ddengi;

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
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ddengiService", targetNamespace = "urn:ddengi", wsdlLocation = "file:/home/goforbroke/IdeaProjects/hotel-hero/src/wsdl/ddengi.wsdl")
public class DdengiService
    extends Service
{

    private final static URL DDENGISERVICE_WSDL_LOCATION;
    private final static WebServiceException DDENGISERVICE_EXCEPTION;
    private final static QName DDENGISERVICE_QNAME = new QName("urn:ddengi", "ddengiService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/goforbroke/IdeaProjects/hotel-hero/src/wsdl/ddengi.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DDENGISERVICE_WSDL_LOCATION = url;
        DDENGISERVICE_EXCEPTION = e;
    }

    public DdengiService() {
        super(__getWsdlLocation(), DDENGISERVICE_QNAME);
    }

    public DdengiService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DDENGISERVICE_QNAME, features);
    }

    public DdengiService(URL wsdlLocation) {
        super(wsdlLocation, DDENGISERVICE_QNAME);
    }

    public DdengiService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DDENGISERVICE_QNAME, features);
    }

    public DdengiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DdengiService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SoapPortType
     */
    @WebEndpoint(name = "SoapPort")
    public SoapPortType getSoapPort() {
        return super.getPort(new QName("urn:ddengi", "SoapPort"), SoapPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapPortType
     */
    @WebEndpoint(name = "SoapPort")
    public SoapPortType getSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ddengi", "SoapPort"), SoapPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DDENGISERVICE_EXCEPTION!= null) {
            throw DDENGISERVICE_EXCEPTION;
        }
        return DDENGISERVICE_WSDL_LOCATION;
    }

}