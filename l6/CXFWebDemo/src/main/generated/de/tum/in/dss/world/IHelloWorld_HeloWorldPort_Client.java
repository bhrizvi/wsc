
package de.tum.in.dss.world;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

/**
 * This class was generated by Apache CXF 2.2.3
 * Sun Jun 02 02:09:34 CEST 2013
 * Generated source version: 2.2.3
 * 
 */

public final class IHelloWorld_HeloWorldPort_Client {

    private static final QName SERVICE_NAME = new QName("http://dss.in.tum.de/world", "serviceWorld");

    private IHelloWorld_HeloWorldPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ServiceWorld.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ServiceWorld ss = new ServiceWorld(wsdlURL, SERVICE_NAME);
        IHelloWorld port = ss.getHeloWorldPort();  
        
        {
        System.out.println("Invoking sayHello...");
        int _sayHello_value = 0;
        port.sayHello(_sayHello_value);


        }

        System.exit(0);
    }

}
