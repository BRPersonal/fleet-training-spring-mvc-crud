package com.fleet.training.repository;

import com.fleet.training.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
    public List<Employee> findAllByOrderByLastNameAsc();
    public List<Employee> findAllByOrderByLastNameDesc();

}
