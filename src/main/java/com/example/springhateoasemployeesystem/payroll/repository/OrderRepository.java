package com.example.springhateoasemployeesystem.payroll.repository;

import com.example.springhateoasemployeesystem.payroll.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
