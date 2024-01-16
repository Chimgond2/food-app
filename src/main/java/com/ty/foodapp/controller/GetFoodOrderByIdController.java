package com.ty.foodapp.controller;

import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.service.FoodOrderService;

public class GetFoodOrderByIdController {
	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();
		FoodOrder foodOrder=foodOrderService.getFoodOrderById(1);
		if(foodOrder!=null) {
			System.out.println("here is ur order");
		}
		else {
			System.out.println("ur not order anything");
		}
	}

}
