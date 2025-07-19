package ru.dadaev.OrderService.dto;

import lombok.Data;
import java.util.List;

@Data
public class ProductDto {
    private String type;
    private String cut;
    private double quantityKg;
    private int packaging;
    private List<String> qualityStandards;
}
