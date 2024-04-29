package br.com.challenge.application;

import br.com.challenge.entities.Guest;
import br.com.challenge.entities.Pensionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pensionato pensionato = new Pensionato();
        int numberOfReservations;

        System.out.print("How many rooms will be rented? ");
        numberOfReservations = sc.nextInt();

        for (int i = 1; i <= numberOfReservations; i++) {
            sc.nextLine();
            System.out.println("Rent #" + i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            Guest guest = new Guest(name, email);
            pensionato.setRooms(room, guest);
        }

        pensionato.showAllBusyRooms();
        sc.close();
    }
}
