package com.vasu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vasu.mapper.EmployeeRowMapper;
import com.vasu.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
    JdbcTemplate template;
	@Autowired
	public Environment property;
	public List<Employee> viewEmployee() {
		String sql="select * from employee_detail";
		return template.query(sql, new EmployeeRowMapper());
	}
	public int addEmployee(Employee emp) {
		String sql=property.getProperty("addEmployee");
		return template.update(sql,emp.getId(),emp.getName(),emp.getDept_name(), emp.getCtc(), emp.getSalary(),emp.getAddress(),emp.getEducation(),emp.getPhone(),emp.getAge(),emp.getGender(),emp.getDesignation());
	}
	public Employee getEmployeeById(String id) {
		String sql=property.getProperty("getEmployeeById");
		Employee emp=template.queryForObject(sql, new Object[]{id}, new EmployeeRowMapper());
		return emp;
		}
	public int updateEmployee(Employee emp) {
		emp.setCtc(emp.getSalary()*12);
		String updateCtc="update employee_detail set ctc="+emp.getCtc()+" where id='"+emp.getId()+"'";
		int updateResult=template.update(updateCtc);
		String sql="update employee_detail set ename='"+emp.getName()+"', designation='"+emp.getDesignation()+"', salary='"+emp.getSalary()+"' where id='"+emp.getId()+"'";		
	   int result=template.update(sql);
		return result;
	}
	public int delete(String id) {
		String sql="delete from employee_detail where id='"+id+"'";
		return template.update(sql);
	}
	public Employee getMoreDetails(String id) {
		String sql=property.getProperty("getMoreDetailsForEmployee");
	   return  template.queryForObject(sql, new Object[] {id}, new EmployeeRowMapper());

 				}

}
