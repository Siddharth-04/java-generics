package com.bridgelabz.flightScheduling.src;

class Flight<T>{
    private T flightNumber;
    public String departure;
    private String destination;

    public T getFLightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public Flight(T flightNumber,String departure,String destination){
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }
}



