package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.Quote;
import com.example.user.entity.User;
import com.example.user.service.IUserService;

@RestController
public class UserController {
	@Autowired
	IUserService userService;
	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	ResponseEntity<Quote> saveUser(@RequestBody User user) {
		ResponseEntity<Quote> responseEntity = null;
		try {
			Quote quote = userService.saveUser(user);
			responseEntity = new ResponseEntity<Quote>(quote, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Quote>(HttpStatus.CONFLICT);
		}
		return responseEntity;
	}
//	@GetMapping("/")
//	List<User> getUsers() {
//		userService.getUsers();
//	}
}
