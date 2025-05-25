package com.dsol.salesflow.inventory.jpa;

import com.dsol.salesflow.inventory.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
