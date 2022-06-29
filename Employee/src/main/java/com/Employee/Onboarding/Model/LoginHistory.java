package com.Employee.Onboarding.Model;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
@Entity
@Table(name="LoginHistory")
public class LoginHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="empId")
	private long empId;
	@CreationTimestamp
    private LocalDateTime loginTime;
	
	public LoginHistory() {
		
	}

	public LoginHistory(long id, long empId) {
		super();
		this.id = id;
		this.empId = empId;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
	
	
}