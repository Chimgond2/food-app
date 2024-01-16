package com.ty.foodapp.controller;

import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.service.FoodOrderService;

public class RemoveFoodOrderByIdController {
	public static void main(String[] args) {
		FoodOrderService foodOrderService=new FoodOrderService();
		boolean foodOrder=foodOrderService.removeFoodOrederById(1);
		
		if(foodOrder) {
			System.out.println("here is ur id detail");
		}
		else {
			System.out.println("id does not exit");
		}
		
		
	}

}
