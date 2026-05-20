package com.EP.backend.dto;

public record EmployeeResponse (
    long id,
    String name,
    String email,
    String department,
    double salary
){

}
