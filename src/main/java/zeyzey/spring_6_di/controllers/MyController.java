package zeyzey.spring_6_di.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("I am in the controller!!!");

        return "Hello Everyone !!";
    }
}
