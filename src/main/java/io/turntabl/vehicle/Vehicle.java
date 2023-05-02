package io.turntabl.vehicle;

import io.turntabl.owner.Owner;

public abstract class Vehicle {
    private Owner registeredOwner;
    private String numberPlate;
    private double baseChargePerMonth;
    private String permitNumber;

    public Vehicle(Owner registeredOwner, String numberPlate, double baseChargePerMonth, String permitNumber) {
        this.registeredOwner = registeredOwner;
        this.numberPlate = numberPlate;
        this.baseChargePerMonth = baseChargePerMonth;
        this.permitNumber = permitNumber;
    }

    public double getBaseChargePerMonth() {
        return baseChargePerMonth;
    }

    public void setBaseChargePerMonth(double baseChargePerMonth) {
        this.baseChargePerMonth = baseChargePerMonth;
    }

    public abstract double calcChargePerMonth();

}
