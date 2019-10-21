package com.codeclan.employeetracking;

import com.codeclan.employeetracking.models.Employee;
import com.codeclan.employeetracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("Liliana", 40, 2231, "liliana@liliana.com");
		employeeRepository.save(employee);
	}

}
