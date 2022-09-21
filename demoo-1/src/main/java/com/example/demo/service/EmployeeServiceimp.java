package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceimp implements EmployeeService {
 @Autowired
 private EmployeeRepository employeeRepository;

@Override
public Employee saveEmployee(Employee employee) {

	return employeeRepository.save(employee);
}

@Override
public Optional<Employee> getEmployeeById(Integer Id) {
	
	return employeeRepository.findById(Id);

}

@Override
public List<Employee> getEmployeeByCity(String city) {
	List<Employee> emp3=employeeRepository.findByCity(city);
	return emp3;
}

@Override
public Employee getEmployeeByName(String Name) {
	Employee emp4=employeeRepository.findByName(Name);
	return emp4;
}

@Override
public void deleteEmployeeById(Integer Id) {
	employeeRepository.deleteById(Id);
}

}