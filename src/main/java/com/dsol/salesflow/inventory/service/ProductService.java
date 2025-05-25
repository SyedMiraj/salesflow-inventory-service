package com.dsol.salesflow.inventory.service;

import com.dsol.salesflow.asset.PagedResult;
import com.dsol.salesflow.inventory.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public PagedResult<Product> findAllProducts(Pageable pageable, String name, BigDecimal priceRangeFrom, BigDecimal priceRangeTo) {
        return null;
    }

    public List<Product> findAllProduct(String name, BigDecimal priceRangeFrom, BigDecimal priceRangeTo) {
        return Arrays.asList(
                new Product().setId(1).setName("Pen").setStock(1000).setBuyingPrice(BigDecimal.valueOf(20)).setSellingPrice(BigDecimal.valueOf(30)),
                new Product().setId(2).setName("Book").setStock(600).setBuyingPrice(BigDecimal.valueOf(120)).setSellingPrice(BigDecimal.valueOf(135)),
                new Product().setId(3).setName("Sticky Gam").setStock(100).setBuyingPrice(BigDecimal.valueOf(30)).setSellingPrice(BigDecimal.valueOf(45)),
                new Product().setId(4).setName("Stapler").setStock(20).setBuyingPrice(BigDecimal.valueOf(200)).setSellingPrice(BigDecimal.valueOf(250))
                );
    }
}
