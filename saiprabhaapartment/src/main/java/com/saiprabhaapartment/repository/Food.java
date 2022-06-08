package com.saiprabhaapartment.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {

	@Id
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
	
}
