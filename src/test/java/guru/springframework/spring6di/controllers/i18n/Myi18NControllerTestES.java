package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("ES")
@SpringBootTest
class Myi18NControllerTestES {

    // Create the controller instance auto
    @Autowired
    Myi18NController myi18NController;



    @Test
    void sayHello() {
        System.out.println(myi18NController.sayHello());
    }
}