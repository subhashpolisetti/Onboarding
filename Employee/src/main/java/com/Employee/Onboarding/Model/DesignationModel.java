package com.Employee.Onboarding.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_designation_master")
public class DesignationModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="designation_name")
	private String designationName;
	
	DesignationModel(){}
	
	DesignationModel(int id,String designation_name){
		this.id=id;
		this.designationName=designation_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation_name() {
		return designationName;
	}
	public void setDesignation_name(String designation_name) {
		this.designationName = designation_name;
	}
	

}

