package com.sapient.week8;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {
    private AddEmployee app;
    
    @Before
    public void setup() {
        app = new AddEmployee();
    }
    
    
    @Test
    public void test1() {
        app.addEmployee(new Employee(1,"A","Bangalore"));
        app.addEmployee(new Employee(2,"B","Mumbai"));
        app.addEmployee(new Employee(3,"C","Bombay"));
        app.addEmployee(new Employee(4,"D","Delhi"));
        app.addEmployee(new Employee(5,"E","NewYork"));
        Employee ans = app.getEmployee(4);
        assertTrue(ans.getName() == "D");
        assertTrue(ans.getCity()=="Delhi");
    }

    @Test
    public void test2() {
        app.addEmployee(new Employee(1,"A","Bangalore"));
        app.addEmployee(new Employee(2,"B","Mumbai"));
        app.addEmployee(new Employee(3,"C","Bombay"));
        app.addEmployee(new Employee(4,"D","Delhi"));
        app.addEmployee(new Employee(5,"E","NewYork"));
        Employee ans = app.getEmployee(3);
        assertTrue(ans.getName() == "C");
        assertTrue(ans.getCity()=="Bombay");
    }

    @Test
    public void test3() {
        app.addEmployee(new Employee(1,"A","Bangalore"));
        app.addEmployee(new Employee(2,"B","Mumbai"));
        app.addEmployee(new Employee(3,"C","Bombay"));
        app.addEmployee(new Employee(4,"D","Delhi"));
        app.addEmployee(new Employee(5,"E","NewYork"));
        Employee ans = app.getEmployee(1);
        assertTrue(ans.getName() == "A");
        assertTrue(ans.getCity()=="Bangalore");
    }
}