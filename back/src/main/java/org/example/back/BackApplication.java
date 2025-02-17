package org.example.back;

import org.example.back.entity.Expense;
import org.example.back.enums.Category;
import org.example.back.service.ExpenseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ExpenseService expenseService) {
        return args -> {
            Expense expense = Expense.builder()
                    .category(Category.Alimentation)
                    .description("Yaourt chergui")
                    .amount(5.0)
                    .build();

            expenseService.add(expense);
        };
    }

}