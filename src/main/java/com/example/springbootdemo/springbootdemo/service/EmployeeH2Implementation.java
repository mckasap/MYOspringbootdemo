package com.example.springbootdemo.springbootdemo.service;

import com.example.springbootdemo.springbootdemo.entity.EmployeeEntity;
import com.example.springbootdemo.springbootdemo.model.Employee;
import com.example.springbootdemo.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeH2Implementation implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee empSave(Employee E) {
        if (E.getEmpId() == null || E.getEmpEmail().isEmpty()) {
            E.setEmpId(UUID.randomUUID().toString());
        }

        EmployeeEntity empEnt = new EmployeeEntity();
        BeanUtils.copyProperties(E,empEnt);
        employeeRepository.save(empEnt);
        //empList.add(E);
        return E;

    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    @Override
    public String deleteEmpById(String id) {
        return null;
    }
}
