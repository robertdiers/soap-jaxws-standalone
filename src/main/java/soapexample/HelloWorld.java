package soapexample;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface HelloWorld {
    @WebMethod
    String sayHelloWorld(String content);
}