package com.bridgelabz.flightScheduling.src;

import java.util.ArrayList;

public class Booking<T> {
    public static ArrayList<Booking<?>> bookings = new ArrayList<Booking<?>>();;

    int bookingID;
    T source;
    T destination;
    T flightNumber;
    T passengerName;

    Booking(T source, T destination,T flightNumber,T passengerName,int bookingID) {
        this.bookingID=bookingID;
        this.source = source;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
    }

    public static  ArrayList<Booking<?>> getBookings(){
        return bookings;
    }

    public void bookTicket() {
        this.bookingID = (int)(Math.random()*100)+1;
        Booking newTicket = new Booking(this.source,this.destination,this.flightNumber,this.passengerName,bookingID);
        bookings.add(newTicket);
    }


}
