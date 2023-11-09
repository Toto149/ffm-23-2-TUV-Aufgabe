package org.example;

public class CarInspectionService {
    public static boolean has4Tires(Car car){
        return car.getNumberOfTires() == 4 ? true : false;
    }
    public static boolean hasSeatBelt(Car car){
        return car.isSeatBelt();
    }
}
