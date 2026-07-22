package org.unit.testing.integrationtesting.service;

import org.springframework.stereotype.Service;
import org.unit.testing.integrationtesting.dto.Employee;

@Service
public class EmployeeService {

    public Employee getEmployee() {
        return new Employee(
                1L,
                "Arun",
                75000
        );
    }

    public Employee getEmployee(Long id) {

        return new Employee(
                id,
                "Arun",
                75000
        );
    }

    public Employee createEmployee(Employee employee) {

        employee.setId(1L);

        return employee;
    }


}
