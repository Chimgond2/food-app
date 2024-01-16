package com.ty.foodapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.Item;

public class FoodOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public FoodOrder saveOrder(FoodOrder foodOrder) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		for (Item item : foodOrder.getItems()) {
			entityManager.persist(item);
		}
		entityManager.persist(foodOrder);
		entityTransaction.commit();

		return foodOrder;
	}

	// public FoodOrder getFoodOrderByPhone(long phone) {

//String sql="select s from foodorder s where s.phone=?1";
//Query query= entityManager.createQuery(sql);
	// if(foodOrder!=null) {
	// return foodOrder;
	// }

	// else //{

	// return null;
	// }

	public FoodOrder getFoodOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		if (foodOrder != null) {

			System.out.println("food order");
			System.err.println("user name" + foodOrder.getName());
			System.out.println("user no" + foodOrder.getPhone());

			List<Item> items = foodOrder.getItems();

			for (Item item : items) {
				System.out.println("item name" + item.getName());
				System.out.println("item cost" + item.getCost());
				System.out.println("item quantity" + item.getQuantity());
				System.out.println("===================================");
			}

		} else {
			return null;
		}
		return foodOrder;
	}

	public boolean removeFoodOrederById(int id) {
		boolean flag = true;
		entityTransaction = entityManager.getTransaction();
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		entityTransaction.begin();
		if (foodOrder != null) {
			List<Item> items = foodOrder.getItems();
			for (Item item : items) {
				entityManager.remove(item);
			}
			entityManager.remove(foodOrder);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}

	}

	public List<FoodOrder> getFoodOrderByName(String name) {
		String sql = "select s from  foodorder s where s.name=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);

		return null;

	}

	public FoodOrder updateFoodOrder(FoodOrder foodOrder, int id) {

		entityTransaction = entityManager.getTransaction();
		FoodOrder foodOrder1 = entityManager.find(FoodOrder.class, id);
		entityTransaction.begin();
		if (foodOrder1 != null) {

			List<Item> items = foodOrder1.getItems();
			for (Item item : items) {
				entityManager.merge(item);
			}
			entityManager.merge(foodOrder1);
			entityTransaction.commit();
        return foodOrder1;
		}
		else {
			return null;
		}
		

	}
	public List<FoodOrder> getAllFoodOreder() {
		String sql="select r from FoodOrder r ";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}

}