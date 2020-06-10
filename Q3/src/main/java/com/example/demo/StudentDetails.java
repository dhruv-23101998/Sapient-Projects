package com.example.demo;
import java.util.HashMap;
import java.util.Map;
public class StudentDetails {
	private Map<Integer,Student> students=new HashMap<Integer,Student>();
	public Map<Integer, Student> getStudents() {
		return students;
	}
	public void setStudents(Map<Integer, Student> students) {
		this.students = students;
	}
}