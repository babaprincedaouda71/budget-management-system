package org.example.back.repository;

import org.assertj.core.api.Assertions;
import org.example.back.entity.Expense;
import org.example.back.enums.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ExpenseRepositoryTest {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Test
    public void ExpenseRepository_Save_Expense() {
        //Arrange
        Expense expense = Expense.builder()
                .category(Category.Alimentation)
                .description("test")
                .amount(4500d)
                .build();

        //Act
        Expense save = expenseRepository.save(expense);

        //Assert
        Assertions.assertThat(save).isNotNull();
        Assertions.assertThat(save.getId()).isGreaterThan(0);
    }
}