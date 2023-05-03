package io.turntabl.vehicle;

import io.turntabl.owner.Person;
import io.turntabl.exceptions.UserAlreadyExistsException;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private final ArrayList<Person> registeredPersons = new ArrayList<>();
    private final String numberPlate;
    private final VehicleType vehicleType;
    private String permitNumber;


    public Vehicle(String numberPlate, Person person, VehicleType vehicleType) {
        this.numberPlate = numberPlate;
        registeredPersons.add(person);
        this.vehicleType = vehicleType;

    }

    public void addRegisteredPersons(Person newPerson) throws  UserAlreadyExistsException {

            if(registeredPersons.contains(newPerson)){
                throw new UserAlreadyExistsException("User already exists!");
            }else{
                registeredPersons.add(newPerson);
            }
    }

    public abstract double calcChargePerMonth();

    public List<Person> getRegisteredPersons() {
        return registeredPersons;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }
}


