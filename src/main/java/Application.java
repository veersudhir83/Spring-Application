import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.sudheer.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = appCtx.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstName() + " " + 
				customerService.findAll().get(0).getLastName());
	}

}
