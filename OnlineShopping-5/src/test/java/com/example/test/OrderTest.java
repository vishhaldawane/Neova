package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Order;
import com.example.pojo.User;

import com.example.repo.OrderRepositoryImpl;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class OrderTest {

	@Autowired
	OrderRepositoryImpl orderRepo;

	@Autowired
	UserRepositoryImpl userRepo;

	@Test
	void insertOrderTest() {
		Order order = new Order();

		order.setLocalDate(null);
		order.setQuantity(10);
		order.setTotal_Order_Price(10000);

		orderRepo.insertOrder(order);
	}
	
	@Test
	void insertOrderWithUserTest() {
	
		User userObj = userRepo.selectUser(67);
		
		Order order1 = new Order();

		order1.setLocalDate(null);
		order1.setQuantity(25);
		order1.setTotal_Order_Price(50000);
		order1.setOrderUserID(userObj);
		
		orderRepo.insertOrder(order1);
		
	}
}


