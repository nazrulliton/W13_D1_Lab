package com.codeclan.example.employees;

import com.codeclan.example.employees.model.Employee;
import com.codeclan.example.employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Employee employee = new Employee("Dave Chappelle", 35, 666, "dc@gmail.com" );
		Employee employee1 = new Employee("Colin Chappelle", 25, 646, "d4@gmail.com" );
				employeeRepository.save(employee);
				employeeRepository.save(employee1);
	}

}
