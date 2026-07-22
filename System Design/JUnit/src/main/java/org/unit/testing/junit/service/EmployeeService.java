package org.unit.testing.junit.service;

import org.springframework.stereotype.Service;
import org.unit.testing.junit.dto.Employee;
import org.unit.testing.junit.repository.EmployeeRepository;

public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void createEmployee(
            String name,
            double salary) {

        Employee employee = new Employee();

        employee.setName(name);
        employee.setSalary(salary);

        repository.save(employee);
    }
}
