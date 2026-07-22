package org.unit.testing.junit.repository;

import org.springframework.stereotype.Repository;
import org.unit.testing.junit.dto.Employee;

@Repository
public interface EmployeeRepository {

    Employee save(Employee employee);

}
