package com.example.springbootdemo.springbootdemo.repository;

import com.example.springbootdemo.springbootdemo.controller.EmployeeController2;
import com.example.springbootdemo.springbootdemo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {

}
