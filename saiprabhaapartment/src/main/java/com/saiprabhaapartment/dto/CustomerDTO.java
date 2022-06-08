package com.saiprabhaapartment.dto;

import java.util.ArrayList;
import java.util.List;

import com.saiprabhaapartment.entity.Customer;
import com.saiprabhaapartment.entity.Room;

public class CustomerDTO {

	private String aid;
	private String cname;
	private int age;
	private String address;
	private long phoneNo;	
	private RoomDTO roomDTO;

	
	

	public RoomDTO getRoomDTO() {
		return roomDTO;
	}
	public void setRoomDTO(RoomDTO roomDTO) {
		this.roomDTO = roomDTO;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public static Customer converiondtoentity(CustomerDTO cdto) {

		Customer c=new Customer();
		c.setAid(cdto.getAid());
		c.setAddress(cdto.getAddress());
		c.setAge(cdto.getAge());
		c.setCname(cdto.getCname());
		c.setPhoneNo(cdto.getPhoneNo());
		
		
		return c;
	}
	public static List<CustomerDTO> copy(List<Customer> c) {

	List<CustomerDTO> cdto=new ArrayList<>();
	for(int i=0;i<c.size();i++) {
		Customer cust=c.get(i);
		CustomerDTO c1=CustomerDTO.converionentitytodto(cust);
		cdto.add(c1);
	}
	return cdto;
	
	}
	private static CustomerDTO converionentitytodto(Customer cust) {
		// TODO Auto-generated method stub
		CustomerDTO c=new CustomerDTO();
		c.setAid(cust.getAid());
		c.setCname(cust.getCname());
		c.setAge(cust.getAge());
		c.setPhoneNo(cust.getPhoneNo());
		c.setAddress(cust.getAddress());
		RoomDTO rdto=RoomDTO.conversionentitytodto(cust.getRoom());
		c.setRoomDTO(rdto);
		return c;
	}
	public Room conversion(CustomerDTO customerDTO) {
		Room r=new Room();
	r.setRoomId(customerDTO.getRoomDTO().getRoomId());
	r.setRoomTypes(customerDTO.getRoomDTO().getRoomTypes());
	r.setRent(customerDTO.getRoomDTO().getRent());
	r.setNoOfrooms(customerDTO.getRoomDTO().getNoOfrooms());
return r;
	}

	
}
