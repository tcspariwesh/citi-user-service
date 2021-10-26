package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.IUserService;

@RestController
public class UserController {
	@Autowired
	IUserService userService;
	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	Integer saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return user.getId();
	}
//	@GetMapping("/")
//	List<User> getUsers() {
//		userService.getUsers();
//	}
}
