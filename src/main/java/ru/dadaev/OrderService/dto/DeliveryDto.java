package ru.dadaev.OrderService.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class DeliveryDto {
    private String destination;
    private LocalDate deliveryDate;
    private String paymentTerms;
}
