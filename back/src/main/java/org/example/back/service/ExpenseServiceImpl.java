package org.example.back.service;

import jakarta.transaction.Transactional;
import org.example.back.entity.Expense;
import org.example.back.repository.ExpenseRespository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class ExpenseServiceImpl implements ExpenseService {
    private final ExpenseRespository expenseRespository;

    public ExpenseServiceImpl(ExpenseRespository expenseRespository) {
        this.expenseRespository = expenseRespository;
    }

    @Override
    public List<Expense> getAll() {
        return expenseRespository.findAll();
    }

    @Override
    public void add(Expense expense) {
        expenseRespository.save(expense);
    }

    @Override
    public Expense addExpense(Expense expense) {
        return expenseRespository.save(expense);
    }
}