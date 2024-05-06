package br.com.interfaces.domain.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final LocalDate dueDate;
    private final double amount;

    public Installment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return dueDate.format(format) + " - " + String.format("%.2f", amount);
    }
}
