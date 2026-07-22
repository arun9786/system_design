package org.unit.testing.integrationtesting.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.unit.testing.integrationtesting.dto.Employee;
import org.unit.testing.integrationtesting.repository.EmployeeRepository;
import org.unit.testing.integrationtesting.service.EmployeeService;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
    @MockitoBean
    private EmployeeService service;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getEmployee() throws Exception {

        when(service.getEmployee(1L)).thenReturn(new Employee(
                1L,
                "Arun",
                75000
        ));

        mockMvc.perform(get("/employees/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Arun"))
                .andExpect(jsonPath("$.salary").value(75000));

        verify(service).getEmployee(1L);
    }

    @Test
    public void createEmployee() throws Exception {
        when(service.createEmployee(any(Employee.class)))
                .thenReturn( new Employee(1L, "Arun", 75000, "IT"));

        String json = objectMapper.writeValueAsString(new Employee(null, "Arunk", 75000, "IT"));

        mockMvc.perform(post("/employees").contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.name").value("Arun"))
                .andExpect(jsonPath("$.salary").value(75000));

        verify(service).createEmployee(any(Employee.class));
    }

    @Test
    public void shouldReturnBadRequestForInvalidDepartment() throws Exception {
        Employee request = new Employee(1L, "Arun", 75000, "");
        String json = objectMapper.writeValueAsString(request);

        mockMvc.perform(post("/employees").contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isBadRequest());

        verify(service, never()).createEmployee(any(Employee.class));
    }

    @Test
    public void shouldReturnBadRequestForInvalidNameOrDepartment() throws Exception {
        Employee request = new Employee(1L, "", 75000, "");

        String json = objectMapper.writeValueAsString(request);

        mockMvc.perform(post("/employees").contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isBadRequest());

        verify(service, never()).createEmployee(any(Employee.class));
    }

}