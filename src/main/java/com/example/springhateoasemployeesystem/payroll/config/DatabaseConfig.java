package com.example.springhateoasemployeesystem.payroll.config;

import com.example.springhateoasemployeesystem.payroll.Status;
import com.example.springhateoasemployeesystem.payroll.model.Employee;
import com.example.springhateoasemployeesystem.payroll.model.Order;
import com.example.springhateoasemployeesystem.payroll.repository.EmployeeRepository;
import com.example.springhateoasemployeesystem.payroll.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DatabaseConfig {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository,
                                   OrderRepository orderRepository
    ) {
        return args -> {
            employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar"));
            employeeRepository.save(new Employee("Frodo", "Baggins", "thief"));

            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new Order("MacBook Pro", String.valueOf(Status.COMPLETED)));
            orderRepository.save(new Order("iPhone", String.valueOf(Status.IN_PROGRESS)));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });

        };
    }
}
