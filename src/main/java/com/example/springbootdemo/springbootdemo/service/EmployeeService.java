package com.example.springbootdemo.springbootdemo.service;

import com.example.springbootdemo.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee empSave(Employee E);

    public List<Employee> getEmployees();

    public Employee getEmployeeById(String id);

    public String deleteEmpById(String id);
}
