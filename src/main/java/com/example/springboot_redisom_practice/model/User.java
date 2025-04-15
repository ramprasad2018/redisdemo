package com.example.springboot_redisom_practice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")  // ✅ rename the table to avoid reserved word
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
