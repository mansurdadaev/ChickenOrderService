package ru.dadaev.OrderService.domain;

import jakarta.persistence.*;
import lombok.Data;

@Embeddable
@Data
public class OrderItem {
    private Long productId;
    private Double requestedKg;
}


