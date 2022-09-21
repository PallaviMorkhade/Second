package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {
public Employee saveEmployee(Employee employee);
public Optional<Employee> getEmployeeById(Integer Id);
public List<Employee> getEmployeeByCity(String city);
public Employee getEmployeeByName(String name);
void deleteEmployeeById(Integer Id);
}



