package io.sudheer.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import io.sudheer.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see io.sudheer.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Sudheer");
		customer.setLastName("Veeravalli");
		customers.add(customer);
		
		return customers;
	}
}
