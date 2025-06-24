package guru.springframework.spring6di.controllers;

/**
 *
 * Other controller types would be PropertyInjectedController and SetterInjectedController and ConstructorInjectedController
 * Setter and property injection w/o using Spring framework would have problems as in forgetting to initialize the setter and getting null pointer
 * Also using the Impl instead of interface is un-flexible
 *
 * **/


import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am in the controller!!!");

        return greetingService.sayGreeting();
    }
}
