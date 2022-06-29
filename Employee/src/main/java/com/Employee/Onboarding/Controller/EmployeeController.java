package com.Employee.Onboarding.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Onboarding.Model.Employee;

import com.Employee.Onboarding.ServiceImpl.EmployeeServiceImpl;
import com.Employee.Onboarding.dto.EmpLogDto;




@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders = "*")
@RequestMapping("api")
public class EmployeeController {

	 @Autowired
	 EmployeeServiceImpl employeeServiceImpl;
	 
	 @PostMapping("/setEmployeeDetails")
	 public Employee setDetails(@RequestBody Employee emp) {
		 return this.employeeServiceImpl.setEmpDetails(emp);
	 }
	 
	 @GetMapping("/employee/{id}") 
	 public Employee getDetails(@PathVariable("id") Long id) {
		 
		return employeeServiceImpl.getEmployeeDetails(id);
	
		 
	}
	
	 @PostMapping("/emplogin")
		public String validateEmployee(@RequestBody Employee emp){
		 
			
		 	return employeeServiceImpl.validateEmployee(emp);
			
		}
	 
	 @PostMapping("/empupdate/{id}")
	 public Employee updateEmployee(@RequestBody Employee emp,@PathVariable("id") Long id ) {
		 
		 return employeeServiceImpl.updateEployeeDetails(emp, id);
	 }
	 @GetMapping("/report")
	 public List<EmpLogDto> getInfo() {
		return employeeServiceImpl.getJoinInfo();
	}
}
