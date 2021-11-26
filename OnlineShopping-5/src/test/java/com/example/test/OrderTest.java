package com.example.test;

import java.time.LocalDate;
import java.util.List;

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
	//	LocalDate ld = LocalDate.of(2021, 06, 02);
		
		order.setQuantity(5);
		order.setLocalDate(LocalDate.of(2021, 06, 02));
		order.setTotal_Order_Price(2500);
				
		orderRepo.insertOrder(order);
	}
	
	@Test 
	void selectOrderTest()
	{
		Order order ;
		order = orderRepo.selectOrder(72);
		System.out.println("------------------------------------");

		System.out.println("Order ID         :"+order.getOrderId());
		System.out.println("Order Quantity   :"+order.getQuantity());
		System.out.println("Order Date       :"+order.getLocalDate());
		System.out.println("Order TotalPrice :"+order.getTotal_Order_Price());
		System.out.println("------------------------------------");
		
	}
	
	@Test
	void deleteOrderTest()
	{
		Order order = new Order();
		
		order.getOrderId();
		
		orderRepo.deleteOrder(48);
	}
	
	@Test 
	void updateOrderTest()
	{
		Order order = new Order();
		LocalDate ld = LocalDate.of(2021, 06, 12);
		
		order.setQuantity(10);
		order.setLocalDate(ld);
		order.setTotal_Order_Price(5000);
				
		orderRepo.insertOrder(order);
	}
	
	@Test 
	void selectAllOrdersTest()
	{
		List <Order> orderList;
		orderList = orderRepo.selectOrders();
		System.out.println("------------------------------------");

		for(Order order : orderList)
		{
			System.out.println("Order ID         :"+order.getOrderId());
			System.out.println("Order Quantity   :"+order.getQuantity());
			System.out.println("Order Date       :"+order.getLocalDate());
			System.out.println("Order TotalPrice :"+order.getTotal_Order_Price());
			System.out.println("------------------------------------");

		}
	}
}
