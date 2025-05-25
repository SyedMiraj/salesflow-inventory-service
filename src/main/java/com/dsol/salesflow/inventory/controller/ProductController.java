package com.dsol.salesflow.inventory.controller;

import com.dsol.salesflow.asset.PagedResult;
import com.dsol.salesflow.inventory.model.Product;
import com.dsol.salesflow.inventory.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/inventory/api/v1/products/")
@Tag(name = "Product Controller",
        description = "product related api requests.")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<?> getCourses(
            @RequestParam(name = "asPage", required = false, defaultValue = "false") Boolean asPage,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "priceRangeFrom", required = false) BigDecimal priceRangeFrom,
            @RequestParam(name = "priceRangeTo", required = false) BigDecimal priceRangeTo) {
        if (asPage) {
            Pageable pageable = PageRequest.of(page, size);
            PagedResult<Product> productsAsPage = productService.findAllProducts(pageable, name, priceRangeFrom, priceRangeTo);
            return ResponseEntity.ok(productsAsPage);
        }
        List<Product> productsAsList = productService.findAllProduct(name, priceRangeFrom, priceRangeTo);
        return ResponseEntity.ok(productsAsList);
    }
}
