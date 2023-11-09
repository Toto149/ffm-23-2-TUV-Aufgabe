package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {
    @Test
    void has4Tires_shouldReturnTrue_whenNumberOfTiresIs4(){
        //GIVEN
        int numberOfTires = 4;
        Car car = new Car(4,0,false,false);
        //WHEN
        boolean actual = CarInspectionService.has4Tires(car);
        //THEN
        assertTrue(actual);
    }
    @Test
    void has3Tires_shouldReturnFalse_whenNumberOfTiresIs3(){
        //GIVEN
        int numberOfTires = 3;
        Car car = new Car(numberOfTires, 0,false,false);
        //WHEN
        boolean actual = CarInspectionService.has4Tires(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void hasSeatBelt_shouldReturnTrue_whenSeatbeltIsTrue(){
        //GIVEN
        boolean seatbelt = true;
        Car car = new Car(4,0,true,false);
        //WHEN
        boolean actual = CarInspectionService.hasSeatBelt(car);
        //THEN
        assertTrue(actual);
    }
    @Test
    void hasSeatBelt_shouldReturnFalse_whenSeatbeltIsFalse(){
        //GIVEN
        boolean seatbelt = true;
        Car car = new Car(4,0,true,false);
        //WHEN
        boolean actual = CarInspectionService.hasSeatBelt(car);
        //THEN
        assertTrue(actual);
    }

}