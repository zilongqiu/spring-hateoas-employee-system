package com.example.springhateoasemployeesystem.payroll.assembler;

import com.example.springhateoasemployeesystem.payroll.controller.EmployeeController;
import com.example.springhateoasemployeesystem.payroll.model.Employee;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class EmployeeModelAssembler {

    public EntityModel<Employee> toModel(Employee employee) {
        return EntityModel.of(employee,
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
}
