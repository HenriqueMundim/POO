package br.com.exception.domain.entities;

import br.com.exception.domain.errors.EnoughBalanceException;
import br.com.exception.domain.errors.WithdrawLimitException;

public class Account {
    private int number;
    private Client holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, Client holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(double value) {
        if (value > withdrawLimit) {
            throw new WithdrawLimitException("The amount exceeds withdraw limit");
        }
        if (value > balance) {
            throw new EnoughBalanceException("Not enough balance");
        }
    }
}
