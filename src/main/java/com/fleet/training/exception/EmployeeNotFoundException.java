package com.fleet.training.exception;

public class EmployeeNotFoundException extends RuntimeException
{
    public EmployeeNotFoundException(Integer id)
    {
        super(String.format("could not find employee %s",id));
    }
}
