package com.EP.backend.controller;

import com.EP.backend.dto.EmployeeRequest;
import com.EP.backend.dto.EmployeeResponse;
import com.EP.backend.service.EmployeeService;
import jakarta.validation.Valid;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees(){
        logger.info("Received request for GET /api/employees");
        List<EmployeeResponse> employees = employeeService.getAllEmployees();
        logger.debug("Returning {} employees", employees.size());
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable int id) {
        logger.info("Received request for GET /api/employees/{}", id);
        EmployeeResponse employee = employeeService.getEmployeeById(id);

        if (employee == null) {
            logger.warn("Employee not found for id={}", id);
            return ResponseEntity.notFound().build();
        }

        logger.debug("Returning employee {}", employee);
        return ResponseEntity.ok(employee);
    }
    
}
