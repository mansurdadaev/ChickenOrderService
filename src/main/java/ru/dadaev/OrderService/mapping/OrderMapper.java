package ru.dadaev.OrderService.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.dadaev.OrderService.domain.Customer;
import ru.dadaev.OrderService.domain.DeliveryInfo;
import ru.dadaev.OrderService.domain.Order;
import ru.dadaev.OrderService.domain.OrderItem;
import ru.dadaev.OrderService.dto.CustomerDto;
import ru.dadaev.OrderService.dto.DeliveryDto;
import ru.dadaev.OrderService.dto.ItemDto;
import ru.dadaev.OrderService.dto.OrderRequestDto;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(source = "customer", target = "customer")
    @Mapping(source = "item", target = "items")
    @Mapping(source = "delivery", target = "delivery")
    @Mapping(source = "additionalRequirements", target = "additionalRequirements")
    @Mapping(source = "timestamp", target = "createdAt")
    Order toEntity(OrderRequestDto dto);

    Customer toEntity(CustomerDto dto);

    DeliveryInfo toEntity(DeliveryDto dto);

    OrderItem toEntity(ItemDto dto);
}

