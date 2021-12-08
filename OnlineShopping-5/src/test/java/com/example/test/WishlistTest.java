package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Cart;
import com.example.pojo.Product;
import com.example.pojo.User;
import com.example.pojo.Wishlist;
import com.example.repo.CartRepositoryImpl;
import com.example.repo.ProductRepositoryImpl;
import com.example.repo.UserRepositoryImpl;
import com.example.repo.WishlistRepositoryImpl;

@SpringBootTest
public class WishlistTest {

	@Autowired
	WishlistRepositoryImpl wishlistRepo;

	@Autowired
	UserRepositoryImpl userRepo;
	
	@Autowired
	ProductRepositoryImpl prodRepo;

	@Test
	void insertWishlistTest() {
		Wishlist wishlist = new Wishlist();

		wishlistRepo.insertWishlist(wishlist);
	}

	@Test
	void insert() {
		User userObj = userRepo.selectUser(65);
	//	Product productObj = prodRepo.selectProduct(145);
		
		Wishlist wishilist1 = new Wishlist();
		
	//	wishilist1.setWishlistProductID(productObj);
		wishilist1.setWishlistUserID(userObj);
		
		wishlistRepo.insertWishlist(wishilist1);
		
	}
	@Test
	void insertWishlistWithUserTest() {
		Wishlist wishlistObj = new Wishlist();
		

		User userObj = userRepo.find(User.class, 66);

		wishlistObj.setWishlistUserID(userObj);
		

		wishlistRepo.merge(wishlistObj);
	}

	@Test
	void selectWishlistTest() {
		Wishlist wishlist;
		wishlist = wishlistRepo.selectWishlist(83);
		System.out.println("------------------------------------");

		System.out.println("Wishlist ID :" + wishlist.getWishlistId());
		System.out.println("Admin Id    :" + wishlist.getWishlistUserID());

		System.out.println("------------------------------------");

	}

	@Test
	void deleteWishlistTest() {
		Wishlist wishlist = new Wishlist();

		wishlist.getWishlistId();

		wishlistRepo.deleteWishlist(84);
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
