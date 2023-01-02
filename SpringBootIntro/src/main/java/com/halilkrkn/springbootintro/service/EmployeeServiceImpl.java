package com.halilkrkn.springbootintro.service;

import com.halilkrkn.springbootintro.data.dataAccess.EmployeeRepository;
import com.halilkrkn.springbootintro.data.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public List<Employees> getEmployee() {
        return this.employeeRepository.getEmployee();
    }
}
