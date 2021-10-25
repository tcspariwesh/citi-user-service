package com.example.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.user.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
