package com.ty.foodapp.controller;

import com.ty.foodapp.dto.User;
import com.ty.foodapp.service.UserService;

public class DeleteUserByIdControiller {
	public static void main(String[] args) {
		UserService userService=new UserService();
		boolean res=userService.deleteUserById(3);
		if(res) {
			System.out.println("deleted success fully");
		}
		else {
			System.out.println("there is no data to delete");
		}
	}

}
