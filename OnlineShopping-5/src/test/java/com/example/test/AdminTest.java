package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Admin;
import com.example.repo.AdminRepositoryImpl;

@SpringBootTest
public class AdminTest {

	@Autowired
	AdminRepositoryImpl adminRepo;
	
	@Test 
	void insertAdminTest()
	{
		Admin admin = new Admin();
		
		admin.setName("A-Rupali");
		admin.setPassword("rupali@123");
				
		adminRepo.insertAdmin(admin);
	}
	
	@Test 
	void selectAdminTest()
	{
		Admin admin ;
		admin = adminRepo.selectAdmin(75);
		System.out.println("------------------------------------");

		System.out.println("Admin ID        :"+admin.getAdminId());
		System.out.println("Admin Name      :"+admin.getName());
		System.out.println("Admin Password  :"+admin.getPassword());
		System.out.println("------------------------------------");
		
	}
	
	@Test
	void deleteAdminTest()
	{
		Admin admin = new Admin();
		
		admin.getAdminId();
		
		adminRepo.deleteAdmin(76);
	}
	
	@Test 
	void updateAdminTest()
	{
		Admin admin = new Admin();
	
		admin.setAdminId(75);
		admin.setName("Rishii");
		admin.setPassword("rishikesh123");
				
		adminRepo.updateAdmin(admin);
	}
	
	@Test 
	void selectAllAdminsTest()
	{
		List <Admin> adminList;
		adminList = adminRepo.selectAdmins();
		System.out.println("------------------------------------");

		for(Admin admin : adminList)
		{
			System.out.println("Admin ID        :"+admin.getAdminId());
			System.out.println("Admin Name      :"+admin.getName());
			System.out.println("Admin Password  :"+admin.getPassword());
			System.out.println("------------------------------------");

		}
	}
}
