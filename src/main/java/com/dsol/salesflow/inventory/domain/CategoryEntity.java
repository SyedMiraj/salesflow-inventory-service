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
@Table(name = "CATEGORIES")
public class CategoryEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATEGORY")
    @SequenceGenerator(
            name = "SEQ_CATEGORY",
            allocationSize = 1,
            sequenceName = "SEQ_CATEGORY")
    private long id;
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductEntity> productEntities;
}
