package com.example.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@PostMapping("/user")
	void saveUser() {
		System.out.println("called");
	}
}
