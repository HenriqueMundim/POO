package br.com.exception;

import br.com.exception.domain.entities.Account;
import br.com.exception.domain.entities.Client;
import br.com.exception.domain.errors.EnoughBalanceException;
import br.com.exception.domain.errors.WithdrawLimitException;

import java.util.Locale;
import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        try {
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();

            Account account = new Account(number, new Client(name), balance, limit);

            System.out.print("Enter amount for withdraw: ");
            double amountWithdraw = sc.nextDouble();

            account.withdraw(amountWithdraw);
        }
        catch (WithdrawLimitException | EnoughBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}
