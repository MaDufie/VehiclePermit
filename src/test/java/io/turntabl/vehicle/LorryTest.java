package io.turntabl.vehicle;

import io.turntabl.owner.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LorryTest {
    private Vehicle lorry;
    private Person person;
    @BeforeEach
    void setUp() {
        person = new Person("GHA-0001-0987");
    }

    @Test
    void CheckPriceForCapacityLessThan150(){
        //arrange
        lorry = new Lorry("gha'kjs[oj", person, 102);

        //act
        //assert
        assertEquals(30.00, lorry.calcChargePerMonth());
    }

    @Test
    void CheckPriceForCapacityGreaterThan150(){
        //arrange
        lorry = new Lorry("gha'kjs[oj", person, 910);

        //act
        //assert
        assertEquals(220.00, lorry.calcChargePerMonth());
    }

}