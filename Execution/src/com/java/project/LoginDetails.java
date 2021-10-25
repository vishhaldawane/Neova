package com.java.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class LoginDetails {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		
		System.out.println("Driver Registered ...");
		
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","" );
		System.out.println("Connected "+conn);
		Statement st=conn.createStatement();
		
	
		
		ResultSet rs1=st.executeQuery("SELECT* FROM FARMER_INPUT");
		ResultSet rs2 =st.executeQuery("Select LOGIN_ID,PASSWORD FROM FARMER_INPUT");
		
		while(rs1.next()) {
		
		String login1 =rs1.getString(1);
		String password1 =rs1.getString(2);
		
		System.out.println("Login Details Are :"+login1);
		System.out.println("Password Details Are :"+password1);
		System.out.println("--------------------------------");
		}
		
		rs1.close();
		st.close();
		conn.close();
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
