package br.com.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");

        int amountCurseA = sc.nextInt();
        for (int i = 0; i < amountCurseA; i++) {
            courseA.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        int amountCurseB = sc.nextInt();
        for (int i = 0; i < amountCurseB; i++) {
            courseB.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        int amountCurseC = sc.nextInt();
        for (int i = 0; i < amountCurseC; i++) {
            courseC.add(sc.nextInt());
        }

        Set<Integer> total = new HashSet<>(courseA);
        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
