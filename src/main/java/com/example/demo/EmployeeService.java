package com.example.demo;

import java.util.ArrayList;
import org.springframework.stereotype.Component;
@Component
public class EmployeeService {
	private static ArrayList<Employee> employees=new ArrayList<Employee>();
	static {
		employees.add(new Employee(1,"A","Bangalore"));
		employees.add(new Employee(2,"B","Bombay"));
		employees.add(new Employee(3,"C","Mumbai"));
		employees.add(new Employee(4,"D","Delhi"));
		employees.add(new Employee(5,"E","Madras"));
	}
	public ArrayList<Employee> findAll() {
		return employees;
	}
	public Employee save(Employee employee) {
		employees.add(employee);
		return employee;
	}
	public ArrayList<Employee> deleteEmployee(int id) {
		for(Employee employee:employees) {
			if(employee.getId()==id) {
				employees.remove(employee);
				break;
			}
		}
		return employees;
	}
	public Employee modifyEmployee(Employee newemployee) {
		for(Employee employee:employees) {
			if(employee.getId()==newemployee.getId()) {
				employee.setName(newemployee.getName());
				employee.setCity(newemployee.getCity());
				return employee;
			}
		}
		return null;
	}
	public Employee findOneBasedOnId(int id) {
		for(Employee employee:employees) {
			if(employee.getId()==id) {
				return employee;
			}
		}
		return null;
	}
	public Employee findOneBasedOnName(String name) {
		for(Employee employee:employees) {
			if(employee.getName().equals(name)) {
				return employee;
			}
		}
		return null;
	}
}