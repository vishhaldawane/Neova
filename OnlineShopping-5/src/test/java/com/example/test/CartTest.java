package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Cart;
import com.example.pojo.User;
import com.example.pojo.Wishlist;
import com.example.repo.CartRepositoryImpl;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class CartTest {

	@Autowired
	CartRepositoryImpl cartRepo;

	@Autowired
	UserRepositoryImpl userRepo;

	@Test
	void insertUserTest() {
		Cart cart = new Cart();

		cart.setQuantity(10);
		cart.setTotal_Cart_Price(10000);

		cartRepo.insertCart(cart);
	}

	@Test
	void insertCartWithUserTest() {

		Cart cart = new Cart();

		cart.setQuantity(10);
		cart.setTotal_Cart_Price(10000);

		User userObj = userRepo.selectUser(64);

		cart.setCartUserID(userObj);

		cartRepo.insertCart(cart);

	}

	@Test
	void selectCartTest() {
		Cart cart;
		cart = cartRepo.selectCart(72);
		System.out.println("------------------------------------");

		System.out.println("Cart ID         :" + cart.getCartId());
		System.out.println("Cart Quantity   :" + cart.getQuantity());
		System.out.println("Cart TotalPrice :" + cart.getTotal_Cart_Price());
		System.out.println("------------------------------------");

	}

	@Test
	void deleteOrderTest() {
		Cart cartObj = cartRepo.find(Cart.class, 73);
		cartObj.getCartId();

		cartRepo.remove(Cart.class, 73);
	}

	@Test
	void updateCartTest() {
		Cart cartObj = cartRepo.find(Cart.class, 72);

		cartObj.setQuantity(5);
		cartObj.setTotal_Cart_Price(5000);

		cartRepo.merge(cartObj);
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
