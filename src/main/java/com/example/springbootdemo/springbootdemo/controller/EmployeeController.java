package com.example.springbootdemo.springbootdemo.controller;

import com.example.springbootdemo.springbootdemo.model.Employee;
import com.example.springbootdemo.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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


}
