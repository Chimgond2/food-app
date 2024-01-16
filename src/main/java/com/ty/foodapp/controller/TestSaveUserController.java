package com.ty.foodapp.controller;

import com.ty.foodapp.dto.User;
import com.ty.foodapp.service.UserService;

public class TestSaveUserController {
	public static void main(String[] args) {
		User user=new User();
		user.setName("raghav");
		user.setAddress("raghav@gmail.com");
		user.setAddress("bidar");
		user.setPhone(67777766);
		
		UserService userService=new UserService();
		User user2=userService.saveUser(user);
		
		if(user2!=null) {
			System.out.println("yes data saved");
		}
		else {
			System.out.println("data not saved");
		}
	}

}
