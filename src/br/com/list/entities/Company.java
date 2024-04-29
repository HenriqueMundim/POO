package br.com.list.entities;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public Company() {}

    public void increaseSalary(int id, double percentage) {
        Employee employee = employees.stream().filter(em -> em.getId() == id).findFirst().orElse(null);

        if (employee == null) {
            System.out.println("Employee not found");
        } else {
            double totalIncrease = employee.getSalary() * percentage / 100.0;
            employee.setSalary(employee.getSalary() + totalIncrease);
        }
    }

    public void registerEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showAllEmployees() {
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
