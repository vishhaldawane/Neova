package lakhanProjectForDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord {
	public static void main(String[] args) {
		System.out.println("Program Ednded");
		try {
  DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerdd....");
  Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected...."+conn);
			
			
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println("Enter dept number : ");
			int dno = sc1.nextInt();
			

			System.out.println("Enter dept name : ");
			String dnm = sc2.nextLine();

			System.out.println("Enter dept location  : ");
			String dloc=sc3.nextLine();
			PreparedStatement pst = conn.prepareStatement("insert into dept3 values (?,?,?)");;
			pst.setInt(1, dno);
			pst.setString(2, dnm);
			pst.setString(3, dloc);
			int rows = pst.executeUpdate();
			System.out.println("Row created : "+rows);
			
			
			pst.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program Ednded");
		
	}
}
