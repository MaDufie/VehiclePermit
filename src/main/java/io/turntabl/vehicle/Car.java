package io.turntabl.vehicle;

public class Car extends Vehicle{
    private final double charge = 20;
    public Car(String numberPlate, String permitNumber) {
        super(numberPlate, permitNumber);
    }

    @Override
    public double calcChargePerMonth() {
        return charge;
    }

    @Override
    public String toString() {
        return "Car";
    }
}
