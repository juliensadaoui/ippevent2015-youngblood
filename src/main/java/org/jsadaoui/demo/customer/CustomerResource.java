package org.jsadaoui.demo.customer;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerResource {

	@Autowired
	private CustomerRepository jdbcCustomerRepository;
	
	@Autowired
	@Qualifier("hibernate")
	private CustomerRepository hibernateCustomerRepository;
	
	@Autowired
	@Qualifier("jpa")
	private CustomerRepository jpaCustomerRepository;
	
	@Autowired
	private Map<String, CustomerRepository> maps;

	@RequestMapping("/jdbc") 
	public String jdbc() {
		return "repository:" + jdbcCustomerRepository;
	}
	
	@RequestMapping("/hibernate") 
	public String hibernate() {
		return "repository:" + hibernateCustomerRepository;
	}

	@RequestMapping("/jpa")
	public String jpa() {
		return "repository:" + jpaCustomerRepository;
	}
}
