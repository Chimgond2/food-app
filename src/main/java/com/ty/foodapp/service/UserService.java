package com.ty.foodapp.service;

import com.ty.foodapp.dao.UserDao;
import com.ty.foodapp.dto.User;

public class UserService {
	public User saveUser(User user) {
		UserDao userDao=new UserDao();
		return userDao.saveUser(user);
	}
	
	public boolean deleteUserById(int id) {
		UserDao userDao=new UserDao();
		return userDao.deleteUserById(id);
	}

}
