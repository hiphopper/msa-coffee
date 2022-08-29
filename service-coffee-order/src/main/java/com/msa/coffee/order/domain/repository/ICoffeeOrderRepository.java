package com.msa.coffee.order.domain.repository;

import com.msa.coffee.order.domain.model.OrderEntity;

public interface ICoffeeOrderRepository {
    String coffeeOrderSave(OrderEntity orderEntity);
}
