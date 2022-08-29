package com.msa.coffee.order.domain.model;

import lombok.Data;

@Data
public class CoffeeOrderCVO {
    private String id;
    private String orderNumber;
    private String coffeeName;
    private String coffeeCount;
    private String customerName;
}
