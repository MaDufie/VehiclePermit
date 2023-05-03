package io.turntabl.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorbikeTest {
    private Vehicle bike;
    @BeforeEach
    void setUp() {
    }

    @Test
    void checkChargeIfLessThan850() {
        //arrange
        bike = new Motorbike("GK-00-5680", "26", 80);

        //act
        //assert
        assertEquals(7, bike.calcChargePerMonth());
    }

    @Test
    void checkChargeIfGreaterThan850() {
        //arrange
        bike = new Motorbike("GK-00-5680", "26", 980);

        //act
        //assert
        assertEquals(10, bike.calcChargePerMonth());
    }
}