package com.saiprabhaapartment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saiprabhaapartment.dto.RoomDTO;
import com.saiprabhaapartment.entity.Room;
import com.saiprabhaapartment.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	RoomRepository roomRepo;

	public RoomDTO saveallroms(RoomDTO roomdto) {
	
		Room r=RoomDTO.conversiondtotoentity(roomdto);
		roomRepo.save(r);
//		RoomDTO rdto=RoomDTO.converionentitytodto(r);
//		return rdto;
		return roomdto;
	}

	public List<RoomDTO> getallRooms() {
	
		List<Room> rentity=roomRepo.findAll();
		List<RoomDTO> rdto=RoomDTO.copy(rentity);
		return rdto;
	}

	public RoomDTO updaterooms(String roomId, RoomDTO roomdto) {

			Room r=new Room();
			r=roomRepo.getById(roomId);
			r.setNoOfrooms(roomdto.getNoOfrooms());
			r.setRoomTypes(roomdto.getRoomTypes());
			r.setRent(roomdto.getRent());
			roomRepo.save(r);
		
			return roomdto;
//		Room room=roomRepo.getById(roomId);
//		room=RoomDTO.conversiondtotoentity(roomdto);
//		roomRepo.save(room);
//		return roomdto;
	}

	public Boolean deletbyIdd(String roomId) {

	roomRepo.deleteById(roomId);
return true;
	}
	
	
}
