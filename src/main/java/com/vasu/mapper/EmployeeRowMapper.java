package com.vasu.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vasu.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	   Employee employee=new Employee();
	   employee.setId(rs.getString("id"));
	   employee.setName(rs.getString("ename"));
	   employee.setDept_name(rs.getString("department_name"));
	   employee.setCtc(rs.getDouble("ctc"));
	   employee.setSalary(rs.getDouble("salary"));
	   employee.setAddress(rs.getString("address"));
	   employee.setEducation(rs.getString("graduation"));
	   employee.setPhone(rs.getString("phone"));
	   employee.setAge(rs.getString("age"));
	   employee.setGender(rs.getString("gender"));
	   employee.setDesignation(rs.getString("designation"));
		return employee;
	}

}
