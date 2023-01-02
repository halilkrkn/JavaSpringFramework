package com.halilkrkn.springbootintro.api.controllers;

import com.halilkrkn.springbootintro.data.dataAccess.EmployeeRepository;
import com.halilkrkn.springbootintro.data.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public List<Employees> employeesList(){
       return employeeRepository.getEmployee();
    }


}
