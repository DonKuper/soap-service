package ee.jaxws.example;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "ee.jaxws.example.HelloWorldExample")
public class HelloWorldExampleImpl implements HelloWorldExample{
    public String sayHello(String text) {
        return "Hello World " + text;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/sayHelloWorld", new HelloWorldExampleImpl());
    }

}
