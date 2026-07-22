package org.unit.testing.integrationtesting.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.unit.testing.integrationtesting.entity.Employee;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void shouldFindEmployeesByDepartment() {
        repository.save(
                new Employee("Arun", "IT")
        );
        repository.save(
                new Employee("Rahul", "HR")
        );
        repository.save(
                new Employee("John", "IT")
        );
        List<Employee> employees =
                repository.findByDepartment("IT");
        assertEquals(2, employees.size());
    }
}
