package jdbcCRUD_Operation.deleteRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class DeleteRecord {
	public static void main(String[] args) {
		System.out.println("Program Started");
	
		Statement stmt=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Which dept number to delete : ");
		int dno = sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?collegedbms ",user="root"& password="root");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedbms?", "root", "root");
			System.out.println("Connection SuccessFll");
			pstmt=con.prepareStatement("delete from dept where dept_no=?");
			pstmt.setInt(1, dno);
		
			
			int rows = pstmt.executeUpdate();
			System.out.println("Row deleted  : "+rows);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		System.out.println("Program Ended");
	}
}
