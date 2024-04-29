package br.com.list.application;

import br.com.list.entities.Company;
import br.com.list.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Company company = new Company();
        int numberOfEmployees;
        System.out.print("How many employees will be registered? ");
        numberOfEmployees = sc.nextInt();


        for (int i = 1; i <= numberOfEmployees; i++) {
            sc.nextLine();
            System.out.printf("Employee #%d:\n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee newEmployee = new Employee(id, name, salary);
            company.registerEmployee(newEmployee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        company.increaseSalary(id, percentage);
        company.showAllEmployees();
        sc.close();
    }
}
