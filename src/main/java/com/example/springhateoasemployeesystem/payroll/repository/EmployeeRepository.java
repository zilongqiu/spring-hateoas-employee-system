package com.example.springhateoasemployeesystem.payroll.repository;

import com.example.springhateoasemployeesystem.payroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
