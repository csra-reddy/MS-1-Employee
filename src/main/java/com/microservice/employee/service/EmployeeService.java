package com.microservice.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.employee.entity.Employee;
import com.microservice.employee.repository.EmployeeRepository;
import com.microservice.employee.responseVO.Department;
import com.microservice.employee.responseVO.ResponseVO;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public ResponseVO getEmployeeWithDepartment(int id) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(id).get();
		int deptId=employee.getDepartmentId();
		Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+deptId,Department.class);
		ResponseVO responseVO=new ResponseVO();
		responseVO.setEmployee(employee);
		responseVO.setDepartment(department);
		return responseVO;
	}

}
