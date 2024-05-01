package br.com.enumerates.exercise01.domain.entities;

import br.com.enumerates.exercise01.domain.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private double baseSalary;
    private WorkerLevel level;
    private Department department;

    private final List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, double baseSalary, WorkerLevel level, Department department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double income = baseSalary;
        for (HourContract contract : contracts) {
            if (contract.getDate().getYear() == year && contract.getDate().getMonthValue() == month) {
                income += contract.totalValue();
            }
        }
        return income;
    }
}
