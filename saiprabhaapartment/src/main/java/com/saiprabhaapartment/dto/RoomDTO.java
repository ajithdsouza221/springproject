package com.saiprabhaapartment.dto;

import java.util.ArrayList;
import java.util.List;

import com.saiprabhaapartment.entity.Customer;
import com.saiprabhaapartment.entity.Room;

public class RoomDTO {

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
	public static Room conversiondtotoentity(RoomDTO roomdto) {
	
		Room r=new Room();
		r.setRoomId(roomdto.getRoomId());
		r.setRoomTypes(roomdto.getRoomTypes());
		r.setNoOfrooms(roomdto.getNoOfrooms());
		r.setRent(roomdto.getRent());
		return r;
	}
//	public static RoomDTO converionentitytodto(Room r) {
//
//
//		RoomDTO rdto=new RoomDTO();
//		rdto.setRoomId(r.getRoomId());
//		rdto.setRoomTypes(r.getRoomTypes());
//		rdto.setNoOfrooms(r.getNoOfrooms());
//		rdto.setRent(r.getRent());
//		return rdto;
	public static List<RoomDTO> copy(List<Room> rentity) {
	
		List<RoomDTO> r=new ArrayList<>();
		for(int i=0;i<rentity.size();i++) {
			Room room=rentity.get(i);
			RoomDTO roomdto=RoomDTO.conversionentitytodto(room);
			r.add(roomdto);

		}
		return r;
	}
	static RoomDTO conversionentitytodto(Room room) {
		RoomDTO rdto=new RoomDTO();
		rdto.setRoomId(room.getRoomId());
		rdto.setRoomTypes(room.getRoomTypes());
		rdto.setNoOfrooms(room.getNoOfrooms());
		rdto.setRent(room.getRent());
		return rdto;
	}
	
	
	
}

