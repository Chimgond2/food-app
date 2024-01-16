package com.ty.foodapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.Item;
import com.ty.foodapp.service.FoodOrderService;

public class UpdateFoodOrderByIdController {
	public static void main(String[] args) {

		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("aqib");
		foodOrder.setPhone(11889922);

		Item item1 = new Item();
		item1.setName("veg biriyani");
		item1.setCost(250);
		item1.setQuantity(2);

		Item item2 = new Item();
		item2.setName("veg palava");
		item2.setCost(80);
		item2.setQuantity(1);

		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);

		foodOrder.setItems(items);
		item1.setFoodOrder(foodOrder);
		item2.setFoodOrder(foodOrder);
		
		
		FoodOrderService foodOrderService = new FoodOrderService();

		FoodOrder foodOrder2=foodOrderService.updateFoodOrder(foodOrder,5);
		
		if(foodOrder2!=null) {
			System.out.println("updated");
		}
		else {
			System.out.println("not updated");
		}
	}

}
