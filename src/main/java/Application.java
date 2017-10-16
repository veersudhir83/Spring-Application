import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.sudheer.pluralsight.model.Customer;
import io.sudheer.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = appCtx.getBean("customerService", CustomerService.class);
		System.out.println(customerService);
				
		List<Customer> customerList = new ArrayList<Customer>(customerService.findAll());
		customerList.forEach( customer ->
			System.out.println(customer.getFirstName() + " " + customer.getLastName())
		);
	}

}
