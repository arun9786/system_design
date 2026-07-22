package org.unit.testing.integrationtesting.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.unit.testing.integrationtesting.dto.Employee;
import org.unit.testing.integrationtesting.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public Employee findAll() {
        return service.getEmployee();
    }

//    @GetMapping("/{id}")
//    public Employee getEmployee(
//            @PathVariable Long id) {
//
//        System.out.println("Getting employee with id: " + id);
//
//        return service.getEmployee(id);
//    }
//
//    @PostMapping
//    public Employee createEmployee(
//            @Valid @RequestBody Employee employee) {
//
//        return service.createEmployee(employee);
//    }

}
