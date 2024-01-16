package com.ty.foodapp.service;

import java.util.List;

import com.ty.foodapp.dao.FoodOrderDao;
import com.ty.foodapp.dto.FoodOrder;

public class FoodOrderService {

	public FoodOrder saveOrder(FoodOrder foodOrder) {

		FoodOrderDao dao = new FoodOrderDao();
		return dao.saveOrder(foodOrder);

	}
//	public FoodOrder getFoodOrderByPhone(long phone) {
//		FoodOrderDao foodOrderDao=new FoodOrderDao();
//		
//	return foodOrderDao.getFoodOrderByPhone(phone);
//	}

	public FoodOrder getFoodOrderById(int id) {
		FoodOrderDao foodOrderDao = new FoodOrderDao();
		return foodOrderDao.getFoodOrderById(id);

	}

	public boolean removeFoodOrederById(int id) {
		FoodOrderDao foodOrderDao = new FoodOrderDao();
		return foodOrderDao.removeFoodOrederById(id);
	}

	public FoodOrder updateFoodOrder(FoodOrder foodOrder, int id) {

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		return foodOrderDao.updateFoodOrder(foodOrder, id);

	}
	public List<FoodOrder> getAllFoodOreder(){
		FoodOrderDao foodOrderDao=new FoodOrderDao();
		return foodOrderDao.getAllFoodOreder();
	}
}