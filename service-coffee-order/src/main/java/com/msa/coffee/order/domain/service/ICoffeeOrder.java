package com.msa.coffee.order.domain.service;

import com.msa.coffee.order.domain.model.CoffeeOrderCVO;

public interface ICoffeeOrder {
    String coffeeOrder(CoffeeOrderCVO coffeeOrderCVO);
}
