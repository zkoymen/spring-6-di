package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


// To eliminate conflict add GreetingService chosen bean too
@ActiveProfiles({"uat", "ES"})
@SpringBootTest
class EnvironmentControllerTest {


    // No need to add private here
    @Autowired
    EnvironmentController environmentController;


    @Test
    void getEnvironment() {

        System.out.println(environmentController.getEnvironment());
    }
}