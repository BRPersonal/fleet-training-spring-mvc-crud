package com.fleet.training.service;

import java.util.List;

import com.fleet.training.exception.EmployeeNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.fleet.training.repository.EmployeeRepository;
import com.fleet.training.domain.Employee;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService
{
    private final EmployeeRepository repository;

    @Override
    public List<Employee> findAll(boolean ascending)
    {
        return ascending ? repository.findAllByOrderByLastNameAsc()
                : repository.findAllByOrderByLastNameDesc() ;
    }

    @Override
    public Employee findById(Integer theId)
    {
        return repository.findById(theId).orElseThrow(() -> new EmployeeNotFoundException(theId));
    }

    @Override
    public void save(Employee theEmployee)
    {
        repository.save(theEmployee);
    }

    @Override
    public void deleteById(Integer theId)
    {
        repository.deleteById(theId);
    }
}
