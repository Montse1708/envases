package org.generation.app.entity.customer;

import java.util.List;

import org.generation.app.entity.Customer;
import org.generation.app.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class CustomerRestController {
//	@Autowired
//		ICustomerRepository customerRepository;
//	
//	@GetMapping("/customers") //localhost:puerto/customers
//	public List<Customer> customers(){
//		return customerService.findAllCustomers(); 
//	}
	@GetMapping("/customers/{id}")
	public Customer customerById(@PathVariable Long id) {		
		return customerService.findCustomerById(id);
	}

}
