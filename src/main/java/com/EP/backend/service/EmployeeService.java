package com.EP.backend.service;
import com.EP.backend.dto.EmployeeRequest;
import com.EP.backend.dto.EmployeeResponse;
import java.util.*;

public interface EmployeeService {
    List<EmployeeResponse> getAllEmployees();

    EmployeeResponse getEmployeeById(int id);

    List<EmployeeResponse> getEmployeesByDepartment(String department);

    EmployeeResponse createEmployee(EmployeeRequest request);

}
