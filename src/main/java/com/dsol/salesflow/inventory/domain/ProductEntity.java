package com.dsol.salesflow.inventory.domain;

import com.dsol.salesflow.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "PRODUCTS")
public class ProductEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCT")
    @SequenceGenerator(
            name = "SEQ_PRODUCT",
            allocationSize = 1,
            sequenceName = "SEQ_PRODUCT")
    private long id;
    private String name;
    private String description;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private SupplierEntity supplier;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;
}
