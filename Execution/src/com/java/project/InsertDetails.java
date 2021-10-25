package com.java.project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDetails {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		
		System.out.println("Driver Registered ....");
		
		Connection conn= DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
		System.out.println("Connection secured....");
		
		Scanner scan1 =new Scanner(System.in);
		Scanner scan2 =new Scanner(System.in);
		
		System.out.println("Enter Login_Id....");
		String login_Id = scan1.nextLine();
		System.out.println("Enter Password....");
	    String password =scan2.nextLine();
		
		PreparedStatement pst= conn.prepareStatement("insert into FARMER_INPUT values(?,?)");;
		pst.setString(1,login_Id);
		pst.setString(2,password);
		int rows =pst.executeUpdate();
		System.out.println("Number of rows created " +rows);
		
		pst.close();
		conn.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
