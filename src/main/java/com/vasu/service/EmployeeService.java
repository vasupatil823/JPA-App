package com.vasu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vasu.model.Employee;
@Service
public interface EmployeeService {
	public void addEmployee(Employee emp);
    public List<Employee> viewEmployee();
	public Employee getEmployeeById(String id);
	public void updateEmployee(Employee emp);
	public void delete(String id);
	public List<Employee> getMoreDetails(String id);
}
