package ru.dadaev.OrderService.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dadaev.OrderService.dto.OrderRequestDto;
import ru.dadaev.OrderService.dto.OrderResponseDto;
import ru.dadaev.OrderService.service.OrderService;

@RestController
@RequestMapping("/orders")
@Tag(name = "Orders", description = "Operations about chicken orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @Operation(summary = "Create new order")
    public OrderResponseDto createOrder(@RequestBody OrderRequestDto request) {
        return orderService.createOrder(request);
    }
}
