package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class UserLogin {
 
	public static void main(String[] args) throws SQLException {
		
try {
		 /// step 1
		
		 DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerdd....");
			
			
			//step2
			Connection conn = DriverManager.getConnection(
					"C:\\Users\\Dell\\Desktop\\hsqldb-2.6.1\\hsqldb\\lib", "SA", "");
				System.out.println("Connected...."+conn);
				//Step 3
				
				

				Scanner scan1 = new Scanner(System.in);
				Scanner scan2 = new Scanner(System.in);
				Scanner scan3 = new Scanner(System.in);
				Scanner scan4 = new Scanner(System.in);
				Scanner scan5 = new Scanner(System.in);
				
				System.out.println("Enter Name : ");
				String pName=scan1.nextLine();
				

				System.out.println("Enter Email : ");
				String pEmail = scan2.nextLine();

				System.out.println("Enter Password  : ");
				String pPassword = scan3.nextLine();
				
				System.out.println("Enter Age  : ");
				int pAge = scan4.nextInt();
				
				System.out.println("Enter Location  : ");
				String pLocation = scan5.nextLine();
				
				try {
					 Person p1= new Person(pName,pEmail,pPassword,pAge,pLocation);
				}
				catch (AgeInvalidException e1){
					System.out.println("Age Exception:"+e1.getMessage());
				}
				 
				 PreparedStatement pst = conn.prepareStatement("insert into PERSON values (?,?,?,?,?)");
					pst.setString(1, pName);
					pst.setString(2, pEmail);
					pst.setString(3, pPassword);
					pst.setInt(4, pAge);
					pst.setString(5, pLocation);
					int rows = pst.executeUpdate();
					System.out.println("Row created : "+rows);
					pst.close();
					conn.close();
					
					
			}

            finally {
            
					
            }
            }
	
	
}
