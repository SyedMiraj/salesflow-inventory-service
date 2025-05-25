package com.dsol.salesflow.inventory.jpa;

import com.dsol.salesflow.inventory.domain.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Long> {
}
