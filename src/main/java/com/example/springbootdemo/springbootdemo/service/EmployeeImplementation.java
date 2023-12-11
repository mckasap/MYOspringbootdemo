package com.example.springbootdemo.springbootdemo.service;

import com.example.springbootdemo.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeImplementation implements EmployeeService {
    List<Employee> empList = new ArrayList<>();

    @Override
    public Employee empSave(Employee E) {
        if (E.getEmpId() == null || E.getEmpEmail().isEmpty()) {
            E.setEmpId(UUID.randomUUID().toString());
        }
        empList.add(E);
        return E;
    }

    @Override
    public List<Employee> getEmployees() {
        return empList;
    }

    @Override
    public Employee getEmployeeById(String id) {
        Employee e = empList
                .stream()
                .filter(t->t.getEmpId().equalsIgnoreCase(id))
                .findFirst()
                .get();
        return e;
    }

    @Override
    public String deleteEmpById(String id) {
        return null;
    }
}
