package io.turntabl.vehicle;

import io.turntabl.owner.Owner;

import java.util.List;

public abstract class Vehicle {
    private List<Owner> registeredOwners;
    private String numberPlate;
    private double baseChargePerMonth;
    private String permitNumber;

    public Vehicle(String numberPlate, String permitNumber) {

        this.numberPlate = numberPlate;
        this.permitNumber = permitNumber;

    }

    public abstract double calcChargePerMonth();

}
