package com.example.test;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Cart;
import com.example.repo.CartRepositoryImpl;

@SpringBootTest
public class CartTest {

	@Autowired
	CartRepositoryImpl cartRepo;

	@Test
	void insertUserTest() {
		Cart cart = new Cart();

		cart.setQuantity(10);
		cart.setTotal_Cart_Price(10000);

		cartRepo.insertCart(cart);
	}

	@Test
	void selectCartTest() {
		Cart cart;
		cart = cartRepo.selectCart(47);
		System.out.println("------------------------------------");

		System.out.println("Cart ID         :" + cart.getCartId());
		System.out.println("Cart Quantity   :" + cart.getQuantity());
		System.out.println("Cart TotalPrice :" + cart.getTotal_Cart_Price());
		System.out.println("------------------------------------");

	}

	@Test
	void deleteOrderTest() {
		Cart cart = new Cart();

		cart.getCartId();

		cartRepo.deleteCart(48);
	}

	@Test
	void updateOrderTest() {
		Cart cart = new Cart();

		cart.setQuantity(5);
		cart.setTotal_Cart_Price(5000);

		cartRepo.insertCart(cart);
	}

	@Test
	void selectAllCartsTest() {
		List<Cart> cartList;
		cartList = cartRepo.selectCarts();
		System.out.println("------------------------------------");

		for (Cart cart : cartList) {
			System.out.println("Cart ID         :" + cart.getCartId());
			System.out.println("Cart Quantity   :" + cart.getQuantity());
			System.out.println("Cart TotalPrice :" + cart.getTotal_Cart_Price());
			System.out.println("------------------------------------");

		}
	}

}
