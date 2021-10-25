package com.example.user.service;

import org.springframework.stereotype.Service;

import com.example.user.entity.User;
@Service
public class UserService implements IUserService {

	@Override
	public void saveUser(User user) {
		System.out.println(user.getName());
	}

}
