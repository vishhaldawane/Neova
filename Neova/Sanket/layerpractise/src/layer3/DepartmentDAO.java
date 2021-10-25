package layer3;

import java.util.List;

import layer2.Department;

public interface DepartmentDAO {
 
	void insertDepartment(Department dobj);
	Department selectDepartment(int dno);
	List <Department> selectDepartment();
	void updateDepartment(Department dobj);
	void deleteDepartment(int dno);
}
