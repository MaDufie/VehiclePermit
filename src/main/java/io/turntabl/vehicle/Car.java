package io.turntabl.vehicle;

import io.turntabl.owner.Owner;

public class Car extends Vehicle{


    public Car(Owner registeredOwner, String numberPlate, double baseChargePerMonth, String permitNumber) {
        super(registeredOwner, numberPlate, baseChargePerMonth, permitNumber);
    }


    @Override
    public double calcChargePerMonth() {
       setBaseChargePerMonth(20.00);
        return getBaseChargePerMonth();
    }
}
