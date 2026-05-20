package com.EP.backend.service.impl;

import org.springframework.stereotype.Service;

import com.EP.backend.dto.EmployeeResponse;
import com.EP.backend.dto.EmployeeRequest;
import com.EP.backend.service.EmployeeService;
import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

     private final List<EmployeeResponse> employees = new ArrayList<>(List.of(
        new EmployeeResponse(1, "Alice Johnson",  "alice@worknest.com",  "Engineering", 95000),
        new EmployeeResponse(2, "Bob Smith",      "bob@worknest.com",    "Marketing",   72000),
        new EmployeeResponse(3, "Carol White",    "carol@worknest.com",  "Engineering", 98000),
        new EmployeeResponse(4, "David Brown",    "david@worknest.com",  "HR",          65000),
        new EmployeeResponse(5, "Eva Martinez",   "eva@worknest.com",    "Marketing",   74000)
    ));

    private int nextId = 6;

    @Override
    public List<EmployeeResponse> getAllEmployees(){
        return employees;
    }

    @Override
    public EmployeeResponse getEmployeeById(int id){
        return employees.stream()
        .filter(emp -> emp.id() ==id)
        .findFirst()
        .orElse(null);
    }
    
    @Override
    public List<EmployeeResponse> getEmployeesByDepartment(String department){
        return employees.stream()
                .filter(emp -> emp.department().equalsIgnoreCase(department))
                .toList();
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest request){

        EmployeeResponse newEmployee = new EmployeeResponse(
            nextId++,
            request.name(),
            request.email(),
            request.department(),
            request.salary()
        );
        employees.add(newEmployee);
        return newEmployee;
    }

    
}
