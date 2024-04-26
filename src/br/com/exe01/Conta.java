package br.com.exe01;

public class Conta {
    final String number;
    private double balance;

    public Conta(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public void debit(float value) {
        if (balance > value) {
            balance -= value;
        }
    }

    public void credit(float value) {
        balance += value;
    }
}
