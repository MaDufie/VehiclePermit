package io.turntabl.vehicle;

import io.turntabl.exceptions.UserAlreadyExistsException;
import io.turntabl.owner.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {
    private Vehicle car;

    private Person person;
    private Person person2;
    private Person person3;


    @BeforeEach
    void setUp() {
        person = new Person("GHA-0001-0987");
        person2 = new Person("GHA-001-0987");
        person3 = new Person("GHA-001-09874");
        car = new Car("GS-29-2u38", person);
    }

    @Test
    void calcChargePerMonth() throws UserAlreadyExistsException {
            car.addRegisteredPersons(person2);
            car.addRegisteredPersons(person3);

        //action
        //assert
        Assertions.assertEquals(60.0,car.calcChargePerMonth());
    }
}






