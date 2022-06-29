package com.Employee.Onboarding.Service;



import java.util.List;

import com.Employee.Onboarding.Model.Employee;
import com.Employee.Onboarding.dto.EmpLogDto;


public interface EmployeeService {

	public Employee setEmpDetails(Employee emp);
	
	//get employee details
	List<EmpLogDto> getJoinInfo();
	
	public Employee getEmployeeDetails(long id);
	
	public Employee updateEployeeDetails(Employee emp,long id);
	
	String validateEmployee(Employee emp);
}