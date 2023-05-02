package io.turntabl.vehicle;

import io.turntabl.owner.Owner;

public class Lorry extends Vehicle{
    private double capacity;
    public Lorry(Owner registeredOwner, String numberPlate, double baseChargePerMonth, String permitNumber, double capacity) {
        super(registeredOwner, numberPlate, baseChargePerMonth, permitNumber);
        this.capacity = capacity;
    }

    @Override
    public double calcChargePerMonth() {
        if(capacity - 150 > 0){
             double difference = capacity - 150;
             double num = Math.ceil(difference/20.0);
            setBaseChargePerMonth(30.00 + (5*num));
        }else {
            setBaseChargePerMonth(30.00);
        }
        return getBaseChargePerMonth();
    }
}
