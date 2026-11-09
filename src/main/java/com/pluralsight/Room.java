package com.pluralsight;

public class Room {
    private int getNumberOfBeds;
    private double getPrice;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public boolean isAvailable() {
        if(dirty == false && occupied == false) {
            return true;
        }
        return false;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public int getGetNumberOfBeds() {
        return getNumberOfBeds;
    }
}
