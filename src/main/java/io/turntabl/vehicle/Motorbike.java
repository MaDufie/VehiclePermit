package io.turntabl.vehicle;

import io.turntabl.owner.Person;

public class Motorbike extends Vehicle{
    private final double capacity;
    private double charge;

    public Motorbike(String numberPlate, Person person, double capacity) {
        super(numberPlate, person, VehicleType.MOTORBIKE);
        this.capacity = capacity;
    }

    @Override
    public double calcChargePerMonth() {
        if(capacity <= 850) charge = 7.00;
        else charge = 10;
        return charge;
    }


}
