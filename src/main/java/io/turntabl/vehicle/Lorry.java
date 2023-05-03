package io.turntabl.vehicle;

import io.turntabl.owner.Owner;

public class Lorry extends Vehicle{
    private final double capacity;
    private double charge;

    public Lorry(String numberPlate, String permitNumber, double capacity) {
        super(numberPlate, permitNumber);
        this.capacity = capacity;
    }

    @Override
    public double calcChargePerMonth() {
        if(capacity - 150 > 0){
             double difference = capacity - 150;
             double num = Math.ceil(difference/20.0);
            charge = 30.00 + (5*num);
        }else {
            charge = 30.00;
        }
        return charge;
    }

    @Override
    public String toString() {
        return "Lorry";
    }
}
