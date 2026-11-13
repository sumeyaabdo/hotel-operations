package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableRooms() {
        int availableRooms = numberOfRooms - bookedBasicRooms;
        return (availableRooms < 0) ? 0 : availableRooms;
    }
    public int getAvailableSuites() {
        int availableSuites = numberOfSuites - bookedSuites;
        return (availableSuites < 0) ? 0 : availableSuites;
    }


    public boolean bookRoom(int roomCount, boolean suite) {

        boolean booked = false;

        if (suite) {

            if (getAvailableSuites() >= roomCount) {
                this.bookedSuites += roomCount;
                booked = true;
            }

        } else {

            if (getAvailableRooms() >= roomCount) {
                this.bookedBasicRooms += roomCount;
                booked = true;
            }

        }

        return booked;
    }


}
