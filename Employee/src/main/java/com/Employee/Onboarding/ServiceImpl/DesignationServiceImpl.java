package com.Employee.Onboarding.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Onboarding.Model.DesignationModel;
import com.Employee.Onboarding.Repository.DesignationRepository;
import com.Employee.Onboarding.Service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {
	 @Autowired
	 DesignationRepository  designationRepository;
	 
	 public List<DesignationModel> gettingAll(DesignationModel d){
		 return designationRepository.findAll();
	 }

}