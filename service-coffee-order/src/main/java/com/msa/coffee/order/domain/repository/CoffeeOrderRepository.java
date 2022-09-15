package com.msa.coffee.order.domain.repository;

import com.msa.coffee.order.domain.QTestEntity;
import com.msa.coffee.order.domain.model.OrderEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CoffeeOrderRepository implements ICoffeeOrderRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public String coffeeOrderSave(OrderEntity orderEntity) {
        return jpaQueryFactory.from(QTestEntity.testEntity)
                .select(QTestEntity.testEntity.name)
                .fetchOne();
    }
}
