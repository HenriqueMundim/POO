package br.com.polymorphism;

import br.com.polymorphism.domain.entities.ImportedProduct;
import br.com.polymorphism.domain.entities.Product;
import br.com.polymorphism.domain.entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StoreApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<Product>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.printf("Product #%d data:\n", i);
            System.out.print("Commom, used or imported (c/u/i)? ");
            char option = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (option == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, fee));
            } else if (option == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();
                products.add(new UsedProduct(name, price, date));
            } else {
                products.add(new Product(name, price));
            }
        }

        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
