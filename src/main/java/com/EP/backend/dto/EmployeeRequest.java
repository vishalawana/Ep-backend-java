package com.EP.backend.dto;

import jakarta.validation.constraints.*;

public record EmployeeRequest(
    @NotBlank(message = "Name is required")
    String name,

    @NotBlank(message = "Email is required")
    @Email(message = "email should be valid")
    String email,

    @NotBlank(message = "Department is required")
    String department,

    @NotNull(message = "Salary is required")
    @DecimalMin(value = "0", inclusive  = false, message = "Salary must be greater than 0")
    Double salary

) {
}