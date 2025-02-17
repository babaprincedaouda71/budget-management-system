package org.example.back.web;

import org.example.back.entity.Expense;
import org.example.back.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("expense")
public class ExpenseWeb {
    private final ExpenseService expenseService;

    public ExpenseWeb(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/all")
    public List<Expense> getAll() {
        return expenseService.getAll();
    }

    @PostMapping("/add")
    public Expense add(@RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }
}