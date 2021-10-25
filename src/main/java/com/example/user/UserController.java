package com.example.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;

@RestController
public class UserController {
	@PostMapping("/user")
	void saveUser(@RequestBody User user) {
		System.out.println("user name=" + user.getName());
	}
}
