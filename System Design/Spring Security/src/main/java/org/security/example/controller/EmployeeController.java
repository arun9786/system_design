package org.security.example.controller;

import lombok.RequiredArgsConstructor;
import org.security.example.entity.Employee;
import org.security.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    public Employee save(
            @RequestBody Employee employee) {

        return service.save(employee);

    }

    @GetMapping
    public List<Employee> getAll() {

        return service.findAll();

    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Deleted Successfully";
    }

}
