package com.Employee.Onboarding.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Onboarding.Model.DesignationModel;
import com.Employee.Onboarding.Service.DesignationService;




@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders = "*")
@RequestMapping("/api")

public class DesignationController {
	
	@Autowired
	DesignationService designationService;
	
	@GetMapping("/designation")
	public List<DesignationModel> getAll(DesignationModel d){
		return designationService.gettingAll(d);
	}

}
