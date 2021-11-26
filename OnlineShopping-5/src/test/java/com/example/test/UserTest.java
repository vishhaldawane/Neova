package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.User;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class UserTest {

	@Autowired
	UserRepositoryImpl userRepo;

	@Test
	void insertUserTest() {
		User user = new User();

		user.setName("Rishii_Neova");
		user.setEmail("Rishii@neova.com");
		user.setPassword("Rishii123");
		user.setMobileNumber(9405405443l);
		user.setAddress("Warje, Pune, 411028");

		userRepo.insertUser(user);
	}

	@Test
	void selectUserTest() {
		User user;
		user = userRepo.selectUser(66);
		System.out.println("------------------------------------");

		System.out.println("User ID       :" + user.getUserId());
		System.out.println("User Name     :" + user.getName());
		System.out.println("User Email    :" + user.getEmail());
		System.out.println("User Password :" + user.getPassword());
		System.out.println("User Mobile   :" + user.getMobileNumber());
		System.out.println("User Address  :" + user.getAddress());
		System.out.println("------------------------------------");

	}

	@Test
	void deleteUserTest() {
		User user = new User();
		user.getUserId();
		userRepo.deleteUser(65);
	}

	@Test
	void updateUserTest() {
		User user = new User();

		user.setUserId(66);
		user.setName("Ritika");
		user.setEmail("rupali@neova.com");
		user.setPassword("rupali12345");
		user.setMobileNumber(9156140178l);
		user.setAddress("Warje, Deccan, 411028");

		userRepo.updateUser(user);
	}

	@Test
	void selectAllUsersTest() {
		List<User> userList;
		userList = userRepo.selectUsers();
		System.out.println("------------------------------------");

		for (User user : userList) {
			System.out.println("User Id         :" + user.getUserId());
			System.out.println("User name       :" + user.getName());
			System.out.println("User email      :" + user.getEmail());
			System.out.println("User password   :" + user.getPassword());
			System.out.println("User mobileNum. :" + user.getMobileNumber());
			System.out.println("User Address    :" + user.getAddress());
			System.out.println("------------------------------------");

		}
	}
}
