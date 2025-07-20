package ru.dadaev.OrderService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
public class OrderResponseDto {
    private String status;
    private Long orderId;
}
