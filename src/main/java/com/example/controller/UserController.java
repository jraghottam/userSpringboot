package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Users;
import com.example.service.UsersService;

@RestController
public class UserController {
	@Autowired
	UsersService usersService;
	
	@PostMapping("/users")
	private int saveUser(@RequestBody Users users) {
		usersService.save(users);
		return users.getUserid();
	}
	
	
	@PutMapping("/users")  
	private Users update(@RequestBody Users users)   
	{  
	usersService.save(users);  
	return users;  
	}
	
	
	@DeleteMapping("/user/{userid}")
	private void deleteUser(@PathVariable("userid") int userid) {
		usersService.delete(userid);
	}

}
