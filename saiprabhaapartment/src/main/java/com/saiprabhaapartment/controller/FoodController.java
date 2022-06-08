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

import com.saiprabhaapartment.dto.FoodDTO;
import com.saiprabhaapartment.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@PostMapping("/save")
	public FoodDTO saveFood(@RequestBody FoodDTO fooddto) {
		return foodService.saveallfood(fooddto);
	}
	@GetMapping("getall")
	public List<FoodDTO>  getalltypesofFood() {
		return foodService.getall();
	}
	@PutMapping("updates/{foodId}")
	public FoodDTO updatefood(@PathVariable String foodId,@RequestBody FoodDTO foodDTO) {
		return foodService.updateall(foodId,foodDTO);
	}
	
	@DeleteMapping("/deleted/{foodId}")
	public Boolean deleteByID(@PathVariable String foodId) {
		return foodService.deletbn(foodId);
	}
	

}
