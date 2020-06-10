package com.example.demo;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController{
	public AppController() {
		super();
	}
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("find_details")
	public String find(HttpServletRequest req) {
		Integer id=Integer.parseInt(req.getParameter("studentid"));
		ApplicationContext factory=
    			new ClassPathXmlApplicationContext("spring.xml");
		StudentDetails obj=(StudentDetails)factory.getBean("stud");
		Map<Integer,Student> students=obj.getStudents();
		Student mystud=null;
		for(Map.Entry<Integer,Student> entry:students.entrySet()) {
			if(id==entry.getKey()) {
				mystud=entry.getValue();
			}
		}
		if(mystud==null)
			return "error";
		HttpSession session=req.getSession();
		session.setAttribute("studentname",mystud.getName());
		session.setAttribute("studentcity",mystud.getCity());
		return "result";
	}
}