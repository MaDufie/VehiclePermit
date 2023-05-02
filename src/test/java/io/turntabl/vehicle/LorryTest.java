package io.turntabl.vehicle;

import io.turntabl.owner.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class LorryTest {

    Owner owner;
    Vehicle lorry;
    Vehicle lorry2;
    @BeforeEach
    void setUp() {
        owner = new Owner(true, "GH-124093");
        lorry = new Lorry(owner, "AA-901-22",40,"0945",210);
        lorry2 = new Lorry(owner, "XA-1115",30,"4447",90);
    }

    @Test
    void testDefaultChargePerMonth() {
        assertEquals(40, lorry.getBaseChargePerMonth());
        assertEquals(30,lorry2.getBaseChargePerMonth());
        assertNotEquals(50,lorry2.getBaseChargePerMonth());
    }

    @Test
    void testCalcChargePerMonth(){
        assertEquals(45,lorry.calcChargePerMonth());
        assertEquals(30,lorry2.calcChargePerMonth());
    }
}