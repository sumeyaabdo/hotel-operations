package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

    }

    public double getReservationTotal(){
        return
        numberOfNights * getPrice();

    }

    public double getPrice(){
        double price;
        if (roomType.equals("king")) {
            price = 139.00;
        }
        else if (roomType.equals("double")){
            price = 124.00;
        } else {
            throw new IllegalArgumentException("Invalid room type");
        }
        if (weekend) {
            price = price * 1.10;
        }
        return price;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }


    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }
}