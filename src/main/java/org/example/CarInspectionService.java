package org.example;

public class CarInspectionService {
    public static boolean has4Tires(Car car){
        return car.getNumberOfTires() == 4;
    }
    public static boolean hasSeatBelt(Car car){
        return car.isSeatBelt();
    }

    public static boolean hasAirbag(Car car) {
        return car.isAirbag();
    }


    public static boolean has3Or5Doors(Car car) {
        if(car.getNumberOfDoors()==3 || car.getNumberOfDoors() ==5){
            return true;
        }
        return false;
    }
}
