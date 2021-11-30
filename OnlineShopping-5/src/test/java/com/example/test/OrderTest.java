package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Order;
import com.example.repo.OrderRepositoryImpl;

@SpringBootTest
public class OrderTest {

	@Autowired
	OrderRepositoryImpl orderRepo;
	
	@Test
	void insertOrderTest()
	{
		Order order = new Order();
		
		order.setLocalDate(null);
		order.setQuantity(10);
		order.setTotal_Order_Price(10000);
		
		orderRepo.insertOrder(order);
	}
	
	
}
