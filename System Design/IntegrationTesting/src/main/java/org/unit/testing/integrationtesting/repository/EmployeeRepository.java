package org.unit.testing.integrationtesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unit.testing.integrationtesting.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartment(String department);

}
