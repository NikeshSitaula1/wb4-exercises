package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice(){
        return price;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public boolean isDirty(){
        return dirty;
    }

    public boolean isAvailable(){
        return (!this.isDirty() && !this.isOccupied());
    }


    public void checkIn() {
        if (!isOccupied() && !isDirty()){
            this.occupied = true;
            this.dirty = true;
            System.out.println("Checked In");
        }
        else{
            System.out.println("You cannot check into this room!  Someone is already in it, or it's still dirty");
        }
    }


    public void checkOut() {
        if (isOccupied()) {
            this.occupied = false;
            System.out.println("Checked Out");
        }
        else {
            System.out.println("Some problems with Checking Out");
        }
    }

    public void cleanRoom(){
        if(isDirty()){
            this.dirty = false;
            System.out.println("Room has been cleaned");
        }
    }
}
