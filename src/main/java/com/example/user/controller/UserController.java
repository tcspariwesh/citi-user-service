package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	ResponseEntity<User> saveUser(@RequestBody User user) {
		ResponseEntity<User> responseEntity = null;
		try {
			userService.saveUser(user);
			responseEntity = new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<User>(HttpStatus.CONFLICT);
		}
		return responseEntity;
	}
//	@GetMapping("/")
//	List<User> getUsers() {
//		userService.getUsers();
//	}
}
