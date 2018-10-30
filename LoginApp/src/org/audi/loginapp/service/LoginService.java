package org.audi.loginapp.service;

import java.util.HashMap;
import org.audi.loginapp.service.dto.*;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<>();
		 public LoginService(){
			 users.put("user", "userONe");
			 users.put("user2", "userTwo");
			 users.put("user3", "userThree");
			 users.put("audi", "audi 96 ");
		 }
	
	public boolean authenticate(String userId, String password) {
		// this is connected to the db 
		
		if( password ==  null || password.trim() =="") {
			return true;
		}else {
			return false;
		}
		
	}
	
	// this is the model
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserName(users.get(userId)); // from hashmap
		user.setUserId(userId);
		return user;
	}
}
