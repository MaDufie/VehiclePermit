package io.turntabl.towncouncil;

import io.turntabl.exceptions.UserNotPermittedException;
import io.turntabl.owner.Person;
import io.turntabl.vehicle.Vehicle;
import io.turntabl.vehicle.VehicleType;

import java.util.*;

public class TownCouncil {
    private final Set<Vehicle> vehicles;
    private VerificationService verificationService;
    private PermitIssuerService permitIssuerService;

    public TownCouncil(VerificationService verificationService, PermitIssuerService permitIssuerService) {
        this.permitIssuerService = permitIssuerService;
        this.verificationService = verificationService;
        this.vehicles = new HashSet<>();

    }

    public void validateOwner(Vehicle vehicle, Person person) throws UserNotPermittedException {
        if (verificationService.verifyPerson(person, vehicle)) {
            if (vehicle.getVehicleType().equals(VehicleType.LORRY)) {
                issuePermit(vehicle);
            } else {
                vehicle.setPermitNumber(permitIssuerService.issuePermit(vehicle));
                vehicles.add(vehicle);

            }
        }else{
            throw new UserNotPermittedException("Denied permission!");
        }
    }

    private void issuePermit(Vehicle vehicle){
        String permitNumber = "Permit" + vehicle.getNumberPlate();
        vehicle.setPermitNumber(permitNumber);

        vehicles.add(vehicle);
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }
}
