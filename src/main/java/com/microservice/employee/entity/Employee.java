package com.microservice.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Emp_Details")
public class Employee {
	
	@Id
	@GeneratedValue
	private int employeeId;
	private String name;
	private String address;
	private int departmentId;

}
