package com.example.springbootdemo.springbootdemo.controller;

import com.example.springbootdemo.springbootdemo.model.Employee;
import com.example.springbootdemo.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/employee")
public class EmployeeController2 {
    @Autowired
    @Qualifier("employeeH2Implementation")
    EmployeeService employeeService;
    @PostMapping
    public Employee save(@RequestBody Employee E){
       return  employeeService.empSave(E);
    }

    @GetMapping()
    public List<Employee> getAllEmployee(){
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable  String id){

        return employeeService.getEmployeeById(id);

    }
}
