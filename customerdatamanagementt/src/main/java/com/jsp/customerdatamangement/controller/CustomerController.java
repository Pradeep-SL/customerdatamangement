package com.jsp.customerdatamangement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.customerdatamangement.entity.Customer;
import com.jsp.customerdatamangement.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public @ResponseBody Customer saveCustomer(@RequestBody Customer customer)
	{
		return service.savCustomer(customer);
		
	}
	
	@PutMapping("/customer") // which is used fot update the data
	public @ResponseBody Customer updateCustomer(@RequestBody Customer customer) 
	{
		return service.UpdateCustomer(customer);
	}
	
	@GetMapping("/GetAllcustomerDeatils")
	public @ResponseBody List<Customer> GetAllcustomerDeatils(@RequestBody Customer customer)
	{
		return service.GetAllCustomerdeatils(customer);
	}
	
	@GetMapping("/customer/{id}")
	public @ResponseBody Customer GetDatacustomerById(@PathVariable("id")int  id )
	{
		return service.getCustomerDatabyid(id);
	}
	
	
	@DeleteMapping("/customer")
	public @ResponseBody Customer deleteCustomnerByid(@RequestParam("id")int  id )
	{
		return service.deleteCustomerById(id);
	}
	
	
}
