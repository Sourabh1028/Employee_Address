package com.geekster.Employee_Address.Repositary;

import com.geekster.Employee_Address.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {

    public Iterable<Employee> findAll();
}
