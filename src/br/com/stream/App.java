package br.com.stream;

import br.com.stream.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\henrique.matos\\IdeaProjects\\POO\\src\\br\\com\\stream\\example.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Employee> employees = new ArrayList<>();

            while (line != null) {
                String[] content = line.split(",");
                String name = content[0];
                String email = content[1];
                double salary = Double.parseDouble(content[2]);

                employees.add(new Employee(name, email, salary));
                line = br.readLine();
            }
            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();

            List<String> email = employees.stream().filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            email.forEach(System.out::println);

            double sum = employees.stream().filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
