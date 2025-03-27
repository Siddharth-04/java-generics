package com.bridgelabz.flightScheduling.src;
import java.util.ArrayList;

public class FlightManager<T extends String> {
    private ArrayList<Flight<T>> flights = new ArrayList<>();

    public void add(Flight<T> flight) {
        flights.add(flight);
    }

    public void remove(Flight<T> flight) {
        flights.remove(flight);
    }

    public void displayFlights() {
        for (Flight<T> flight : flights) {
            System.out.println("Departure : " + flight.departure);
            System.out.println("Flight Number : "+flight.getFLightNumber());
            System.out.println("Destination : " + flight.getDestination());
            System.out.println();
        }
    }

    public void displayBookings() {
        ArrayList<Booking<?>> bookings = Booking.getBookings();

        for(Booking<?> booking : bookings){
            System.out.println("Booking ID : "+booking.bookingID);
            System.out.println("Passenger Name : " + booking.passengerName);
            System.out.println("Flight Number : " + booking.flightNumber);
            System.out.println("Source : "+booking.source);
            System.out.println("Destination : "+booking.destination + "\n");
        }
    }

    public void bookFlight(String passenger, String flightNumber, String source, String destination) {
        Booking<String> booking = new Booking<>(source,destination,flightNumber,passenger,-1);
        booking.bookTicket();
    }

    public void cancelFlight(String passenger) {
        ArrayList<Booking<?>> bookings = Booking.getBookings();

        for(Booking<?> booking : bookings) {
            if(booking.passengerName.equals(passenger)) {
                bookings.remove(booking);
                break;
            }
        }
    }

}

