package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

        @RestController
		@RequestMapping("/employee")
		public class EmployeeController {

		@Autowired
			private EmployeeService employeeService;

			@PostMapping("/save")
			public ResponseEntity<Employee>saveData(@RequestBody Employee employee) {
				Employee emp = employeeService.saveEmployee(employee);
				return ResponseEntity.ok().body(emp);
			}
			
			@GetMapping("/get/{id}")
			public Optional<Employee> getById(@PathVariable("id") Integer Id){
				Optional<Employee> emp1=employeeService.getEmployeeById(Id);
				 return emp1;
			}
			
			@GetMapping("/get/{city}")
			public List<Employee> getByCity(@PathVariable("city") String city) {
				List<Employee> emp2=employeeService.getEmployeeByCity(city);
				return emp2;
			
			}
			
			@GetMapping("/get/{name}")
			public Employee getByName(@PathVariable("Name")String Name) {
				Employee emp3= employeeService.getEmployeeByName(Name);
				return emp3;
			}
			
			@DeleteMapping("/delete/id")
			public void deleteById(@PathVariable("id") Integer Id)throws Exception {
			employeeService.deleteEmployeeById(Id);	
			}

}
