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
        Car car = new Car(4,0,seatbelt,false);
        //WHEN
        boolean actual = CarInspectionService.hasSeatBelt(car);
        //THEN
        assertTrue(actual);
    }
    @Test
    void hasSeatBelt_shouldReturnFalse_whenSeatbeltIsFalse(){
        //GIVEN
        boolean seatbelt = false;
        Car car = new Car(4,0,seatbelt,false);
        //WHEN
        boolean actual = CarInspectionService.hasSeatBelt(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void hasAirbag_shouldReturnTrue_whenAirbagIsTrue(){
        //GIVEN
        boolean airbag = true;
        Car car = new Car(4,0,false,airbag);
        //WHEN
        boolean actual = CarInspectionService.hasAirbag(car);
        //THEN
        assertTrue(actual);
    }
    @Test
    void hasAirbag_shouldReturnFalse_whenAirbagIsFalse(){
        //GIVEN
        boolean airbag = false;
        Car car = new Car(4,0,true,airbag);
        //WHEN
        boolean actual = CarInspectionService.hasAirbag(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void has3Or5Doos_shouldReturnTrue_whenAmountOfDoorsIs3(){
        //GIVEN
        int amountOfDoors = 3;
        Car car = new Car(4,amountOfDoors,true,true);
        //WHEN
        boolean actual = CarInspectionService.has3Or5Doors(car);
        //THEN
        assertTrue(actual);
    }
    void has3Or5Doos_shouldReturnTrue_whenAmountOfDoorsIs5(){
        //GIVEN
        int amountOfDoors = 5;
        Car car = new Car(4,amountOfDoors,true,true);
        //WHEN
        boolean actual = CarInspectionService.has3Or5Doors(car);
        //THEN
        assertTrue(actual);
    }
    void has3Or5Doos_shouldReturnFalse_whenAmountOfDoorsIs4(){
        //GIVEN
        int amountOfDoors = 4;
        Car car = new Car(4,amountOfDoors,true,true);
        //WHEN
        boolean actual = CarInspectionService.has3Or5Doors(car);
        //THEN
        assertFalse(actual);
    }

}