package io.turntabl.towncouncil;

import io.turntabl.exceptions.UserNotPermittedException;
import io.turntabl.owner.Person;
import io.turntabl.vehicle.Vehicle;
import io.turntabl.vehicle.VehicleType;

import java.util.*;

public class TownCouncil {
    private final Set<Vehicle> vehicles;
    private final List<Person> registeredUsers;

    private final Map<VehicleType, String> vehiclesWithPermit;
    private VerificationService verificationService;
    private PermitIssuerService permitIssuerService;

    public TownCouncil(VerificationService verificationService, PermitIssuerService permitIssuerService) {
        this.permitIssuerService = permitIssuerService;
        this.verificationService = verificationService;
        this.vehicles = new HashSet<>();
        this.registeredUsers = new ArrayList<>();
        this.vehiclesWithPermit = new HashMap<>();
    }

    public void validateOwner(Vehicle vehicle, Person person) throws UserNotPermittedException {
        if (verificationService.verifyPerson(person, vehicle)) {
            if (vehicle.getVehicleType().equals(VehicleType.LORRY)) {
            //todo: create a custom issue permit and use here
            } else {
                vehicle.setPermitNumber(permitIssuerService.issuePermit(vehicle));
                vehiclesWithPermit.put(vehicle.getVehicleType(), vehicle.getPermitNumber());

            }
        }else{
            throw new UserNotPermittedException("Denied permission!");
        }
    }
}
