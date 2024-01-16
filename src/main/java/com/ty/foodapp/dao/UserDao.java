package com.ty.foodapp.dao;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.foodapp.dto.User;

public class UserDao {
	public User saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);

		entityTransaction.commit();

		return null;
	}
	
	public boolean deleteUserById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=entityManager.find(User.class, id);
		entityTransaction.begin();
		if(user!=null) {
		
		entityManager.remove(user);
		
		entityTransaction.commit();
		return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public void updateUserById(User user,int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		User user2=entityManager.find(User.class, id);
		if(user2!=null) {
			
		}
	}

}
