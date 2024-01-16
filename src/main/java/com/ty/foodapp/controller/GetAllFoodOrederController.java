package com.ty.foodapp.controller;

import java.util.List;

import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.Item;
import com.ty.foodapp.service.FoodOrderService;

public class GetAllFoodOrederController {
	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();
		List<FoodOrder> foodOrders = foodOrderService.getAllFoodOreder();
		if (foodOrders != null) {
			for (FoodOrder foodOrder : foodOrders) {
				System.out.println(foodOrder.getName());
				System.out.println(foodOrder.getPhone());
				for(Item item:foodOrder.getItems()) {
					System.out.println(item.getName());
				}
			}
			
		}
	}

}
