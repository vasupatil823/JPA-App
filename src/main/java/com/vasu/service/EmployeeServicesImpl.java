package com.vasu.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.Precision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasu.dao.EmployeeDAO;
import com.vasu.model.Employee;
import com.vasu.utils.DecimalUtils;
import com.vasu.utils.EmployeeIdGenerator;
@Service
public class EmployeeServicesImpl implements EmployeeService {
@Autowired
EmployeeDAO dao;
	public void addEmployee(Employee emp) {
		double salary=emp.getCtc()/1.2*10000;
		double roundSalary=Precision.round(salary, 2);
		emp.setSalary(roundSalary);
		EmployeeIdGenerator generate=new EmployeeIdGenerator();
		String id=generate.generateId();
		System.out.println(id);
		emp.setId(id);
		dao.addEmployee(emp);
}
	public List<Employee> viewEmployee() {
		return dao.viewEmployee();
	}
	public Employee getEmployeeById(String id) {
		return dao.getEmployeeById(id);
	}
	public void updateEmployee(Employee emp) {
		 dao.updateEmployee(emp);
	}
	public void delete(String id) {
	     dao.delete(id);		
	}
	public List<Employee> getMoreDetails(String id){
		Employee emp=dao.getMoreDetails(id);
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(emp);
		System.out.println(employee);
		return employee;
	}
}
