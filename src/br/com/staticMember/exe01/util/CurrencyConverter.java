package br.com.staticMember.exe01.util;

public class CurrencyConverter {
    private static final double iofTax = 0.06;

    public static double converter(double price, double amount) {
        double aux = price * amount;

        return aux + (aux * iofTax);
    }
}
