package OOPS_04.Vehicles;

public interface Vehicle {
    //Interface Variables (public,static,final)
    int MAX_SPEED = 130;
    String VEHICLE_COUNTRY = "India";

    //abstract method
    void start();

    //default methods
    default void stop(){
        System.out.println("Vehicle has stopped!");
    }

    static void showCountry(){
        System.out.println(VEHICLE_COUNTRY);
    }

}
