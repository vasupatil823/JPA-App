package com.vasu.model;

import javax.validation.constraints.Size;

public class Employee {
	private String id;
	@Size(min=1, message="required")
	private String name;
	private String dept_name;
	private double ctc;
	private String designation;
	private double salary;
	private String address;
	private String education;
	private String phone;
	private String age;
	private String gender;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		System.out.println("Conflict testing:-1234");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept_name=" + dept_name + ", ctc=" + ctc + ", designation="
				+ designation + ", salary=" + salary + ", address=" + address + ", education=" + education + ", phone="
				+ phone + ", age=" + age + ", gender=" + gender + "]";
	}
		
}
