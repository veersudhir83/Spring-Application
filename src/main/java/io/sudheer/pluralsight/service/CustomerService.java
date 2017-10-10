package io.sudheer.pluralsight.service;

import java.util.List;

import io.sudheer.pluralsight.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}