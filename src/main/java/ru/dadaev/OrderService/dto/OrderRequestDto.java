package ru.dadaev.OrderService.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public class OrderRequestDto {
    private UUID id;
    private CustomerDto customer;
    private ProductDto product;
    private DeliveryDto delivery;
    @JsonProperty("additional_requirements")
    private String additionalRequirements;
    private Instant timestamp;
}
