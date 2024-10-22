package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public double getPrice() throws Exception {
        double king = 139.0;
        double doubleBed = 124.0;

        if (this.roomType.equalsIgnoreCase("king")) {
            return king;
        }

        else if (this.roomType.equalsIgnoreCase("double")) {
            return doubleBed;
        }
        else {
            throw new Exception("Invalid Room Type");
        }
    }

    public int getNumberOfNights(){
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend(){
        return weekend;
    }

    public void setIsWeekend(boolean weekend){
        this.weekend = weekend;
    }

    public double getReservationTotal() throws Exception {

        if(this.isWeekend()){
            return (((this.getPrice()*0.10) + this.getPrice()) * this.getNumberOfNights());

        }else{
            return this.getPrice() * this.getNumberOfNights();
        }
    }
}
