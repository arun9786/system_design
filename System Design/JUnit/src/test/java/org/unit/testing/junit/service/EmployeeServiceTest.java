package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.unit.testing.junit.dto.Employee;
import org.unit.testing.junit.repository.EmployeeRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;


    @Test
    void testFindById() {

        employeeService.createEmployee("Arun", 75000);

        ArgumentCaptor<Employee> captor = ArgumentCaptor.forClass(Employee.class);

        verify(employeeRepository).save(captor.capture());

        Employee captured = captor.getValue();

        assertEquals("Arun", captured.getName());

        assertEquals(75000, captured.getSalary());
    }
}
