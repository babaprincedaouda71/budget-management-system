package org.example.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.back.enums.Category;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Category category;
    private String description;
    private Double amount;
}