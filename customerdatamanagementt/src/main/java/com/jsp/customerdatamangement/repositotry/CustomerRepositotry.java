package com.jsp.customerdatamangement.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.customerdatamangement.entity.Customer;

public interface CustomerRepositotry extends JpaRepository<Customer, Integer> {

}
