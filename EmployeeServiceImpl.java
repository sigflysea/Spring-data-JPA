package com.infosys.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.domain.Employee;
import com.infosys.repository.EmployeeRepository;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	    @Autowired
	    private EmployeeRepository employeeRepository;  
	   
		public void insertEmployee(Employee employee) {
			
			employeeRepository.saveAndFlush(employee);
			System.out.println("Record added successfully");
	    }
		public void removeEmployee(int empId) {
			 Employee emp = employeeRepository.findById(empId).get();
			 employeeRepository.delete(emp);
                         System.out.println("Record Deleted");
		}	       
}
