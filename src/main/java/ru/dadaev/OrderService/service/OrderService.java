package ru.dadaev.OrderService.service;

import org.springframework.stereotype.Service;
import ru.dadaev.OrderService.domain.Order;
import ru.dadaev.OrderService.dto.OrderRequestDto;
import ru.dadaev.OrderService.dto.OrderResponseDto;
import ru.dadaev.OrderService.repository.OrderRepository;

import java.time.Instant;
import java.util.UUID;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderResponseDto createOrder(OrderRequestDto request) {
        Order order = new Order();
        order.setId(request.getId() != null ? request.getId() : UUID.randomUUID());
        order.setStatus("accepted");
        order.setTimestamp(Instant.now());

        orderRepository.save(order);
        return new OrderResponseDto(order.getStatus(), order.getId());
    }
}
