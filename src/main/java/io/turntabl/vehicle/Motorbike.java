package io.turntabl.vehicle;

import io.turntabl.owner.Owner;

public class Motorbike extends Vehicle{
    private final double capacity;
    private double charge;

    public Motorbike(String numberPlate, String permitNumber, double capacity) {
        super(numberPlate, permitNumber);
        this.capacity = capacity;
    }

    @Override
    public double calcChargePerMonth() {
        if(capacity <= 850) charge = 7.00;
        else charge = 10;
        return charge;
    }

    @Override
    public String toString() {
        return "Bike";
    }
}
