package br.com.interfaces.domain.entities;

import java.time.LocalDate;

public class Installment {
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
        return dueDate.toString() + " - " + String.format("%.2f", amount);
    }
}
