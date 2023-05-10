package com.jsp.customerdatamangement.repositotry;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.customerdatamangement.entity.Customer;

@Repository
public class CustomerDAO {

	@Autowired
	private  CustomerRepositotry repositotry;
	
	public Customer  savecustomer(Customer customer) 
	{
		return repositotry.save(customer);
	}
	
	public List<Customer> GetAllCustomerDeatils() 
	{
		return repositotry.findAll();
	}
	
	public Customer GetcustomerDataById(int id) 
	{
		return repositotry.findById(id).
				orElse(new Customer(HttpStatus.NOT_FOUND.value()
						,HttpStatus.NOT_FOUND.name()
						,HttpStatus.NOT_FOUND.name()));
	}
	public Customer deleteCustomerByid(int id) 
	{
		Customer customer = GetcustomerDataById(id);
		if(customer.getId()!=404)
		{
		 repositotry.deleteById(id);
		}
		return customer;
	}
}
