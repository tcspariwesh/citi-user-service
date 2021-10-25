package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		System.out.println(user.getName());
	}

}
