package io.turntabl.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LorryTest {
    private Vehicle lorry;
    @BeforeEach
    void setUp() {

    }

    @Test
    void CheckPriceForCapacityLessThan150(){
        //arange
        lorry = new Lorry("gha'kjs[oj", "n18", 102);

        //act
        //assert
        assertEquals(30.00, lorry.calcChargePerMonth());
    }

    @Test
    void CheckPriceForCapacityGreaterThan150(){
        //arange
        lorry = new Lorry("gha'kjs[oj", "n18", 910);

        //act
        //assert
        assertEquals(220.00, lorry.calcChargePerMonth());
    }

}