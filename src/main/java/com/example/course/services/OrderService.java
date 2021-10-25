package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository or;
	
	public List<Order> findAll(){
		return or.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> order = or.findById(id);
		return order.get();
	}
}
