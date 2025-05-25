package com.dsol.salesflow.inventory.domain;

import com.dsol.salesflow.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "SUPPLIERS")
public class SupplierEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCT")
    @SequenceGenerator(
            name = "SEQ_PRODUCT",
            allocationSize = 1,
            sequenceName = "SEQ_PRODUCT")
    private long id;
    private String name;
    private String address;
    private String phone;
    private String shopName;
    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductEntity> productEntities;
}
