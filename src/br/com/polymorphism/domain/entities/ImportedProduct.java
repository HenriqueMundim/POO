package br.com.polymorphism.domain.entities;

public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return this.getName() + " $ " + String.format("%.2f (Customs fee: $ %.2f", price, customsFee);
    }
}
