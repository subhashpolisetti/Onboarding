package com.Employee.Onboarding.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Employee.Onboarding.Model.Employee;
import com.Employee.Onboarding.dto.EmpLogDto;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	//Login findByEmployeeId(long employeeId);
	
		Employee findById(long id);
		
		@Query("SELECT new com.Employee.Onboarding.dto.EmpLogDto(e.id,e.employeeName,l.loginTime) FROM Employee e LEFT JOIN e.loginhistory l")
		List<EmpLogDto> getJoinInformation();
		
		

}