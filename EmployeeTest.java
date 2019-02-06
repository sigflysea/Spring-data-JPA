
package com.infosys.client;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.infosys.domain.Employee;
import com.infosys.service.EmployeeService;
public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		Employee emp1 = new Employee(1001, "Susan", "Engineering");
		Employee emp2 = new Employee(1003, "Allen", "Account");
		
		service.insertEmployee(emp1);
		service.insertEmployee(emp2);
	
		System.out.println("Enter the employee id to be deleted");
		Scanner scanner = new Scanner(System.in);
		int empId = scanner.nextInt();
		service.removeEmployee(empId);
	
		scanner.close();
	}
}
