package ru.dadaev.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dadaev.OrderService.domain.Order;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
