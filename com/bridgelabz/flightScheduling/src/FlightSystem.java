package com.bridgelabz.flightScheduling.src;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<String> flight1 = new Flight<>("101","10:00","Delhi");
        Flight<String> flight2 = new Flight<>("102","11:00","Kolkata");
        Flight<String> flight3 = new Flight<>("103","12:00","Hyderabad");
        FlightManager<String> flightManager = new FlightManager<>();
        flightManager.add(flight1);
        flightManager.add(flight2);
        flightManager.add(flight3);

        flightManager.remove(flight3);

        //display flights
        System.out.println("Flights ------");
        flightManager.displayFlights();

        //book flight
        flightManager.bookFlight("Siddharth","1001","Delhi","Hyderabad");
        flightManager.bookFlight("Ishaan","1001","Delhi","Hyderabad");
        flightManager.bookFlight("Sanjeev","1002","Delhi","Chandigarh");

        System.out.println("Bookings -----");
        flightManager.displayBookings();

        flightManager.cancelFlight("Sanjeev");

        System.out.println("Bookings after cancellation -----");
        flightManager.displayBookings();

    }
}
//Flights ------
//Departure : 10:00
//Flight Number : 101
//Destination : Delhi
//
//Departure : 11:00
//Flight Number : 102
//Destination : Kolkata
//
//Bookings -----
//Booking ID : 92
//Passenger Name : Siddharth
//Flight Number : 1001
//Source : Delhi
//Destination : Hyderabad
//
//Booking ID : 76
//Passenger Name : Ishaan
//Flight Number : 1001
//Source : Delhi
//Destination : Hyderabad
//
//Booking ID : 41
//Passenger Name : Sanjeev
//Flight Number : 1002
//Source : Delhi
//Destination : Chandigarh
//
//Bookings after cancellation -----
//Booking ID : 92
//Passenger Name : Siddharth
//Flight Number : 1001
//Source : Delhi
//Destination : Hyderabad
//
//Booking ID : 76
//Passenger Name : Ishaan
//Flight Number : 1001
//Source : Delhi
//Destination : Hyderabad