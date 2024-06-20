package com.practice.loanApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.loanApp.entity.Customer;
import com.practice.loanApp.repo.CustomerRepo;


@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer addCustomer(Customer cx) {
		return customerRepo.save(cx);
	}
	
	public List<Customer> getAllCustomer() {
		List<Customer> customers = customerRepo.findAll();
		return customers;
	}
}
