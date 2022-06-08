package com.saiprabhaapartment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saiprabhaapartment.dto.CustomerDTO;
import com.saiprabhaapartment.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService custserv;

	@PostMapping("/saveall")
	public CustomerDTO savecustdetails(@RequestBody CustomerDTO cdto) {
		return custserv.savecustdetails(cdto);
	}
	
	@GetMapping("/getallmethod")
	public List<CustomerDTO> getall(){
		return custserv.getall();
	}

	
	@PutMapping("/put/{aid}")
	public CustomerDTO update(@PathVariable String aid,@RequestBody CustomerDTO custdto) {
		return custserv.updatecust(aid,custdto);
	}
	
	@DeleteMapping("delete/{aid}")
	public Boolean deletebyidd(@PathVariable String aid) {
		return custserv.deletbyidd(aid);
	}
	
}
