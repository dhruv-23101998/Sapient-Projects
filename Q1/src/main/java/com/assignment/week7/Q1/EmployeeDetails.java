package com.assignment.week7.Q1;
import java.util.HashMap;
import java.util.Map;
public class EmployeeDetails {
	private Map<Integer,Employee> employees=new HashMap<Integer,Employee>();
	public Map<Integer, Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Map<Integer, Employee> employees) {
		this.employees = employees;
	}
}