package com.vasu.utils;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.vasu.dao.EmployeeDAO;

public class EmployeeIdGenerator {
public static String generateId() {
	Random randomGenerator = new Random();
	int first = randomGenerator.nextInt(100) + 1;
	String initial="EMP";
   String empld=null;
	Date date=new Date();
    int day=date.getDate();
    int month=date.getMonth();
    int year=date.getYear()+1900;
    empld=""+initial+""+first+""+day+""+month+""+year+"";
    System.out.println(empld);
	return empld;
}
public static void main(String[] args) {
	generateId();
}
}
