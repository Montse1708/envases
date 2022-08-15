package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Customer;
import org.generation.app.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImp implements ICustomerService {
	
	@Autowired
	ICustomerRepository customerRepository;

	@Override
	public List<Customer> findAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(Long Id) {
		customerRepository.deleteById(Id);
	}

	@Override
	public Customer findCustomerById(Long Id) {
		return customerRepository.findById(Id).orElse(null);
	}

}
