package io.turntabl.vehicle;

import io.turntabl.owner.Person;

public class Car extends Vehicle{
    private static final double charge = 20;

    public Car(String numberPlate, Person person) {
        super(numberPlate, person,VehicleType.CAR);
    }

    @Override
    public double calcChargePerMonth() {
        return charge * getRegisteredPersons().size();
    }


}
