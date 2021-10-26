package com.vasu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vasu.model.Employee;
@Repository
public interface EmployeeDAO {
	public List<Employee> viewEmployee();
	public int addEmployee(Employee emp);
	public Employee getEmployeeById(String id);
	public int updateEmployee(Employee emp);
	public int delete(String id);
	public  Employee getMoreDetails(String id);

}
