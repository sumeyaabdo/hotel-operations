package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Reservation reservation = new Reservation("king", 3,true );

        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Total reservation will be $" + reservation.getReservationTotal());
    }
}
