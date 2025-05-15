package com.sandaru.crud_rest_api.repository;

import com.sandaru.crud_rest_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
