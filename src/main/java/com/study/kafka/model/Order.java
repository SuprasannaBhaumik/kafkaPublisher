package com.study.kafka.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Order {
	
	Order(){
	}
	
	Order(String f, String r) {
		this.foodName = f;
		this.restaurantName = r;
	}
	
	private String foodName;
	private String restaurantName;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


}
