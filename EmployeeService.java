package com.infosys.service;
import com.infosys.domain.Employee;
public interface EmployeeService {
	public void insertEmployee(Employee employee) ;
	public void removeEmployee(int empId);
}
