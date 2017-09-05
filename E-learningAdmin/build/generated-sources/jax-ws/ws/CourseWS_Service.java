
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
@WebServiceClient(name = "CourseWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/CourseWS/CourseWS?wsdl")
public class CourseWS_Service
    extends Service
{

    private final static URL COURSEWS_WSDL_LOCATION;
    private final static WebServiceException COURSEWS_EXCEPTION;
    private final static QName COURSEWS_QNAME = new QName("http://ws/", "CourseWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CourseWS/CourseWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COURSEWS_WSDL_LOCATION = url;
        COURSEWS_EXCEPTION = e;
    }

    public CourseWS_Service() {
        super(__getWsdlLocation(), COURSEWS_QNAME);
    }

    public CourseWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COURSEWS_QNAME, features);
    }

    public CourseWS_Service(URL wsdlLocation) {
        super(wsdlLocation, COURSEWS_QNAME);
    }

    public CourseWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COURSEWS_QNAME, features);
    }

    public CourseWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CourseWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CourseWS
     */
    @WebEndpoint(name = "CourseWSPort")
    public CourseWS getCourseWSPort() {
        return super.getPort(new QName("http://ws/", "CourseWSPort"), CourseWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CourseWS
     */
    @WebEndpoint(name = "CourseWSPort")
    public CourseWS getCourseWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "CourseWSPort"), CourseWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COURSEWS_EXCEPTION!= null) {
            throw COURSEWS_EXCEPTION;
        }
        return COURSEWS_WSDL_LOCATION;
    }

}
