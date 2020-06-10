package com.assignment.week7.Q1;
import java.util.Map;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=
    			new ClassPathXmlApplicationContext("spring.xml");
    	EmployeeDetails obj=(EmployeeDetails)factory.getBean("emp");
    	Scanner in=new Scanner(System.in);
    	Integer id=in.nextInt();
    	Map<Integer,Employee> empdetails=obj.getEmployees();
    	boolean flag=false;
    	for(Map.Entry<Integer,Employee> entry:empdetails.entrySet()) {
    		if(entry.getKey()==id) {
    			flag=true;
    			System.out.println("Employee Name:");
    			System.out.println(entry.getValue().getName());
    			System.out.println("Employee City:");
    			System.out.println(entry.getValue().getCity());
    		}
    	}
    	if(!flag) {
    		System.out.println("No Employee With Given ID Exists");
    	}
    }
}