package com.example.user.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.Quote;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
@Service
public class UserService implements IUserService {
	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	UserRepository userRepository;
	@Override
	public void saveUser(User user) {
		Quote quote = restTemplate.getForObject(
				"https://quoters.apps.pcfone.io/api/random", Quote.class);
		System.out.println(quote.toString());
		userRepository.save(user);
		System.out.println(user.getName());
	}

}
