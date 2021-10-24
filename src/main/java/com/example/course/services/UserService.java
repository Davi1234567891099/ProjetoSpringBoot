package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public List<User> findAll(){
		return ur.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = ur.findById(id);
		return obj.get();
	}
}