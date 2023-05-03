package io.turntabl.towncouncil;

import io.turntabl.exceptions.UserNotPermittedException;
import io.turntabl.owner.Person;
import io.turntabl.vehicle.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TownCouncilTest {

    @Mock
    VerificationService mockVerificationService;

    @Mock
    PermitIssuerService mockPermitIssuerService;

    private TownCouncil underTest;

    private Person person;

    private Vehicle bike;
    private Vehicle car;
    private Vehicle lorry;
    private Vehicle lorry2;
    private final String permitNumber = "permit223";



    @BeforeEach
    void setUp() {
        underTest = new TownCouncil(mockVerificationService, mockPermitIssuerService);
        person = new Person("GHA-111-0001");
        bike = new Motorbike("XA-009-2020", person,170);
        car = new Car("GS-8286-2013",person);
        lorry = new Lorry("GR-4001-2020", person, 260);
        lorry2 = new Lorry("GX-4001-2023", person, 190);


    }

    @Test
    void testIfThrowsUserNotPermittedException() {
        when(mockVerificationService.verifyPerson(person, bike)).thenReturn(false);

        assertThrows(UserNotPermittedException.class, () -> underTest.validateOwner(bike, person));
    }

    @Test
    void testPermitIfVehicleNotLorry() throws UserNotPermittedException {
        when(mockVerificationService.verifyPerson(person, car)).thenReturn(true);
        when(mockPermitIssuerService.issuePermit(car)).thenReturn(permitNumber);


        underTest.validateOwner(car, person);

        assertEquals(1, underTest.getVehicles().size());
    }

    @Test
    void testPermitIfVehicleIsLorry() throws UserNotPermittedException{
        when(mockVerificationService.verifyPerson(any(Person.class), any(Lorry.class))).thenReturn(true);

        underTest.validateOwner(lorry, person);
        underTest.validateOwner(lorry2, person);

        assertEquals(2, underTest.getVehicles().size());


    }
}