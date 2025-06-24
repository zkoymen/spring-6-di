package guru.springframework.spring6di.services;


import org.springframework.stereotype.Service;


// Provide Service name specifically
@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements  GreetingService{

    @Override
    public String sayGreeting() {
        return "Setter of the Greeting!!";
    }
}
