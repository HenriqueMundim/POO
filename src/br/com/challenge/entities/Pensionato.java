package br.com.challenge.entities;

public class Pensionato {
    private Room[] rooms = new Room[10];

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(int roomNumber, Guest guest) {
        this.rooms[roomNumber] = new Room(guest);
    }

    public void showAllBusyRooms() {
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.printf("%d: %s\n", i, rooms[i].getGuest());
            }
        }
    }

}
