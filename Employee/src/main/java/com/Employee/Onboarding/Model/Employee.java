package com.Employee.Onboarding.Model;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;
import lombok.ToString;
@Data

@ToString

@Entity
@Table(name="t_employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private long id;
	
	
	@Column(name="emp_name")
	private String employeeName;
	
	@Column(name="experience")
	private double experience;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="qualification_doc")
	private Blob qualificationDoc;
	
	@Column(name="ssc_certificate")
	private Blob sscCertificate;
	
	@Column(name="releaving_letter")
	private Blob releavingLetter;
	
	
	private String password;
	@OneToMany(targetEntity=LoginHistory.class, cascade= CascadeType.ALL)
	@JoinColumn(name="empId",referencedColumnName="employee_id")
	private List<LoginHistory> loginhistory;

	@OneToMany()
	@JoinColumn(name="empId",referencedColumnName="employee_id", nullable =true)
	 @OnDelete(action = OnDeleteAction.CASCADE)
	List<LoginHistory>loginHistory=new ArrayList<>();
	
	public Employee() {}
	
	public List<LoginHistory> getLoginHistory() {
		return loginHistory;
	}

	public void setLoginHistory(List<LoginHistory> loginHistory) {
		this.loginHistory = loginHistory;
	}

	public Employee(long id,String employeeName,double experience,String qualification,double salary,String designation,Blob qualificationDoc,Blob sscCertificate,Blob releavingLetter,String password)
	{
		this.id=id;
		this.employeeName=employeeName;
		this.experience=experience;
		this.qualification=qualification;
		this.salary=salary;
		this.designation=qualification;
		this.qualificationDoc=qualificationDoc;
		this.sscCertificate=sscCertificate;
		this.releavingLetter=releavingLetter;
		this.password=password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Blob getQualificationDoc() {
		return qualificationDoc;
	}

	public void setQualificationDoc(Blob qualificationDoc) {
		this.qualificationDoc = qualificationDoc;
	}

	public Blob getSscCertificate() {
		return sscCertificate;
	}

	public void setSscCertificate(Blob sscCertificate) {
		this.sscCertificate = sscCertificate;
	}

	public Blob getReleavingLetter() {
		return releavingLetter;
	}

	public void setReleavingLetter(Blob releavingLetter) {
		this.releavingLetter = releavingLetter;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
