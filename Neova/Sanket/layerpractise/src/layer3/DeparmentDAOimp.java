package layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import layer2.Department;

public class DeparmentDAOimp implements DepartmentDAO {

	Connection conn;

	public DeparmentDAOimp() {
		try {
			 System.out.println("DepartmentDAOimp :loading Drivers ...Getting the connection..");
			 //Register the user
			 DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			 System.out.println("Drivers Registered..");
			 /// Establishing a connection 
			 conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb")
		}
		catch ( SQLException e)
		{
			e.printStackTrace();
		}		 
	 }

	@Override
	public void insertDepartment(Department dobj) {
		System.out.println("Insert");

		System.out.println("DepartmentDAOimp : insertDepartment(Department)-inserting department");
		try {
			PrepareStatement pst = conn.prepareStatement("insert into dept (?,?,?)");
			pst.setInt(1, dobj.getDepartmentNumber());
			pst.setString(2, getDepartmentName());
			pst.setString(3, getDepartmentLocation());
			int rows = pst.executeUpdate();
			System.out.println("Row Created :" + rows);
			pst.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Department selectDepartment(int dno) {
		System.out.println("Select From Dept");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> selectDepartment() {
		 List<Department> deptList =new ArrayList<Department>();
		 try {
			 System.out.println("DepartmentDAOimp ;Selecting all Department");
		 
		     Statement st =conn.createStatement();
		     Result rs= st.executeQuery("select * from dept");
		     while(rs.next()) {
		    	 Department dept =new Department();
		    	 dept.setDepartmentNumber(rs.getInt(1));
		    	 dept.setDepartmentName(rs.getString(2));
		    	 dept.setDepartmentLocation(rs.getString(3));
		    	 deptList.add(dept);
		    	 
		     }
		     
		     
		     catch( SQLException e) { e.printStackTrace();}
		     
		     return deptList;
		     
		 
		 
		 	}

	@Override
	public void updateDepartment(Department dobj) {
		System.out.println("Update");// TODO Auto-generated method stub

	}

	@Override
	public void deleteDepartment(int dno) {
		System.out.println("Delete");// TODO Auto-generated method stub

	}

}
