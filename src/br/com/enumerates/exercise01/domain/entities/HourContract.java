package br.com.enumerates.exercise01.domain.entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private double valuePerHour;
    private int hours;

    public HourContract(String date, double valuePerHour, int hours) {
        setDate(date);
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }
}
