package io.turntabl.vehicle;

import io.turntabl.owner.Owner;

public class Motorbike extends Vehicle{
    private double capacity;
    public Motorbike(Owner registeredOwner, String numberPlate, double baseChargePerMonth, String permitNumber, double capacity) {
        super(registeredOwner, numberPlate, baseChargePerMonth, permitNumber);
        this.capacity = capacity;
    }

    @Override
    public double calcChargePerMonth() {
        if(capacity <= 850){
            setBaseChargePerMonth(7.00);

        }else{
            setBaseChargePerMonth(10);
        }
        return getBaseChargePerMonth();
    }
}
