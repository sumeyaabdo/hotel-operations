package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Create hotel room, reservation, and employee objects
        Room dirtyRoom = new Room(5, 500,true, true );
        Reservation reservation = new Reservation("king", 3,true );
        Employee employee = new Employee("E101", "John", "Front Desk", 20.00, 45);
        Hotel hotel = new Hotel("Sky Hotel", 10, 20);

        // Test for Hotel
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Basic Rooms: " + hotel.getAvailableRooms());

        hotel.bookRoom(3, true);

        System.out.println("Available Suites After Booking: " + hotel.getAvailableSuites());

        hotel.bookRoom(5, false);

        System.out.println("Available Basic Rooms After Booking: " + hotel.getAvailableRooms());

        boolean bookingResult = hotel.bookRoom(20, true);

        System.out.println("Booking Successful: " + bookingResult);

        // Test room availability
        if(dirtyRoom.isAvailable()){
            System.out.println("Room is available");
        }else{
            System.out.println("Room is not available");
        }

        System.out.println();

        // Test reservation price and total
        System.out.println("Price per night: $" + reservation.getPrice());

        System.out.println("Total reservation will be $" + reservation.getReservationTotal());

        System.out.println();

        // Test employee punch in and punch out
        employee.punchIn(8);
        employee.punchOut(16);

        // Display employee hours and pay
        System.out.println("Employee: " + employee.getName());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
        System.out.printf("Total Pay: $%.2f%n", employee.getTotalPay());

        System.out.println("Hours Worked " + employee.getHoursWorked());
    }
}
