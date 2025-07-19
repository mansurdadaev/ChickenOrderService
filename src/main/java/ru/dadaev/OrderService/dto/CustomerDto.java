package ru.dadaev.OrderService.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private String companyName;
    private String contactPerson;
    private String phone;
}
