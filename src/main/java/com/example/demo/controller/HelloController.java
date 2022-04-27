package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.UserService;

@RestController
public class HelloController { 
	
	
	@Autowired
	private UserService userService;

	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/sal")
	public User getUser() {
		User u = new User();
		u.setId(1);
		u.setName("Deshan");
		u.setAddress("Polonnaruwa");
		
		return u;
	}
	
	@PostMapping("/deshan")
	public  User createUser(@RequestBody User user) {
		userService.createUser(user);
		return user;
	}
	
	@PostMapping("/all")
	public  List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/getbyid/{id}")
	public User findUserByID(int id) {
		return userService.findUserbyID(id);
	}
	
	@PostMapping("/deletebyid/{id}")
	public void deleteUserById(int id) {
		userService.deleteUser(id);
		
	}

}
