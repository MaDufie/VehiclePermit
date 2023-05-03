package io.turntabl.towncouncil;

import io.turntabl.owner.Person;
import io.turntabl.vehicle.Vehicle;

public interface VerificationService {
    boolean verifyPerson(Person p, Vehicle v);
}
