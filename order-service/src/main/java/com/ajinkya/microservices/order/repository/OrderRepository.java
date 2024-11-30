package com.ajinkya.microservices.order.repository;

import com.ajinkya.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
