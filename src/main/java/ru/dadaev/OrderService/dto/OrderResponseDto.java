package ru.dadaev.OrderService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class OrderResponseDto {
    private String status;
    private UUID orderId;
}
