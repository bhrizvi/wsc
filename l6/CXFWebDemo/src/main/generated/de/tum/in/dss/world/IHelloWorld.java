package de.tum.in.dss.world;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.6.8
 * 2013-06-02T14:43:16.460+02:00
 * Generated source version: 2.6.8
 * 
 */
@WebService(targetNamespace = "http://dss.in.tum.de/world", name = "IHelloWorld")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHelloWorld {

    @WebMethod
    public void sayHello(
        @WebParam(partName = "value", name = "value")
        int value
    );
}
