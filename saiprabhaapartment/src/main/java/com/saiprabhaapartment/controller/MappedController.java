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
import com.saiprabhaapartment.service.MappedService;

@RestController
public class MappedController {

	@Autowired
	MappedService mappedService;
	
	
	@PostMapping("/postall")
	public CustomerDTO saveall(@RequestBody CustomerDTO customerDTO) {
		return mappedService.saveall(customerDTO);
	}
	
	
	@GetMapping("/custrooms")
	public List<CustomerDTO> getallcrooms() {
		return mappedService.getallcrooms();
	}
	
//	@PutMapping("/uppdateall/{aid}")
//	public CustomerDTO updateallcusts(@PathVariable String aid,CustomerDTO customerDTO) {
//		return mappedService.updateallcusts(aid,customerDTO);
//	}
	
	@DeleteMapping("/deletedd/{aid}")
	public Boolean delete(@PathVariable String aid) {
		return mappedService.deltebyid(aid);
	}
}
