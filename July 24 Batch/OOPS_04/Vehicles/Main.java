package OOPS_04.Vehicles;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop(); //default interface method

        Vehicle.showCountry();//static method & variable example
        System.out.println(Vehicle.VEHICLE_COUNTRY);

        //Math Library
        //Utitity Classes like Collections, Arrays, Math have static methods
        // System.out.println(Math.max(10,20));
        // Collections.sort();

    }
}
