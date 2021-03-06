
package ws;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExamWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/ExamWS/ExamWS?wsdl")
public class ExamWS_Service
    extends Service
{

    private final static URL EXAMWS_WSDL_LOCATION;
    private final static WebServiceException EXAMWS_EXCEPTION;
    private final static QName EXAMWS_QNAME = new QName("http://ws/", "ExamWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ExamWS/ExamWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXAMWS_WSDL_LOCATION = url;
        EXAMWS_EXCEPTION = e;
    }

    public ExamWS_Service() {
        super(__getWsdlLocation(), EXAMWS_QNAME);
    }

    public ExamWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXAMWS_QNAME, features);
    }

    public ExamWS_Service(URL wsdlLocation) {
        super(wsdlLocation, EXAMWS_QNAME);
    }

    public ExamWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXAMWS_QNAME, features);
    }

    public ExamWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExamWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExamWS
     */
    @WebEndpoint(name = "ExamWSPort")
    public ExamWS getExamWSPort() {
        return super.getPort(new QName("http://ws/", "ExamWSPort"), ExamWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExamWS
     */
    @WebEndpoint(name = "ExamWSPort")
    public ExamWS getExamWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "ExamWSPort"), ExamWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXAMWS_EXCEPTION!= null) {
            throw EXAMWS_EXCEPTION;
        }
        return EXAMWS_WSDL_LOCATION;
    }

}
