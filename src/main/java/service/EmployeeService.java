package service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.Employee;

public class EmployeeService {

	List<Employee> empList = new ArrayList<>();

	public EmployeeService() {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setAdmin(true);
		e1.setFirstName("Vanshika");
		e1.setLastName("Yadav");
		e1.setUserName("anshi");
		e1.setPassword( "1234");
		empList.add(e1);
		Employee e2= new Employee();
		e2.setId(2);
		e2.setAdmin(false);
		e2.setFirstName("Pratiksha");
		e2.setLastName("Trivedi");
		e2.setUserName("riya");
		e2.setPassword( "123");
		empList.add(e2);
		Employee e3= new Employee();
		e3.setId(2);
		e3.setAdmin(false);
		e3.setFirstName("Jiya");
		e3.setLastName("Soni");
		e3.setUserName("ram");
		e3.setPassword( "321");
		empList.add(e3);
		
		System.out.println(empList);
	}

	public List<Employee> getList() {
		return empList;
	}

	public Employee login(String userName, String password) {
	Optional<Employee> authenticEmp= empList.stream().filter(employee -> employee.getUserName().equals(userName)  && employee.getPassword().equals(password)).findFirst();	
	if(authenticEmp.isPresent())
	{
	return 	authenticEmp.get();
	}
		return null;
	}
}