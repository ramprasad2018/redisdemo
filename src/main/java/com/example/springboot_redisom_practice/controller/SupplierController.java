package com.example.springboot_redisom_practice.controller;

import com.example.springboot_redisom_practice.model.Supplier;
import com.example.springboot_redisom_practice.service.SupplierService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis/suppliers")
@Tag(name = "Redis Suppliers", description = "Redis OM-based Supplier APIs")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping
    public Supplier save(@RequestBody Supplier supplier) {
        return supplierService.save(supplier);
    }

    @GetMapping
    public List<Supplier> getAll() {
        return supplierService.findAll();
    }
    
}
