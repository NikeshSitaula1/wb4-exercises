package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuits;
    private int bookedBasicRooms;


    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuits = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms,
                 int bookedSuits, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuits = bookedSuits;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){

        if(isSuite){
            if(numberOfRooms > getAvailableRooms()){
                return false;
            }
            else {
                bookedSuits += numberOfRooms;
                return true;
            }
        }
        else //not a suite
        {
            if (numberOfRooms > getAvailableRooms()){
                return false;
            }
            else //we have the space
            {
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuits;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }
}
