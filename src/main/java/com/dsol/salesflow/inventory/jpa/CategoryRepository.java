package com.dsol.salesflow.inventory.jpa;

import com.dsol.salesflow.inventory.domain.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
