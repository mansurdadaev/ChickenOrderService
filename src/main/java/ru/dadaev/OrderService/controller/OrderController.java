package ru.dadaev.OrderService.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dadaev.OrderService.dto.OrderRequestDto;
import ru.dadaev.OrderService.dto.OrderResponseDto;

@RestController
@RequestMapping("/orders")
@Tag(name = "Orders", description = "Operations about chicken orders")
public class OrderController {

    @PostMapping
    @Operation(summary = "Create new order")
    public OrderResponseDto createOrder(@RequestBody OrderRequestDto request) {
        return new OrderResponseDto("accepted", request.getId());
    }
}
