package com.sandaru.crud_rest_api.mapper;

import com.sandaru.crud_rest_api.dto.EmployeeDto;
import com.sandaru.crud_rest_api.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
             employee.getId(),
             employee.getFirstName(),
             employee.getLastName(),
             employee.getEmail()
        );
    }

    public static Employee mapToEmployeeEntity(EmployeeDto employeeDto){
        return new Employee(
              employeeDto.getId(),
              employeeDto.getFirstName(),
              employeeDto.getLastName(),
              employeeDto.getEmail()
        );
    }

}
