
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package de.tum.in.dss.world;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.6.8
 * 2013-12-17T17:11:11.733+01:00
 * Generated source version: 2.6.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "serviceWorld",
                      portName = "heloWorldPort",
                      targetNamespace = "http://dss.in.tum.de/world",
                      wsdlLocation = "file:/D:/work/wsc_gh/l6/CXFWebDemo/src/main/resources/demo.wsdl",
                      endpointInterface = "de.tum.in.dss.world.IHelloWorld")
                      
public class IHelloWorldImpl implements IHelloWorld {

    private static final Logger LOG = Logger.getLogger(IHelloWorldImpl.class.getName());

    /* (non-Javadoc)
     * @see de.tum.in.dss.world.IHelloWorld#sayHello(int  value )*
     */
    public void sayHello(int value) { 
        LOG.info("Executing operation sayHello");
        System.out.println(value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
