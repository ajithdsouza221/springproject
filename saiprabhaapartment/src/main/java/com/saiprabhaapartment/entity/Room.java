package com.saiprabhaapartment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
	private String roomId;
	private String roomTypes;
	private  int  rent;
	private int noOfrooms;
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomTypes() {
		return roomTypes;
	}
	public void setRoomTypes(String roomTypes) {
		this.roomTypes = roomTypes;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getNoOfrooms() {
		return noOfrooms;
	}
	public void setNoOfrooms(int noOfrooms) {
		this.noOfrooms = noOfrooms;
	}
	
}
