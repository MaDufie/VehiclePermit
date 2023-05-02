package io.turntabl.towncouncil;

import io.turntabl.owner.Owner;
import io.turntabl.vehicle.Vehicle;

import java.util.*;

public class TownCouncil {
    private List<Vehicle> vehicles;
    private List<Owner> registeredUsers;

    private Map<String, Integer> vehiclesWithPermit;

    public TownCouncil() {
        this.vehicles = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
        this.vehiclesWithPermit = new HashMap<>();
    }

    public String issuePermit(Owner owner, Vehicle vehicle) throws ParkingPermissionDeniedException{
        Random rd = new Random();
        rd.nextInt(1, 100);
        String permitNumber = "permitIssued2023" + rd;
        if (registeredUsers.contains(owner.getNationalID())) {
            if(vehiclesWithPermit.containsKey(vehicle.toString()))
            vehiclesWithPermit.put(vehicle.toString(), );
            return permitNumber;
        } else {
            throw new ParkingPermissionDeniedException("Sorry but you are not the registered owner");
        }
    }
}
