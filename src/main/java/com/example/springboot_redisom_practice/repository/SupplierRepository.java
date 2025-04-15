package com.example.springboot_redisom_practice.repository;

import com.example.springboot_redisom_practice.model.Supplier;
import com.redis.om.spring.repository.RedisDocumentRepository;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
public interface SupplierRepository extends RedisDocumentRepository<Supplier, String> {
    
}
