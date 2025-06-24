package zeyzey.spring_6_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zeyzey.spring_6_di.controllers.MyController;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());
	}

}
