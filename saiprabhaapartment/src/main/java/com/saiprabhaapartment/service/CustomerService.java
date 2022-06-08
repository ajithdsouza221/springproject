package com.saiprabhaapartment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saiprabhaapartment.dto.CustomerDTO;
import com.saiprabhaapartment.entity.Customer;
import com.saiprabhaapartment.repository.CustomerRepo;

@Service
public class CustomerService {

	
	@Autowired
	CustomerRepo custRepo;

	public CustomerDTO savecustdetails(CustomerDTO cdto) {

		Customer c =CustomerDTO.converiondtoentity(cdto);
		custRepo.save(c);
		return cdto;
	}

	public List<CustomerDTO> getall() {
	
		List<Customer> c=custRepo.findAll();
		List<CustomerDTO> cdto=CustomerDTO.copy(c);
		return cdto;
	}

	public CustomerDTO updatecust(String aid, CustomerDTO custdto) {

		Customer cust=custRepo.getById(aid);
		cust=CustomerDTO.converiondtoentity(custdto);
		custRepo.save(cust);
		return custdto;
	}

	public Boolean deletbyidd(String aid) {
	try {	
		custRepo.deleteById(aid);
	return true;
		
	} catch (Exception e) {
		return false;
	}
	
	}
	
	
}
