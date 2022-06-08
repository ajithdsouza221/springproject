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

import com.saiprabhaapartment.dto.RoomDTO;
import com.saiprabhaapartment.entity.Room;
import com.saiprabhaapartment.service.RoomService;

@RestController
public class RoomController {

	@Autowired
	RoomService roomservice;
	
	@PostMapping("/post")
	public RoomDTO saverooms(@RequestBody RoomDTO roomdto) {
		return roomservice.saveallroms(roomdto);
	}
	
	@GetMapping("/allpost")
	public List<RoomDTO> getallRooms(){
		return roomservice.getallRooms();
	}
	
	@PutMapping("/update/{roomId}")
	public RoomDTO updateroom(@PathVariable String roomId,@RequestBody RoomDTO roomdto) {
		return roomservice.updaterooms(roomId,roomdto);
	}
	
	@DeleteMapping("/delet/{roomId}")
	public Boolean deleyebyID(@PathVariable String roomId) {
		return roomservice.deletbyIdd(roomId);
		
	}
}
