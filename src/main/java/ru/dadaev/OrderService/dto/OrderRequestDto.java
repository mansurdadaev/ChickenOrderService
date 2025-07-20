package ru.dadaev.OrderService.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderRequestDto {
    private CustomerDto customer;
    private List<ItemDto> item;
    private DeliveryDto delivery;
    private String additionalRequirements;
    private LocalDateTime timestamp;
}
