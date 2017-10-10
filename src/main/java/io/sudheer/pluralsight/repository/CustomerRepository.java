package io.sudheer.pluralsight.repository;

import java.util.List;

import io.sudheer.pluralsight.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}