package org.example.back.service;

import org.example.back.entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAll();

    void add(Expense expense);

    Expense addExpense(Expense expense);
}