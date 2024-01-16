package com.ty.foodapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.Item;
import com.ty.foodapp.service.FoodOrderService;

public class FoodSaveController {

	public static void main(String[] args) {

		FoodOrderService foodOrderService = new FoodOrderService();

		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("tejas");
		foodOrder.setPhone(44551);

		Item item1 = new Item();
		item1.setName("kalmee kabab");
		item1.setQuantity(2);
		item1.setCost(300);

		Item item2 = new Item();
		item2.setName("mango huice ");
		item2.setQuantity(1);
		item2.setCost(50);

		Item item3 = new Item();
		item3.setName("water battle ");
		item3.setQuantity(1);
		item3.setCost(20);

		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);

		foodOrder.setItems(items);
		item1.setFoodOrder(foodOrder);
		item2.setFoodOrder(foodOrder);
		item3.setFoodOrder(foodOrder);
		
		
		 foodOrderService .saveOrder(foodOrder);
	}

}
