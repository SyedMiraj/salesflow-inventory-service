package com.dsol.salesflow.inventory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Getter
@Setter
@Accessors(chain = true)
public class Product {
    private long id;
    private String name;
    private String description;
    private int stock;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;
}
