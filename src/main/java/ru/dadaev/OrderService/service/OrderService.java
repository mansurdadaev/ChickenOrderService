package ru.dadaev.OrderService.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dadaev.OrderService.domain.Order;
import ru.dadaev.OrderService.dto.OrderRequestDto;
import ru.dadaev.OrderService.dto.OrderResponseDto;
import ru.dadaev.OrderService.mapping.OrderMapper;
import ru.dadaev.OrderService.repository.OrderRepository;

import java.time.Instant;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public OrderResponseDto createOrder(OrderRequestDto request) {

        Order order = orderMapper.toEntity(request);

        orderRepository.save(order);

        return OrderResponseDto.builder()
                .orderId(order.getId())
                .build();
    }
}
