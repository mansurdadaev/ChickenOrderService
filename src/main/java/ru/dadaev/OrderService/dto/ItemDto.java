package ru.dadaev.OrderService.dto;

import lombok.Data;
import java.util.List;

@Data
public class ItemDto {
    private String type;
    private double quantityKg;
    private int packaging;
}
