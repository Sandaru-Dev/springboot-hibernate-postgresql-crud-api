package com.sandaru.crud_rest_api.service.impl;

import com.sandaru.crud_rest_api.dto.EmployeeDto;
import com.sandaru.crud_rest_api.entity.Employee;
import com.sandaru.crud_rest_api.mapper.EmployeeMapper;
import com.sandaru.crud_rest_api.repository.EmployeeRepository;
import com.sandaru.crud_rest_api.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository; //database

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployeeEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
