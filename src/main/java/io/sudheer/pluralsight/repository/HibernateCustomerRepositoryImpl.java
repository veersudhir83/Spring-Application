package io.sudheer.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import io.sudheer.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUserName}")
	private String dbUserName;

	/* (non-Javadoc)
	 * @see io.sudheer.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		System.out.println("DB User Name: " + dbUserName);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Sudheer");
		customer.setLastName("Veeravalli");
		customers.add(customer);
		
		return customers;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
}
