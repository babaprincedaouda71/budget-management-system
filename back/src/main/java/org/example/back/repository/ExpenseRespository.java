package org.example.back.repository;

import org.example.back.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRespository extends JpaRepository<Expense, Long> {}