package com.saiprabhaapartment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saiprabhaapartment.dto.CustomerDTO;
import com.saiprabhaapartment.entity.Customer;
import com.saiprabhaapartment.entity.Room;
import com.saiprabhaapartment.repository.CustomerRepo;
import com.saiprabhaapartment.repository.RoomRepository;

@Service
public class MappedService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	RoomRepository roomrepo;

	public CustomerDTO saveall(CustomerDTO customerDTO) {
	
		try {
			Customer c=new Customer();
	c=CustomerDTO.converiondtoentity(customerDTO);
//				Room r=new Room();
//			r.setRoomId(customerDTO.getRoomDTO().getRoomId());
//			r.setRoomTypes(customerDTO.getRoomDTO().getRoomTypes());
//			r.setRent(customerDTO.getRoomDTO().getRent());
//			r.setNoOfrooms(customerDTO.getRoomDTO().getNoOfrooms());
//		
		
	Room r=customerDTO.conversion(customerDTO);
	c.setRoom(r);
			customerRepo.save(c);
		} catch (Exception e) {
			
		}
		
		return customerDTO;
	}

	public List<CustomerDTO> getallcrooms() {
	List<Customer> c=customerRepo.findAll();
	List<CustomerDTO> cdto=CustomerDTO.copy(c);
	return cdto;
	}

	public Boolean deltebyid(String aid) {
		try {
		customerRepo.deleteById(aid);
		return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	/*

	public CustomerDTO updateallcusts(String aid, CustomerDTO customerDTO) {


		Customer c=customerRepo.getById(aid);
		c=CustomerDTO.converiondtoentity(customerDTO);
		
		Room r1 = new Room();
		r1.setRoomId(customerDTO.getRoomDTO().getRoomId());
		r1.setRoomTypes(customerDTO.getRoomDTO().getRoomTypes());
		r1.setNoOfrooms(customerDTO.getRoomDTO().getNoOfrooms());
		r1.setRent(customerDTO.getRoomDTO().getRent());
		c.setRoom(r1);
		customerRepo.save(c);
		return customerDTO;


	
	}
	
*/
//	
//	Customer c = customerRepo.getById(adharid);
//	CustomerDTO cdto = CustomerDTO.entitytodto(c);
//	System.out.println(cdto);

	
	
	


}
