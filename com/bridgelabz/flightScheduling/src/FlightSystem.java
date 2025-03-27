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
