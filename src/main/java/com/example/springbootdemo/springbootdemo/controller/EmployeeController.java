package com.example.springbootdemo.springbootdemo.controller;

import com.example.springbootdemo.springbootdemo.model.Employee;
import com.example.springbootdemo.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Qualifier("employeeImplementation")
    @Autowired
    EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee E){
      return   service.empSave(E);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable(name= "id") String id){
        return service.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById( @PathVariable String id){
        return service.deleteEmpById(id);
    }



}
