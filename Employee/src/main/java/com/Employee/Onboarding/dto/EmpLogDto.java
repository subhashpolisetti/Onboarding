package com.Employee.Onboarding.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpLogDto {
		private long employeeId;
		private String employeeName;
		private LocalDateTime loginTime;
		public EmpLogDto() {
			
		}
		public long getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(long employeeId) {
			this.employeeId = employeeId;
		}


		public String getEmployeeName() {
			return employeeName;
		}


		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}


		public LocalDateTime getLoginTime() {
			return loginTime;
		}
		public void setLoginTime(LocalDateTime loginTime) {
			this.loginTime = loginTime;
		}
		public EmpLogDto(long employeeId, String employeeName, LocalDateTime loginTime) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.loginTime = loginTime;
		}
		

}