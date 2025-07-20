package ru.dadaev.OrderService.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDate;

@Embeddable
@Data
public class DeliveryInfo {
    private LocalDate deliveryDate;
    private String timeSlot;
}
