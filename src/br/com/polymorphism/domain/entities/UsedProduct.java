package br.com.polymorphism.domain.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private final static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final LocalDate manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = LocalDate.parse(manufactureDate,format);
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        return this.getName() + " (used) $ " + String.format("%.2f (Manufacture date: %s)", price, manufactureDate.toString());
    }
}
