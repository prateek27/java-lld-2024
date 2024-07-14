package OOPS_04.Vehicles;

public class Car implements Vehicle{

    Car(){
    }
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car has stopped");
    }
}
