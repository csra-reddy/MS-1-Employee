package com.microservice.employee.responseVO;

import com.microservice.employee.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVO {
	
	private Employee employee;
	private Department department;

}
