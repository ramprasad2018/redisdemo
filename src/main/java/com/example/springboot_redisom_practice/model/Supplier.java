package com.example.springboot_redisom_practice.model;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Searchable;
import lombok.*;
import org.springframework.data.annotation.Id;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {

    @Id
    private String id;

    @Searchable
    private String name;

    @Searchable
    private String contactPerson;

    @Searchable
    private String mobile;

    @Searchable
    private String email;
}