package br.com.staticMember.exe01;

import br.com.staticMember.exe01.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price, amount, result;

        System.out.print("What is the dollar price? ");
        price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        amount = sc.nextDouble();

        result = CurrencyConverter.converter(price, amount);

        System.out.printf("Amount to be paid in reais: R$ %.2f", result);
        sc.close();
    }
}
