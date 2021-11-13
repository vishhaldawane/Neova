package lakhanProjectForDatabase.SelectRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecords {
	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered succeswsfull...");
			Connection con=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connection established succeswsfull...");
			Statement st=con.createStatement();
			ResultSet result=st.executeQuery("select * from dept3");
			
			while(result.next())
			{
				int dno=result.getInt(1); 
				String dnm = result.getString(2);
				String loc = result.getString(3);
				System.out.println("NUMBER    : "+dno);
				System.out.println("STRING1   : "+dnm);
				System.out.println("STRING2   : "+loc);
				System.out.println("--------------------");
			
			}
			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("Program Ended");
	}

}
