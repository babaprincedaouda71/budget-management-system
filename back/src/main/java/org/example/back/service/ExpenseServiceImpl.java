package org.example.back.service;

import jakarta.transaction.Transactional;
import org.example.back.entity.Expense;
import org.example.back.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class ExpenseServiceImpl implements ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<Expense> getAll() {
        return expenseRepository.findAll();
    }

    @Override
    public void add(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
}