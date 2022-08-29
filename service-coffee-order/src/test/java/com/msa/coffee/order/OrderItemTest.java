package com.msa.coffee.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    @Test
    public void message_test() {
        OrderItem item = new OrderItem();
        assertEquals("get Message", item.message());
    }
}