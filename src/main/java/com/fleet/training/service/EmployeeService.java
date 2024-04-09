package com.fleet.training.service;

import com.fleet.training.domain.Employee;
import java.util.List;

public interface EmployeeService
{
    List<Employee> findAll(boolean ascending);

    Employee findById(Integer theId);

    void save(Employee theEmployee);

    void deleteById(Integer theId);

}
