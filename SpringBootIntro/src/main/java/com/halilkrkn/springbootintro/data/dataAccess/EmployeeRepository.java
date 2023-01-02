package com.halilkrkn.springbootintro.data.dataAccess;

import com.halilkrkn.springbootintro.data.entities.Employees;

import java.util.List;

public interface EmployeeRepository {

    List<Employees> getEmployee();

}
