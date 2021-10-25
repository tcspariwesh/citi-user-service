package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.IUserService;

@RestController
public class UserController {
	@Autowired
	IUserService userService;
	@PostMapping("/user")
	void saveUser(@RequestBody User user) {
		userService.saveUser(user);
		System.out.println("user name=" + user.getName());
	}
}
