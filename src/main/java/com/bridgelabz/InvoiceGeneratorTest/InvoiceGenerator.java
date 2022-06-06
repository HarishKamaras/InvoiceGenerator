package com.bridgelabz.InvoiceGeneratorTest;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUMFARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare= distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if(totalFare< MINIMUMFARE){
            return MINIMUMFARE;
        }
        return totalFare;
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare=0;
        for (Ride ride:rides) {
            totalFare += this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummary(rides.length,totalFare);
    }

    /*public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare=0;
        for (Ride ride:rides) {
            totalFare += this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummary(rides.length,totalFare);
    }*/
}
