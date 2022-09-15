package com.msa.coffee.order;

import com.msa.coffee.order.domain.TestEntity;
import com.msa.coffee.order.domain.repository.CoffeeOrderRepository;
import com.msa.coffee.order.domain.repository.ICoffeeOrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import({TestConfig.class, CoffeeOrderRepository.class})
class OrderItemTest {

    @Autowired
    ICoffeeOrderRepository repository;

    @Autowired
    TestEntityManager entityManager;


    @Test
    public void message_test() {
        entityManager.persist(new TestEntity(1L, "22"));

        String result = repository.coffeeOrderSave(null);

        OrderItem item = new OrderItem();
        assertEquals("get Message", item.message());

        assertEquals(result, "22");
    }
}