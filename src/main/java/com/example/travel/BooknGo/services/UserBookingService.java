package com.example.travel.BooknGo.services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.example.travel.BooknGo.entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
 
public class UserBookingService {
	
	private User user;
	
	private List<User> userList;
	
	//serialize and de- searialize purpose
	private ObjectMapper objectMapper = new ObjectMapper();
		
	private static final String USER_PATH = "../localDb/users.json"; //without initializing i can call in other class bcoz static
	
	
	
	public UserBookingService(User user1) throws IOException {
		this.user=user1;  //to use globally
		File users = new File(USER_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {}) ;
		
	}
	
	
	
	

}
