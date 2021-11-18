package com.example.repo;

import java.util.List;

import com.example.pojo.User;

public interface UserRepository {

	void insertUser(User uObj); //C

	User selectUser(int uID); //R
	List<User> selectUsers(); //RA

	void updateUser(int uID); //U
	void deleteUser(int uID); //D
}
