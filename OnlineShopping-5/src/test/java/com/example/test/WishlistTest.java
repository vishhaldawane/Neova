package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Cart;
import com.example.pojo.Wishlist;
import com.example.repo.CartRepositoryImpl;
import com.example.repo.WishlistRepositoryImpl;

@SpringBootTest
public class WishlistTest {

	@Autowired
	WishlistRepositoryImpl wishlistRepo;

	@Test
	void insertWishlistTest() {
		Wishlist wishlist = new Wishlist();

		wishlistRepo.insertWishlist(wishlist);
	}

	@Test
	void selectWishlistTest() {
		Wishlist wishlist;
		wishlist = wishlistRepo.selectWishlist(81);
		System.out.println("------------------------------------");

		System.out.println("Wishlist ID :" + wishlist.getWishlistId());

		System.out.println("------------------------------------");

	}

	@Test
	void deleteWishlistTest() {
		Wishlist wishlist = new Wishlist();

		wishlist.getWishlistId();

		wishlistRepo.deleteWishlist(82);
	}

	@Test
	void updateOrderTest() {
		Wishlist wishlist = new Wishlist();
		
		

		wishlistRepo.insertWishlist(wishlist);
	}

	@Test
	void selectAllWishlistsTest() {
		List<Wishlist> wishlistList;
		wishlistList = wishlistRepo.selectWishlists();
		System.out.println("------------------------------------");

		for (Wishlist wishlist : wishlistList) {
			System.out.println("Wishlist ID :" + wishlist.getWishlistId());
			System.out.println("------------------------------------");

		}
	}
}
