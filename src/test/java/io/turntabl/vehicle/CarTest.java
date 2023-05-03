package io.turntabl.vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Vehicle car;
    @BeforeEach
    void setUp() {
        car = new Car("GS-29-2u38", null);
    }

    @Test
    void calcChargePerMonth() {
        //arange
        //action
        //assert
        Assertions.assertEquals(20, car.calcChargePerMonth());
    }
}






