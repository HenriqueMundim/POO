package br.com.challenge.entities;

public class Room {
    private Guest guest;

    public Room(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
