package io.turntabl.vehicle;

import io.turntabl.owner.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Vehicle vehicle;
    Owner owner;
    @BeforeEach
    void setUp() {
        owner = new Owner(true,"GH-1890756");

        vehicle = new Car(owner,"XA-098-21",10,"009120");

    }

    @Test
    void testDefaultChargePerMonth() {
        assertEquals(vehicle.getBaseChargePerMonth(),10);
    }

    @Test
    void testCalcChargePerMonth(){
        assertEquals(vehicle.calcChargePerMonth(),20);
    }
}