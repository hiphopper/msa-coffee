package com.msa.coffee.order.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_entity")
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {
    @Id
    private Long id;

    private String name;
}