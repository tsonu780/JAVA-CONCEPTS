package com.practice.loanApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.loanApp.entity.Customer;
import com.practice.loanApp.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer cx) {
		return customerService.addCustomer(cx);
	}
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		List<Customer> customers = customerService.getAllCustomer();
		return customers;
	}
}
