package com.jsp.customerdatamangement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.customerdatamangement.entity.Customer;
import com.jsp.customerdatamangement.repositotry.CustomerDAO;
import com.jsp.customerdatamangement.repositotry.CustomerRepositotry;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepositotry repositotry;
	
	@Autowired
	private CustomerDAO dao;
	
	
	public Customer savCustomer(Customer customer)
	{
		return repositotry.save(customer);
	}
	
	
	public Customer UpdateCustomer(Customer customer) 
	{
		return dao.savecustomer(customer);
	}
	
	public List<Customer> GetAllCustomerdeatils(Customer customer) 
	{
		return dao.GetAllCustomerDeatils();
	}
	
	public Customer getCustomerDatabyid(Integer id) 
	{
		return dao.GetcustomerDataById(id);
	}
	
	public Customer deleteCustomerById(int id) 
	{
		return dao.deleteCustomerByid(id);
	}
	
	
	
}
