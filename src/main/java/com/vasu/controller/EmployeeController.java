package com.vasu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vasu.model.Employee;
import com.vasu.service.EmployeeService;

@Controller 
public class EmployeeController {	
	@Autowired
	EmployeeService service;
	
@GetMapping("/viewEmployeeList")
public String getEmployees( Model model) {    
	List<Employee> list=service.viewEmployee();
	model.addAttribute("employeeList", list);
	return "employeeList";
}
@RequestMapping("addEmployeeForm")
public String addEmployeeForm(Model model) {
	Employee emp=new Employee();
	model.addAttribute("employee", emp);
	return "addEmployeeForm";
}
@PostMapping("addEmployee")
public String addEmployee(@Valid @ModelAttribute("employee") Employee emp, BindingResult rs) {
	if(rs.hasErrors()) {
		return "addEmployeeForm";
	}
	else {
		
	service.addEmployee(emp);
	return "redirect:/viewEmployeeList";
	}
}
@RequestMapping("editemp/{id}")
public String editEmployee(@PathVariable String id, Model model) {
	Employee emp=service.getEmployeeById(id);
	model.addAttribute("employee", emp);
	return "editEmployeeForm";
  }
@PostMapping("editEmployee")
public String editEmployee(@ModelAttribute("employee") Employee emp) {
	service.updateEmployee(emp);
	return "redirect:/viewEmployeeList";
}
@GetMapping("delete/{id}")
public String delete(@PathVariable String id) {
	service.delete(id);
	return "redirect:/viewEmployeeList";
}
@GetMapping("getEmpDetails/{id}")
		public String getMoreEmployee(@PathVariable String id, Model model) {
	List<Employee> list=service.getMoreDetails(id);
	System.out.println("in controller : " +list);
	model.addAttribute("moreEmployeeDetail", list);
	return "moreEmpDetailsPage";
		}
}
