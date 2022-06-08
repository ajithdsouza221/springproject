package com.saiprabhaapartment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saiprabhaapartment.dto.FoodDTO;
import com.saiprabhaapartment.repository.Food;
import com.saiprabhaapartment.repository.FoodRepository;

@Service
public class FoodService {

	
	@Autowired
	FoodRepository foodrepo;

	public FoodDTO saveallfood(FoodDTO fooddto) {
		
		Food f=FoodDTO.converiondtotoentity(fooddto);
		foodrepo.save(f);
		return fooddto;
	}

	public List<FoodDTO> getall() {
	List<Food> r=foodrepo.findAll();
	List<FoodDTO> fdto=FoodDTO.copy(r);
	return fdto;
 	}

	public FoodDTO updateall(String foodId, FoodDTO foodDTO) {
		
		Food r=new Food();
		 r=foodrepo.getById(foodId);
		r.setFoodtypes(foodDTO.getFoodtypes());
		r.setPrice(foodDTO.getPrice());
		foodrepo.save(r);
		return foodDTO;
		
		
	}

	public Boolean deletbn(String foodId) {
	
		foodrepo.deleteById(foodId);
		return true;
		
	}

}
