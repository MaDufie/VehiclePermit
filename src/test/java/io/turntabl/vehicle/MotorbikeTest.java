package io.turntabl.vehicle;

import io.turntabl.owner.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorbikeTest {
    private Vehicle bike;
    private Person person;
    @BeforeEach
    void setUp() {
        person = new Person("GHA-0001-0987");
    }

    @Test
    void checkChargeIfLessThan850() {
        //arrange
        bike = new Motorbike("GK-00-5680", person, 80);

        //act
        //assert
        assertEquals(7, bike.calcChargePerMonth());
    }

    @Test
    void checkChargeIfGreaterThan850() {
        //arrange
        bike = new Motorbike("GK-00-5680", person, 980);

        //act
        //assert
        assertEquals(10, bike.calcChargePerMonth());
    }
}