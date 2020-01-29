package ee.jaxws.example;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloWorldExample {
    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/sayHelloWorld", new HelloWorldExample());
    }

}
