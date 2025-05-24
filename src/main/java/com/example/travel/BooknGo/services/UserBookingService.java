package com.example.travel.BooknGo.services;

import java.io.File;

import com.example.travel.BooknGo.entities.User;

public class UserBookingService {
	
	private User user;
	
	private final String USER_PATH = "../localDb/users.json";
	
	
	
	public UserBookingService(User user1) {
		this.user=user1;  //to use globally
		File users = new File(USER_PATH);
	}
	
	
	
	

}
