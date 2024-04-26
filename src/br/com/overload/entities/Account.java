package br.com.overload.entities;

public class Account {
    private String numberAccount;
    public String name;
    private double balance;

    public Account(String numberAccount, String name, double balance) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = balance;
    }

    public Account(String numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = 0;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double value) {
        if (value > 0) {
            balance += value;
        }
    }

    public void credit(double value) {
        if (value > 0 && value < balance) {
            balance -= value;
        } else {
            System.out.println("insufficient balance");
        }
    }

    public String toString() {
        return String.format("Account %s, Holder: %s, Balance: $ %.2f", numberAccount, name, balance);
    }
}
