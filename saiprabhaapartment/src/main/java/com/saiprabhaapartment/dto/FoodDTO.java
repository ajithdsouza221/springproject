package com.saiprabhaapartment.dto;

import java.util.ArrayList;
import java.util.List;

import com.saiprabhaapartment.repository.Food;

public class FoodDTO {

	private String foodId;
	private String foodtypes;
	private int price;
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getFoodtypes() {
		return foodtypes;
	}
	public void setFoodtypes(String foodtypes) {
		this.foodtypes = foodtypes;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static Food converiondtotoentity(FoodDTO fooddto) {
	
		Food f=new Food();
		f.setFoodId(fooddto.getFoodId());
		f.setFoodtypes(fooddto.getFoodtypes());
		f.setPrice(fooddto.getPrice());
		return f;
	}
	public static List<FoodDTO> copy(List<Food> r) {

		List<FoodDTO> fdto=new ArrayList<>();
		for(int i=0;i<r.size();i++) {
			Food rooms=r.get(i);
			FoodDTO foodto=FoodDTO.conversionentitytodto(rooms);
			fdto.add(foodto);
		}
		return fdto;
	}
	private static FoodDTO conversionentitytodto(Food rooms) {
		
		FoodDTO r=new FoodDTO();
		r.setFoodId(rooms.getFoodId());
		r.setFoodtypes(rooms.getFoodtypes());
		r.setPrice(rooms.getPrice());
		return r;
		
	}
}
