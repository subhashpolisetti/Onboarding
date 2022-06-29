package com.Employee.Onboarding.ServiceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Onboarding.Model.Employee;
import com.Employee.Onboarding.Model.LoginHistory;
import com.Employee.Onboarding.Repository.EmployeeRepository;
import com.Employee.Onboarding.Repository.LoginHistoryRepository;
import com.Employee.Onboarding.Service.EmployeeService;
import com.Employee.Onboarding.dto.EmpLogDto;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private LoginHistoryRepository loginHistoryRepository;
	
	
	
	@Override
	public Employee setEmpDetails(Employee emp) {
		emp.setPassword("password");
		return this.employeeRepository.save(emp);
	}



	@Override
	public Employee getEmployeeDetails(long id) {
		// Login empLogin=loginRepository.findByEmployeeId((id));
		
		return employeeRepository.findById(id);
		
		
	}



	@Override
	public String validateEmployee(Employee emp) {
		
		long empId=emp.getId();
		
		
		
		Employee employee=employeeRepository.findById(empId);
		
		if(employee==null) {
			return "invalid Id";
		}
		else if(emp.getId()==employee.getId()) {
			
			if(emp.getPassword().equals(employee.getPassword())) {
				
				saveLoginDateTime(emp.getId());
				
				return "success";
			}
			else {
				return "invalid password";
			}
		}
		
		return "invalid Id";
	
	}


	public void saveLoginDateTime(long l) {
		LoginHistory loginHistory=new LoginHistory();
		loginHistory.setEmpId(l);
		loginHistoryRepository.save(loginHistory);
		
	}



	@Override
	public Employee updateEployeeDetails(Employee emp, long id) {
		// TODO Auto-generated method stub
		
		
		
		Employee employee=employeeRepository.findById(id); 
		
		
		employee.setEmployeeName(emp.getEmployeeName());
		
		employee.setDesignation(emp.getDesignation());
		
		employee.setExperience(emp.getExperience());
		
		employee.setQualification(emp.getQualification());
		
		employee.setSalary(emp.getSalary());
		
		Employee updateEmp=employeeRepository.findById(id); 
		
		employeeRepository.save(updateEmp);
		return updateEmp;
	}

	public List<EmpLogDto> getJoinInfo(){
		return employeeRepository.getJoinInformation();
		
	}

	
	

}