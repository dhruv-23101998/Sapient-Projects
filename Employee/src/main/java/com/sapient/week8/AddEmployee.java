package com.sapient.week8;
import java.util.*;
public class AddEmployee {
	List<Employee> list=new ArrayList<Employee>();
	void addEmployee(Employee employee) {
		list.add(employee);
	}
	Employee getEmployee(int id) {
		for(Employee employee:list) {
			if(employee.getId()==id) {
				return employee;
			}
		}
		return null;
	}
}