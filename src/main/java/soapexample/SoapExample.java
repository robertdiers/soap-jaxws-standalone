package soapexample;

import javax.xml.ws.Endpoint;

public class SoapExample {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/ws/helloworld", new HelloWorldImpl());
        System.out.println("Service is running");
    }   

}