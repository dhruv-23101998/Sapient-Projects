package com.example.demo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unused")
@RestController
public class AppController {
	@Autowired
	private EmployeeService service;
	@GetMapping("/")
	public String func() {
		return "Welcome";
	}
	@GetMapping("/get_all_employees")
	public ArrayList<Employee> getAllEmployees() {
		return service.findAll();
	}
	@GetMapping("/find_employee_on_id/{id}")
	public Employee findBasedOnId(@PathVariable int id) {
		return service.findOneBasedOnId(id);
	}
	@GetMapping("/find_employee_on_name/{name}")
	public Employee findBasedOnName(@PathVariable String name) {
		return service.findOneBasedOnName(name);
	}
	@PostMapping("/add_employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.save(employee);
	}
	@PostMapping("/modify_employee")
	public Employee modify(@RequestBody Employee employee) {
		return service.modifyEmployee(employee);
	}
	@DeleteMapping("/delete_employee_on_id/{id}")
	public ArrayList<Employee> deleteById(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
}