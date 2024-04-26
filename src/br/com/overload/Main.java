package br.com.overload;

import br.com.overload.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
        String accountNumber, name;
        System.out.print("Enter account number: ");
        accountNumber = sc.next();
        System.out.print("Enter account holder: ");
        name = sc.next();

        System.out.print("Is there a initial deposit (y/n)? ");
        char choice = sc.next().charAt(0);

        if (choice == 'y') {
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            account = new Account(accountNumber, name, value);
        } else {
            account = new Account(accountNumber, name);
        }
    }
}
