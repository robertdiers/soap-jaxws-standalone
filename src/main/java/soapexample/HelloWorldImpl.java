package soapexample;

import javax.jws.WebService;

@WebService(endpointInterface = "soapexample.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHelloWorld(String content) {
        return "Hello " + content + " !";
    }

}